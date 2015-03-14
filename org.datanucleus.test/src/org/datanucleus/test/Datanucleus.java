package org.datanucleus.test;

import java.io.File;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.jdo.JDOEnhancer;
import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

import org.datanucleus.api.jdo.JDOTransaction;
import org.h2.engine.Constants;
import org.h2.tools.Backup;

public class Datanucleus {

	public static final String DRIVER_NAME = "org.h2.Driver";
	public static final String DATABASE_NAME = "test";

	private static final String BUNDLE_NAME = "org.datanucleus.api.jdo";
	private static final String PMF_CLASS_NAME = "org.datanucleus.api.jdo.JDOPersistenceManagerFactory";

	public static Map<String,Object> getJDOPropertiesMap() {
		
		Map<String,Object> map = new HashMap();

		try {
			map.put("javax.jdo.PersistenceManagerFactoryClass",PMF_CLASS_NAME);
			map.put("datanucleus.primaryClassLoader",Class.forName(DRIVER_NAME).getClassLoader());

			map.put("datanucleus.ConnectionDriverName",DRIVER_NAME);
			map.put("datanucleus.ConnectionURL","jdbc:h2:file:"+DATABASE_NAME+";DB_CLOSE_DELAY=1");
			map.put("datanucleus.ConnectionUserName","sa");
			map.put("datanucleus.ConnectionPassword","");
			map.put("datanucleus.autoCreateSchema","true");
			map.put("datanucleus.connectionPoolingType","dbcp-builtin");
			//map.put("datanucleus.connectionPoolingType","none");

			map.put("datanucleus.RestoreValues",true);
			/*
			 * Name of the type of Level 1 cache to use. Defines the backing map.
			 * See also Cache docs for JDO, and for JPA
			 * soft | weak | strong | {your-plugin-name}
			 *
			 * "soft" - uses a soft reference backing map.
			 *    If the map entry value object is not being actively used, then garbage collection
			 *    may garbage collect the reference, in which case the object is removed from the cache.
			 * "weak" - uses a weak reference backing map.
			 *    If JVM garbage collection clears the reference, then the object is removed from the cache.
			 *    This is the default Level 1 Cache
			 * "strong" - uses a normal HashMap backing.
			 *    With this option all references are strong meaning that objects stay in the cache
			 *    until they are explicitly removed by calling remove() on the cache.
			 */
			map.put("datanucleus.cache.level1.type","strong");

			/*
			 * Name of the type of Level 2 Cache to use. Can be used to interface with external caching products.
			 * Use "none" to turn off L2 caching. See also Cache docs for JDO, and for JPA
			 * none | soft | weak (datanucleus-core plugin)
			 * coherence | ehcache | ehcacheclassbased | oscache | swarmcache | javax.cache | memcache (datanucleus-cache plugin)
			 * {your-plugin-name}
			 *
			 * "none" - turn OFF Level 2 caching.
			 * "soft" - use the internal (soft reference based) L2 cache.
			 *    Provides support for the JDO 2 interface of being able to pin objects into the cache,
			 *    and unpin them when required. This option does not support distributed caching,
			 *    solely running within the JVM of the client application.
			 *    Soft references are held to non pinned objects.
			 * "weak" - use the internal (weak reference based) L2 cache.
			 *    Provides support for the JDO 2 interface of being able to pin objects into the cache,
			 *    and unpin them when required. This option does not support distributed caching,
			 *    solely running within the JVM of the client application.
			 *    Weak references are held to non pinned objects.
			 */
			map.put("datanucleus.cache.level2.type","none");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return map;
		
	}

	
	public static void datanucleusTest() {
		
		try{
			JDOEnhancer enhancer = JDOHelper.getEnhancer();
			enhancer.setVerbose(true);
			enhancer.addClasses(A.class.getName());
			enhancer.enhance();

			PersistenceManagerFactory pmf=JDOHelper.
					getPersistenceManagerFactory(getJDOPropertiesMap());
			System.out.println(pmf.getProperties());

			//STORE
			PersistenceManager pm=pmf.getPersistenceManager();
			JDOTransaction tx=(JDOTransaction)pm.currentTransaction();
			tx.begin();
			A row=new A("1", "ONE", "TWO");
			pm.makePersistent(row);
			tx.commit();
			System.out.println(row);
			
			//LOAD
			pm=pmf.getPersistenceManager();
			tx=(JDOTransaction)pm.currentTransaction();
			tx.begin();
			A user1=pm.getObjectById(A.class,"1");
			user1=pm.detachCopy(user1);
			tx.commit();

			//EDIT
			pm=pmf.getPersistenceManager();
			tx=(JDOTransaction)pm.currentTransaction();
			tx.begin();
			A user2=pm.getObjectById(A.class,"1");
			user2.setC1("XXX");
			user2.setC2("XXX");
			pm.makePersistent(user2);
			//level1.type MUST BE NONE to work!
			user1.setC2("YYY");
			pm.makePersistent(user1);
			tx.commit();

			//LOAD
			pm=pmf.getPersistenceManager();
			tx=(JDOTransaction)pm.currentTransaction();
			tx.begin();
			row=pm.getObjectById(A.class,"1");
			tx.commit();
			//RESULT SHOULD BE C1=XXX, C2=YYY
			System.out.println(row);

		}catch(Exception e){
			e.printStackTrace();
		}

	}
	

	public static void executeBackup() {

		File db=new File(DATABASE_NAME).getAbsoluteFile();
		
		try {
			Backup.execute(DATABASE_NAME+".zip",db.getParent(), db.getName(), false);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}
	

	public static void checkDNLock() {

		try{
			executeBackup();

			PersistenceManagerFactory pmf=JDOHelper.
					getPersistenceManagerFactory(getJDOPropertiesMap());
			System.out.println(pmf.getProperties());

			//check lock
			File lock=new File(DATABASE_NAME+Constants.SUFFIX_LOCK_FILE);
			while(!lock.exists()){
				System.out.println("WAITING FOR LOCK...");
				Thread.sleep(1000);
			}
			System.out.println("LOCKED!");

			//close connection
			System.out.println("CLOSED? "+pmf.isClosed());
			pmf.close();
			System.out.println("CLOSED? "+pmf.isClosed());

			executeBackup();

			//check lock
			while(lock.exists()){
				System.out.println("WAITING FOR LOCK...");
				Thread.sleep(1000);
			}
			System.out.println("UNLOCKED!");

		}catch(Exception e){
			e.printStackTrace();
		}

	}


	public static void checkH2Lock() {

		try{
			executeBackup();

			Class.forName(DRIVER_NAME);
			Connection conn = DriverManager.
					getConnection("jdbc:h2:"+DATABASE_NAME+";DB_CLOSE_DELAY=0", "sa", "");

			//check lock
			File lock=new File(DATABASE_NAME+Constants.SUFFIX_LOCK_FILE);
			while(!lock.exists()){
				System.out.println("WAITING FOR LOCK...");
				Thread.sleep(1000);
			}
			System.out.println("LOCKED!");

			//close connection
			System.out.println("CLOSED? "+conn.isClosed());
			conn.close();
			System.out.println("CLOSED? "+conn.isClosed());

			executeBackup();

			//check lock
			while(lock.exists()){
				System.out.println("WAITING FOR LOCK...");
				Thread.sleep(1000);
			}
			System.out.println("UNLOCKED!");

		}catch(Exception e){
			e.printStackTrace();
		}

	}


	public static void checkDrivers() {

		try{
			Enumeration<Driver> drivers=DriverManager.getDrivers();
			while(drivers.hasMoreElements()){
				System.out.println(drivers.nextElement());
			}

		}catch(Exception e){
			e.printStackTrace();
		}

	}

	
	public static void main(String[] argvs) {
		
		//checkDrivers();
		//checkH2Lock();
		//checkDNLock();
		datanucleusTest();

	}

	
}
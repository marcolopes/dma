package datanucleus.database;

import java.sql.DriverManager;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

import org.datanucleus.api.jdo.JDOTransaction;

import datanucleus.model.Users1;

public class Manager{

	public String DRIVER_NAME = "org.h2.Driver";
	public String DATABASE_NAME = "/colibri/dn3";

	private static final String BUNDLE_NAME = "org.datanucleus.api.jdo";
	private static final String PMF_CLASS_NAME = "org.datanucleus.api.jdo.JDOPersistenceManagerFactory";

	private final PersistenceManagerFactory pmf;

	public Manager(){
		this.pmf=initPFM();
	}


	private PersistenceManagerFactory initPFM(){

		try {
			Map<String,Object> map = new HashMap();

			map.put("javax.jdo.PersistenceManagerFactoryClass",PMF_CLASS_NAME);
			map.put("datanucleus.primaryClassLoader",Class.forName(DRIVER_NAME).getClassLoader());

			map.put("datanucleus.ConnectionDriverName",DRIVER_NAME);
			map.put("datanucleus.ConnectionURL","jdbc:h2:file:"+DATABASE_NAME+";DB_CLOSE_DELAY=10");
			map.put("datanucleus.ConnectionUserName","sa");
			map.put("datanucleus.ConnectionPassword","");
			map.put("datanucleus.autoCreateSchema","true");
			map.put("datanucleus.connectionPoolingType","dbcp-builtin");

			//drivers
			Enumeration drivers=DriverManager.getDrivers();
			while(drivers.hasMoreElements())
				System.out.println(drivers.nextElement());

			PersistenceManagerFactory pmf=JDOHelper.getPersistenceManagerFactory(map);
			System.out.println(pmf.getProperties());

			return pmf;

		}catch(Exception e){
			e.printStackTrace();
		}

		return null;

	}


	public void test(){

		try{
			PersistenceManager pm = pmf.getPersistenceManager();

			//store
			JDOTransaction tx=(JDOTransaction)pm.currentTransaction();
			tx.begin();
			Users1 user = new Users1( "1", "Projecto", "Colibri" );
			pm.makePersistent(user);
			tx.commit();

			System.out.println("Commit!");

		}catch(Exception e){
			e.printStackTrace();
		}

	}


}

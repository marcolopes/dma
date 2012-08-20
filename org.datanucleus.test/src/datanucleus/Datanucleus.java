package datanucleus;

import java.sql.DriverManager;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

public class Datanucleus {

	public static final String DRIVER_NAME = "org.h2.Driver";
	public static final String DATABASE_NAME = "/colibri/dn3";

	private static final String BUNDLE_NAME = "org.datanucleus.api.jdo";
	private static final String PMF_CLASS_NAME = "org.datanucleus.api.jdo.JDOPersistenceManagerFactory";

	private static PersistenceManagerFactory initPFM() {

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


	public static void main(String[] argvs){

		PersistenceManagerFactory pmf=initPFM();
		TableManager manager=new TableManager(pmf);
		manager.store();

	}


}

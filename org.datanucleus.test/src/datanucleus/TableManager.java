package datanucleus;

import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

import org.datanucleus.api.jdo.JDOTransaction;

public class TableManager{

	private final PersistenceManagerFactory pmf;

	public TableManager(PersistenceManagerFactory pmf){
		this.pmf=pmf;
	}


	public void store() {

		try{
			PersistenceManager pm = pmf.getPersistenceManager();

			//store
			JDOTransaction tx=(JDOTransaction)pm.currentTransaction();
			tx.begin();
			TableModel user = new TableModel( "1", "Projecto", "Colibri" );
			pm.makePersistent(user);
			tx.commit();

			System.out.println("Commit!");

		}catch(Exception e){
			e.printStackTrace();
		}

	}


}

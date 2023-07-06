package abstactDemo;



public class CustomerManager {
	
	
	
	//base sınıf bizim stratejimiz görevini görüyor
	
	BaseDatabaseManager databaseManager;
	
	public void getCustomer()
	{
		
		databaseManager.getData();
		
		
		
		
		
		
		//bunu kullanma oracle a bağımlı olursun
		//OrcaleDatabaseManager orcaleDatabaseManager=new OrcaleDatabaseManager();
		//orcaleDatabaseManager.getData();
		
		
	}

}

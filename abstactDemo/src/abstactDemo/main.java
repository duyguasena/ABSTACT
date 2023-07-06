package abstactDemo;

public class main {

	public static void main(String[] args) {
		
 
		CustomerManager customerManager=new CustomerManager();
		customerManager.databaseManager=new MySqlDatabaseManager();
		
		customerManager.getCustomer();
		
		
	}

}

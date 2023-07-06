package abstactClass;

public class main {

	public static void main(String[] args) {
		
		WomanGameCalculator womanGameCalculator=new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		

		//GameCalculator gameCalculator=new GameCalculator();//abstact sınıflar asla newlenmez
		GameCalculator gameCalculator=new WomanGameCalculator();
			
		
	}

}

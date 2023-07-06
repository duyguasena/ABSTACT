package abstactClass;

public abstract class GameCalculator {
	
	public abstract void hesapla();
	//operasyonu base de belirlemek istemiyorum kim inherit ediyorsa hesaplayı override etmek zorunda 
	//ve kendi kodunu yazmalı
	
	public final void gameOver()//override edilmesini istemiyorsak final kullan
	{
		System.out.println("Oyun bitti");
	}

}

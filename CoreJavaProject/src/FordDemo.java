
public class FordDemo {

	public static void main(String[] args) {
		
		FordFigo myCar = new FordFigo("white", 12345);
		myCar.unlockCar();
		myCar.accelerate();
		myCar.applyBrakes();
		myCar.lockCar();
		System.out.println("-----------------");
		FordFigoTitanium myCar2 = new FordFigoTitanium("black", 67895, 2);
		myCar2.unlockCar();
		myCar2.accelerate();
		myCar2.applyBrakes();
		myCar2.airBags();
		myCar2.lockCar();

		
		int a = 10;
		boolean flag = true;
		
		// println method is overloaded
		System.out.println(a);
		System.out.println(flag);
		
	}

}


public class FordFigoTitanium extends FordFigo{

	int bumper;
	
	
//	public FordFigoTitanium() {
//		super();
//	}

	public FordFigoTitanium(String color, int modelNo, int bumper) {
		super(color, modelNo);
		//super(); // attempt to call the default constructor of the super class
					// but it is not present
		
		this.bumper = bumper;
	}

	boolean airBags() {
		System.out.println("Airbags of Ford Figo Titanium");
		return true;
	}

	// applyBrakes of super class is overridden here
	@Override
	boolean applyBrakes() {
		// TODO Auto-generated method stub
		System.out.println("ABS brakes applied!");
		return true;
	}



	
	
	
}

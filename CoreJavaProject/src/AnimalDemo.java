
public class AnimalDemo {

	public static void main(String[] args) {
		
		//Animal animal = new Animal(); //  cannot create object of an abstract class
		
		Snake snake = new Snake();
		
		Dog dog = new Dog();
		
		// a super class reference variable can point to a sub class object
		Animal animal1 = new Snake();
		Animal animal2 = new Dog();
		
		animal1.breathe();
		animal1.mobile(); // exhibits runtime polymorphism through method overriding
		//animal1.kills();
		System.out.println("----------");
		Snake snake1 = (Snake)animal1; // downcasting super class ref variable to sub class ref variable
										// here the casting is explicit
		snake1.breathe();
		snake1.mobile();
		snake1.kills();
		
		Animal animal3 = snake1; // upcasting sub class ref variable to a super class ref variable
									// here the casting is implicit
		
		
	}

}

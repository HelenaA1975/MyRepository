package inheritance;

public class Horse extends Animal {
	public Horse() {
		System.out.println("Hello from the constructor in the Horse class.");
	}
	
	@override
	public void eat(){
		System.out.println("The horse eats.");
	}
	@override
	public void sleep(){
		System.out.println("The horse sleeps.");
	}
	@override
	public void makeSound(){
		System.out.println("The horse neighs.");
	}

}

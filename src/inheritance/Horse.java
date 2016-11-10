package inheritance;

public class Horse extends Animal {
	public Horse() {
		System.out.println("Hello from the constructor in the Horse class.");
	}
	
	@Override
	public void eat(){
		System.out.println("The horse eats.");
	}
	@Override
	public void sleep(){
		System.out.println("The horse sleeps.");
	}
	@Override
	public void makeSound(){
		System.out.println("The horse neighs.");
	}

}

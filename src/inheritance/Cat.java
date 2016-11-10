package inheritance;

public class Cat extends Animal {
	public Cat (){
		System.out.println("Hello from the constructor in the class Cat.");
	}
	
	@Override
	public void eat() {
		System.out.println("The cat eats.");
	}
	
	@Override
	public void sleep(){
		System.out.println("The cat sleeps");
	}
	@Override
	public void makeSound(){
		System.out.println("The cat mjaus.");
		System.out.println("The cat mjaus.");
		
	}

}

package inheritance;

public class Cat extends Animal {
	public Cat (){
		System.out.println("Hello from the constructor in the class Cat.");
	}
	
	@override
	public void eat() {
		System.out.println("The cat eats.");
	}
	
	@override
	public void sleep(){
		System.out.println("The cat sleeps");
	}
	
	public void makeSound(){
		System.out.println("The cat mjaus.");
		System.out.println("The cat mjaus.");
		
	}

}

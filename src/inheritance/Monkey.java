package inheritance;

public class Monkey extends Animal {
	public Monkey(){
		System.out.println("Hiho from the constructor in the class Monkey.");
	}
	
	@Override
	public void eat(){
		System.out.println("The monkey eats");
	}
	@Override
	public void sleep(){
		System.out.println("The monkey sleeps");
	}
	@Override
	public void makeSound(){
		System.out.println("The monkey yells");
	}
}

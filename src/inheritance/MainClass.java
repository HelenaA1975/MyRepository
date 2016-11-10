package inheritance;

public class MainClass {

	public static void main(String[] args) {
		Animal animal = new Animal();
		System.out.println("We have created an animal.");
		System.out.println("We have created an animal.");
		Horse horse = new Horse();
		//System.out.println("We have created a horse.");
		
		Cat cat = new Cat();
		//System.out.println("We have created a cat.");
		
		Monkey monkey = new Monkey();
		//System.out.println("We have created a monkey.");
		
		animal.sleep();
		animal.eat();
		animal.makeSound();
		
		horse.sleep();
		cat.makeSound();
		monkey.eat();
		horse.eat();
		
		
//		if (horse) {
//			System.out.println("We have created a horse.");
//			
//		}
//		else if (cat) {
//			System.out.println("We have created a cat.");
//		}
//		else if (monkey) {
//			System.out.println("We have created a monkey.");
		}
				
	}



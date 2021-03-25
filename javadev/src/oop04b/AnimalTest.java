package oop04b;

public class AnimalTest {
	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.eat();
		dog.sleep();
		((Dog)dog).bark();
//		dog.bark();
	}
}

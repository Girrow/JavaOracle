package oop06.inter05;

public interface Flyable {
	default void fly() {
		System.out.println("난다 날아");
	}
}

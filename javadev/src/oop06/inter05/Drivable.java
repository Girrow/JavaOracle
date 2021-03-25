package oop06.inter05;

public interface Drivable {
	default void drive() {
		System.out.println("운전중");
	}
}

package oop04b;

public interface Animal {
	default void eat() {
		System.out.println("맛있게 먹습니다");
	}
	default void sleep() {
		System.out.println("꿀잠을 잡니다");
	}
}

package oop06.inter06;

public interface InterfaceC extends InterfaceA,InterfaceB{
	default void methodC() {
		System.out.println("Method C call");
	}
}

package oop12.reflection01;

public class ReflectionTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Worker worker= new Worker("강백호",Worker.MANAGER);
		Class<?> cls1 = worker.getClass();
		
		Class cls2 = Worker.class;
		
		Class cls3 = Class.forName("oop12.reflection01.Worker");
		System.out.println(cls1.hashCode());
		System.out.println(cls2.hashCode());
		System.out.println(cls3.hashCode());
	}
}

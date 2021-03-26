package oop12.reflection02;

import java.lang.reflect.InvocationTargetException;

import oop12.reflection01.Worker;

public class ReflectionTest03 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Worker worker= new Worker("강백호",Worker.MANAGER);
		
		Class cls = worker.getClass();
		
		Object obj =cls.getConstructor().newInstance();
		if(obj instanceof Worker) {
			System.out.println(obj);
		}
	}
}

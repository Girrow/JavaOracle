package oop12.reflection02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest02 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class cls2 = Worker.class;
		Constructor[] constructors = cls2.getConstructors();
		
		for (int i = 0; i < constructors.length; i++) {
			System.out.println(constructors[i].toString());
		}
		System.out.println();
		Method[] methods = cls2.getMethods();
		for (int i = 0; i < methods.length; i++) {
			System.out.println(methods[i].toString());
		}
		System.out.println();
		Field[] fields = cls2.getFields();
		for (int i = 0; i < fields.length; i++) {
			System.out.println(fields[i].toString());
		}
	}
}

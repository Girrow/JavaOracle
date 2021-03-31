package oop14.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnoTest {
	public static void main(String[] args) {
		Method[] methods = Service.class.getDeclaredMethods();
		
		for(Method method : methods) {
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				System.out.println("["+method.getName()+"]");
				PrintAnnotation prtAnnotation = method.getAnnotation(PrintAnnotation.class);
				for(int i=0;i<prtAnnotation.number();i++) {
					System.out.print(prtAnnotation.value());
				}
				System.out.println();
				try {
					method.invoke(new Service());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			
		}
	}
}

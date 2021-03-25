package oop08.singleton;

public class Singleton {
	private static Singleton singleton;
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(singleton == null)
			singleton = new Singleton();
		return singleton;
	}
	
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		if(s1 == s2)
			System.out.println("같은 Singleton");
	}
}

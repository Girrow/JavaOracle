package oop15.stream03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class SerializableTest {
	public static void main(String[] args) throws Exception{
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("objer2.ser"));
		out.writeObject(new Circle(1,2,2.4));
		out.writeObject(new Circle(2,2,4.8));
		out.writeObject(new String("가나다라마바사"));
		
		out.close();
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("objer2.ser"));
		Object obj;
		Circle c1 =(Circle)in.readObject();
		Circle c2 =(Circle)in.readObject();
		String msg = (String)in.readObject();
		
		System.out.printf("%s\n%s\n%s",c1.toString(),c2.toString(),msg);
		in.close();
	}
}

package oop15.stream04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TransientTest {
	public static void main(String[] args) throws Exception{
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"));
		Person person = new Person("정대만","깡패",19,14);
		System.out.println(person);
		
		out.writeObject(person);
		out.close();
		
		/*
		 * 하하 호호 
		 */
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"));
		Person recPerson = (Person)in.readObject();
		in.close();
		System.out.println(recPerson);
	}
}

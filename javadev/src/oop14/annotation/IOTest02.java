package oop14.annotation;

import java.io.FileInputStream;

public class IOTest02 {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("sample.txt")){
			int data;
			while((data=fis.read())!=-1) {
				System.out.print((char)data);
			}
			
			
		} catch (Exception e) {e.printStackTrace();}
	}
}

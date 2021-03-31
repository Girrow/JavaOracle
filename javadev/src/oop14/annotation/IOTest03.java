package oop14.annotation;

import java.io.File;

public class IOTest03 {
	public static void main(String[] args) throws Exception{
		File f = new File("abc.txt");
		if(f.exists()) {
			System.out.println("File exists");
		}else {
			f.createNewFile();
			System.out.println("File create");
		}
	}
}

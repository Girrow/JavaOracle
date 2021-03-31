package oop14.annotation;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class IOTest08 {
	public static void main(String[] args) throws Exception{
		long start = 0;
		long end = 0;
		FileInputStream fis1 = new FileInputStream("test.jpeg");
		start=System.currentTimeMillis();
		
		while(fis1.read()!=-1) {}
		
		end = System.currentTimeMillis() - start;
		System.out.println("Buffed before : "+end);
		fis1.close();
		
		FileInputStream fis2 = new FileInputStream("test.jpeg");
		start=System.currentTimeMillis();
		BufferedInputStream bis = new BufferedInputStream(fis2);
		
		
		while((bis.read())!=-1) {}
		
		end = System.currentTimeMillis() - start;
		System.out.println("Buffed after : "+end);
		fis2.close();
	}
}

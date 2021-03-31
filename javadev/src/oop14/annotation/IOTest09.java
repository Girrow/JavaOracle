package oop14.annotation;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOTest09 {
	public static void main(String[] args) throws Exception{
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data = 0;
		
		fis=new FileInputStream("test.jpeg");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("test2.jpeg");
		
		long time = System.currentTimeMillis();
		while((data = bis.read())!=-1) {
			fos.write(data);
		}
		fos.flush();
		bis.close();
		fos.close();
		fis.close();
		System.out.println(System.currentTimeMillis()-time);
		
		
		data = 0;
		
		fis=new FileInputStream("test.jpeg");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("test3.jpeg");
		bos = new BufferedOutputStream(fos);
		
		time = System.currentTimeMillis();
		while((data = bis.read())!=-1) {
			bos.write(data);
		}
		bos.close();
		bis.close();
		fos.flush();
		fos.close();
		fis.close();
		System.out.println(System.currentTimeMillis()-time);
		
	}
}

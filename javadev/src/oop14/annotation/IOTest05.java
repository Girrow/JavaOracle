package oop14.annotation;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOTest05 {
	public static void main(String[] args) throws Exception{
		String original = "sample.txt";
		String target = "copy.txt";
		
		FileInputStream fis = new FileInputStream(original);
		FileOutputStream fos = new FileOutputStream(target);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		while((readByteNo=fis.read(readBytes))!=-1) {
			fos.write(readBytes,0,readByteNo);
		}
		fos.flush();
		fos.close();
		fis.close();
		System.out.println("Copy complete");
	}
}

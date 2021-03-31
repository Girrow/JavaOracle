package oop14.annotation;

import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest01 {
	public static void main(String[] args){
		
		try (FileOutputStream fos = new FileOutputStream("sample.txt")) {
			for(int i='A';i<='Z';i++) {
				fos.write(i);
			}
			fos.close();
			
			
		} catch (Exception e) {e.printStackTrace();}
	}
}

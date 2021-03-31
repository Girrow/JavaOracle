package oop14.annotation;

import java.io.BufferedReader;
import java.io.FileReader;

public class IOTest12 {
	public static void main(String[] args){
		try(BufferedReader br = new BufferedReader(new FileReader("print.txt"))){
			String data;
			while((data=br.readLine())!=null) 
				System.out.println(data);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

package oop14.annotation;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class IOTest10 {
	public static void main(String[] args) throws Exception{
		InputStream in = System.in;
		Reader reader = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(reader);
		System.out.print("입력 :");
		String str = br.readLine();
		System.out.println(str);
	}
}

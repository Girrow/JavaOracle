package oop14.annotation;

import java.io.BufferedReader;
import java.io.FileReader;

public class IOTest07b {
	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("sample2.txt");
		BufferedReader br = new BufferedReader(fr);
		String data;
		while((data=br.readLine())!=null) {
			System.out.println(data);
		}
//		int readCharNo;
//		char[] cbuf = new char[100];
//		while((readCharNo=fr.read(cbuf))!=-1) {
//			String data = new String(cbuf,0,readCharNo);
//			System.out.println(data);
//		}
		br.close();
		fr.close();
	}
}

package oop14.annotation;

import java.io.File;
import java.io.FileWriter;

public class IOTest06 {
	public static void main(String[] args) throws Exception{
		File f = new File("sample2.txt");
		FileWriter fw = new FileWriter(f);
		fw.write("정대만\r\n");
		fw.write("절대로 포기하지 않느 ㄴ남자");
		
		fw.flush();
		fw.close();
		System.out.println("File Save");
	}
}

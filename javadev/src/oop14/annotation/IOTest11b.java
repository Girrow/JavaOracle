package oop14.annotation;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class IOTest11b {
	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("print.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.println("[Printer Substream]");
		ps.println("바로 지금이야");
		ps.println("날 부르는");
		
		ps.close();
		fos.close();
	}
}

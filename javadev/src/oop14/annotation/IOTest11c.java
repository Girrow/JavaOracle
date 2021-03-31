package oop14.annotation;

import java.io.FileWriter;
import java.io.PrintWriter;

public class IOTest11c {
	public static void main(String[] args) throws Exception{
		FileWriter fos = new FileWriter("print.txt");
//		PrintStream ps = new PrintStream(fos);
		PrintWriter pw = new PrintWriter(fos);
		pw.println("[Printer Substream]");
		pw.println("바로 지금이야");
		pw.println("날 부르는");
		
		pw.close();
		fos.close();
	}
}

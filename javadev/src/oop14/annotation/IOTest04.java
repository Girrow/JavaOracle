package oop14.annotation;

import java.io.File;
import java.util.Date;

public class IOTest04 {
	public static void main(String[] args) throws Exception{
		File f = new File("sample.txt");
		System.out.println("is File ? : "+f.isFile());
		System.out.println("is Directory ? : "+f.isDirectory());
		System.out.println("name : "+f.getName());
		System.out.println("absolute path : "+f.getAbsolutePath());
		System.out.println("canonical path :"+f.getCanonicalPath());
		System.out.println("recent modify date :"+new Date(f.lastModified()));
		System.out.println("file size :"+f.length());
	}
}

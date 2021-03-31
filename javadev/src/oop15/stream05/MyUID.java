package oop15.stream05;

import java.io.Serializable;

public class MyUID implements Serializable{
	private static final long serialVersionUID = 1984963759463193608L;
	int field1;
	int field2;
	@Override
	public String toString() {
		return "MyUID [field1=" + field1 + ", field2=" + field2 + "]";
	}
}

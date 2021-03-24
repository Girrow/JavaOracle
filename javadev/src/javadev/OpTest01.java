package javadev;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class OpTest01 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("정수 A값 입력 : ");
			String a = br.readLine();
			StringTokenizer st = new StringTokenizer(a);
			while(st.hasMoreTokens()) System.out.println(Integer.parseInt(st.nextToken()));
		} catch (Exception e) {}
	}
	
}

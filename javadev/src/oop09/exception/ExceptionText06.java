package oop09.exception;

public class ExceptionText06 {
	public static void main(String[] args) throws Exception{
		String data1 = null;
		String data2 = null;
		
		try {
			data1=args[0];
			data2=args[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매가값의 수가 부족합니다");
			return;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			int value = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			System.out.printf("%d + %d = %d\n",value,value2,value+value2);
		} catch (NumberFormatException e) {
			System.out.println("숫자 변환 X");
		} finally {
			System.out.println("replay");
		}
	}
}

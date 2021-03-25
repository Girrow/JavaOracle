package oop09.exception;

public class ExceptionText07 {
	public static void main(String[] args) throws Exception{
		
		try {
			String data1=args[0];
			String data2=args[1];
			
			int value = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			System.out.printf("%d + %d = %d\n",value,value2,value+value2);
			
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("실행 매가값의 수가 부족하거나 숫자로 변환할 수 없습니다");
			return;
		} catch (Exception e) {
			System.out.println("숫자 변환 X");
		} finally {
			System.out.println("replay");
		}
		
			
	}
}

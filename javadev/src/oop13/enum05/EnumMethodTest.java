package oop13.enum05;

public class EnumMethodTest {
	public static void main(String[] args) {
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		int ordinal = Week.SUNDAY.ordinal();
		System.out.println(ordinal);
		
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		System.out.println(result1);
		
		if(args.length == 1) {
			String strDay = args[0].toUpperCase();
			Week weekDay = Week.valueOf(strDay);
			
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) System.out.println("주말");
			else System.out.println("평일");
		}
	}
}

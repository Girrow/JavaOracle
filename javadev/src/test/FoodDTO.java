package test;

public class FoodDTO {
	OrientalDTO a = new OrientalDTO();
	
	public static void main(String[] args) {
		FoodDTO fd = new FoodDTO();
		System.out.println(fd.a.getId());
	}
}

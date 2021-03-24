package hyungu;

public class 메인 {
	public static void main(String[] args) {
		FoodDTO[] foodList = new FoodDTO[5];
		foodList[0] = new OrientalDTO();
		foodList[1] = new WesternDTO();
		foodList[2] = new MaterialDTO();
		foodList[3] = new OrientalDTO();
		foodList[4] = new OrientalDTO();
		
		
		for(FoodDTO f : foodList) {
			System.out.println(f.toString());
		}
	}
}

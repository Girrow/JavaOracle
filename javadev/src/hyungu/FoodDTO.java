package hyungu;
public class FoodDTO {
    // 필드
    private int id;
    private String name;
    private int calori;
    
    // 메소드
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCalori() {
        return calori;
    }
    public void setCalori(int calori) {
        this.calori = calori;
    }
    
    public boolean equals(Object obj) {
        if (obj instanceof FoodDTO) {
        	FoodDTO w = (FoodDTO) obj;
            if (id == w.id) {
                return true;
            }
        }

        return false;
    }
	@Override
	public String toString() {
		return "FoodDTO [id=" + id + ", name=" + name + ", calori=" + calori + "]";
	}
    
    

}
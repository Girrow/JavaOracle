package oop03;
/**
 * 하나둘 셋 넷
 * @author Lynn
 *
 */
public class Person extends Object{
	private String name;
	private String nation;
//	private static String nation;
	
	public Person(String name, String nation) {
		this.name = name;
		this.nation = nation;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", nation=" + nation + "]";
	}
}

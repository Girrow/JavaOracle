package oop02.static01;

public class Account {
	static int money1;
	int money2;
	
	public Account() {
		super();
	}
	
	public Account(int money) {
		this.money1 +=money;
		this.money2 +=money;
	}
}

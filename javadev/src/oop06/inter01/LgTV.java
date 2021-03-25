package oop06.inter01;

public class LgTV implements TV{
	
	public void turnOn(){
		System.out.println("lgTV : 전원을 켭니다.");
	}
	public void turnOff(){
		System.out.println("lgTV : 전원을 끕니다.");
	}
	public void channelUp(){
		System.out.println("lgTV : 채널을 올립니다.");
	}
	public void channelDown(){
		System.out.println("lgTV : 채널을 내립니다.");
	}
	public void soundUp(){
		System.out.println("lgTV : 채널을 올립니다.");
	}
	public void soundDown(){
		System.out.println("lgTV : 채널을 내립니다.");
	}
}

package oop06.inter01;

public class LgTV implements TV{
	Speaker inkelSpeaker = new InkelSpeaker();
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
		inkelSpeaker.soundUp();
//		System.out.println("lgTV : 채널을 올립니다.");
	}
	public void soundDown(){
		inkelSpeaker.soundDown();
//		System.out.println("lgTV : 채널을 내립니다.");
	}
}

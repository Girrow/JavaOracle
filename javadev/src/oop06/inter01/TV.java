package oop06.inter01;

public interface TV {
	default void turnOn(){
		System.out.println("TV : 전원을 켭니다.");
	}
	default void turnOff(){
		System.out.println("TV : 전원을 끕니다.");
	}
	default void channelUp(){
		System.out.println("TV : 채널을 올립니다.");
	}
	default void channelDown(){
		System.out.println("TV : 채널을 내립니다.");
	}
	default void soundUp(){
		System.out.println("TV : 채널을 올립니다.");
	}
	default void soundDown(){
		System.out.println("TV : 채널을 내립니다.");
	}
}

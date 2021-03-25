package oop06.inter03;

public abstract class RemoteTV implements RemoteControl {
	int channel = 0;
	boolean power;
	@Override
	public void powerOn() {
		power=true;
		System.out.println("RemoteTV 전원을 켭니다");
	}

	@Override
	public void powerOff() {
		power=false;
		System.out.println("RemoteTV 전원을 끕니다");
	}

	@Override
	public void channelUp() {
		channel++;
		System.out.println("RemoteTV 채널을 올립니다. 현재 채널 : "+channel);
	}

}

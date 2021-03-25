package oop06.inter03;

public class LgRemoteTV extends RemoteTV {

	@Override
	public void channelDown() {
		channel--;
		System.out.println("채널을 내립니다. 현재 채널 : "+channel);
	}

}

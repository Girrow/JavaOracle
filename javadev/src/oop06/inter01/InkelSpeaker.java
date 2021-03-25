package oop06.inter01;

public class InkelSpeaker implements Speaker{

	@Override
	public void soundUp() {
		System.out.println("InkelSpeaker : Volume Up");
	}

	@Override
	public void soundDown() {
		System.out.println("InkelSpeaker : Volume Down");
	}

}

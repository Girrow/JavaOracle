package oop06.inter01;

public class AppleSpeaker implements Speaker{

	@Override
	public void soundUp() {
		System.out.println("AppleSpeaker : Volume Up");
	}

	@Override
	public void soundDown() {
		System.out.println("AppleSpeaker : Volume Down");
	}

}

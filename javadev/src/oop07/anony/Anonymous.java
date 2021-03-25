package oop07.anony;

public class Anonymous {
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV On");
		}
		@Override
		public void turnOff() {
			System.out.println("TV Off");
		}
	};
	
	public void method1() {
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Audio On");
			}
			@Override
			public void turnOff() {
				System.out.println("Audio Off");
			}
		};
		localVar.turnOn();
	}
	
	public void method2(RemoteControl rc) {
		rc.turnOff();
	}
}

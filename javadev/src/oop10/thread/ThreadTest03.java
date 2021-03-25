package oop10.thread;

public class ThreadTest03 implements Runnable{
	public static void main(String[] args) {
		Thread t = new Thread(new ThreadTest03());
		t.start();

		for(int i=1;i<=5;i++) {
			System.out.println("Main "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Runnable "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
}

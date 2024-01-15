package com.threading;

class InterCommThread extends Thread{
	int totalBalance = 0;

	public void run() {
		synchronized (this) {
			System.out.println("child Thread starts calculation for total balance"); // step 2
			for (int i = 0; i <= 50; i++) {
				totalBalance = totalBalance + i;
			}
			System.out.println("child thread gives notification call"); // step 3
			this.notify();
		} 
	}
}
public class InterThreadDemo {
public static void main(String[] args) throws InterruptedException {
	InterCommThread b = new InterCommThread();
	b.start();
	synchronized (b) {
		System.out.println("main thread calling wait() method"); // step 1
		b.wait();
		System.out.println("main thread got notification call"); // step 4
		System.out.println("totol balance " + b.totalBalance);
	}

}
}

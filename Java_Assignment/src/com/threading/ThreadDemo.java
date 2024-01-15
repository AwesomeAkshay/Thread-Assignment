package com.threading;

public class ThreadDemo implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new ThreadDemo());
		t.start();
		
	

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread Id "+Thread.currentThread().getId());
	}

}

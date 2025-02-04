package com.tanu;

public class ThreadDemo extends Thread {
	private Thread t;
	String threadName;

	ThreadDemo(String name) {
		threadName = name;
	}

	@Override
	public void run() {
		System.out.println("Running" + threadName);
		try {
			for (int i = 4; i > 0; i--)
				System.out.println("Thread:" + threadName + "," + i);
			Thread.sleep(50);
		} catch (InterruptedException e) {
			System.out.println("Thread" + threadName + " interrupted");
		}
		System.out.println("Thread" + threadName + " exiting");
	}

	public void start() {
		System.out.println("Starting" + threadName);
		if (t == null)
			t = new Thread(this, threadName);
		t.start();
	}

}
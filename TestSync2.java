package com.tanu;

class TestSync {
	synchronized void printTable(int n) {// synchronized method
		for (int i = 1; i <= 3; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
	void displayTable(int n){  
		   synchronized(this){//synchronized block  
		     for(int i=1;i<=5;i++){  
		      System.out.println(n*i);  
		      try{  
		       Thread.sleep(400);  
		      }catch(Exception e){System.out.println(e);}  
		     }  
		   }  
		 }//end of the method  
}

class MyThread1 extends Thread {
	TestSync t;

	MyThread1(TestSync t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}

class MyThread2 extends Thread {
	TestSync t;

	MyThread2(TestSync t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
		t.displayTable(100);
	}
}
	public class TestSync2 {
		public static void main(String args[]) {
			TestSync obj = new TestSync();// only one object
			MyThread1 t1 = new MyThread1(obj);
			MyThread2 t2 = new MyThread2(obj);
			t1.start();
			t2.start();
		}
	}

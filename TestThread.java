package com.tanu;

public class TestThread {
public static void main(String args[])
{
	RunnableDemo rd1=new RunnableDemo(" Thread-1");
	rd1.start();
	RunnableDemo rd2=new RunnableDemo(" Thread-2");
	//rd2.run();
	rd2.start();
}
}

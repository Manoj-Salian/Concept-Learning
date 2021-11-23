package com.learning;

//Here two threads are pointing at the same object or instance.
//when the run method is called , for the first time Thread-1 will enter the synchornised block and lock the instance. 
//Thread 2 will wait until the thread 1 releases the lock
//https://www.tutorialspoint.com/object-level-lock-vs-class-level-lock-in-java
public class ObjectLevelLocking implements Runnable {

	@Override
	public void run() {
		
		System.out.println("Before entering synchorised block"+ Thread.currentThread().getName());
		synchronized (this) {
			System.out.println(Thread.currentThread().getName());
			
			try {
				Thread.currentThread().sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " executed");
		}
		
		

	}

	public static void main(String[] args) {
		ObjectLevelLocking objLock1 = new ObjectLevelLocking();
		Thread t1 = new Thread(objLock1);
		t1.setName("thread -1");
		ObjectLevelLocking objLock2 = new ObjectLevelLocking();
		Thread t2 = new Thread(objLock1);
		t2.setName("thread -2");
		t1.start();
		t2.start();
	}
	
	
	

}

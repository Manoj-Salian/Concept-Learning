package com.learning;

//classLock1 and classLock2 are two different objects trying to access synchronizes block at the same time
//"ClassLevelLocking.class" will provide lock in this case.Hence when one object is processed , the other object has to wait until first object finished its execution

public class ClassLevelLocking implements Runnable{

	public static void main(String[] args) {
		ClassLevelLocking classLock1 = new ClassLevelLocking();
		Thread t1 = new Thread(classLock1);
		
		ClassLevelLocking classLock2 = new ClassLevelLocking();
		Thread t2 = new Thread(classLock2);
		
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		System.out.println("Before entering synchorised block"+ Thread.currentThread().getName());
		synchronized (ClassLevelLocking.class) {
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

}

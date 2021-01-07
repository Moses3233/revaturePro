package com.threads;

public class threadMain {

	public static void main(String[] args) {
		myRun r1=new myRun();
		Thread t1=new Thread(r1, "run-1");
		
		myRun r2=new myRun();
		Thread t2=new Thread(r2, "run-2");
		
		myRun r3=new myRun();
		Thread t3=new Thread(r3, "run-3");
		
		myRun r4=new myRun();
		Thread t4=new Thread(r4, "run-4");
		
		myRun r5=new myRun();
		Thread t5=new Thread(r5, "run-5");
		
		
		
//		t1.setDaemon(true);
//		t2.setDaemon(true);
//		t3.setDaemon(true);
//		t4.setDaemon(true);
//		t5.setDaemon(true);
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
//		for (int i = 0; i < 4; i++) {
//			System.out.println("Printing from thread - "+Thread.currentThread().getName()+" value of i = "+(i+1));
//			try {
//				Thread.sleep(1500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		System.out.println("Main ends here");
	}
	}



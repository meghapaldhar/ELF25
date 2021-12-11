package Threads;

public class ThreadDriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("start");
		Thread1 t1=new Thread1();
		Thread1 t2=new Thread1();
		Thread1 t3=new Thread1();
		t1.start();
		t2.start();
		t3.start();
		Thread.sleep(2000);
		System.out.println("stop");
	}

}

package Threads;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th=Thread.currentThread();
		System.out.println(th.getName());
		System.out.println(th.getId());
		System.out.println(th.getPriority());
		

	}

}

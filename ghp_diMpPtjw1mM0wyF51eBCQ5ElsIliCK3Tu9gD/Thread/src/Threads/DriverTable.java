package Threads;

import java.util.Scanner;

public class DriverTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter valuues for m");
		int m=sc.nextInt();
		
		Table t1=new Table(m);
		Table t2=new Table(m);
		t1.start();
		t2.start();
		
		

	}

}

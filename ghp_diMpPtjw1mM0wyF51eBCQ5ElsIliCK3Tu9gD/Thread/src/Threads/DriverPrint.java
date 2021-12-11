package Threads;

import java.util.Scanner;

public class DriverPrint {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter valuues for m");
		int m1=sc.nextInt();
		System.out.println("ener the values for n");
		int n1=sc.nextInt();
		// TODO Auto-generated method stub
		
		Printer p=new Printer(m1,n1);
		p.start();

	}

}

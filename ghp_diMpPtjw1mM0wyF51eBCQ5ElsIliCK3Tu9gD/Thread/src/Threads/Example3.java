package Threads;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("start range");
		char start=sc.next().charAt(0);
		System.out.println("end range");
		char end=sc.next().charAt(0);
		for(char i=start;i<=end;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println("something went wrong!!!");


			}

		}
	}
}


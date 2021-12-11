package Threads;

public class Printer extends Thread
{
	int m,n;
public void run()
{
	for(int i=m;i<=n;i++)
	{
		System.out.println(i);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
Printer(int m,int n)
{
	this.m=m;
	this.n=n;
}
}

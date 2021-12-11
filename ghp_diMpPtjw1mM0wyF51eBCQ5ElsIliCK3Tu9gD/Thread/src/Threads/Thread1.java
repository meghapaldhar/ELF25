package Threads;

public class Thread1 extends Thread
{
@Override
public void run()
{
	for(int i=1;i<=5;i++)
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
}

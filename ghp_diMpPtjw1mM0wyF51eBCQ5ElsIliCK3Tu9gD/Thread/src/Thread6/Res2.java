package Thread6;

public class Res2 
{

	public synchronized void n1(Res1 o1)
	{
		System.out.println(Thread.currentThread().getName() + "is under execution");
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
		}

		System.out.println(Thread.currentThread().getName() +"got the access");
		o1.m2();
	}
	public synchronized void n2()
	{
		System.out.println(Thread.currentThread().getName() +" has the access");
	}
}

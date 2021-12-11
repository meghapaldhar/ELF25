package Thread6;

public class Res1 
{
	public synchronized void m1(Res2 o2)
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
		o2.n2();
	}
	public synchronized void m2()
	{
		System.out.println(Thread.currentThread().getName() +" has the access");
	}
}
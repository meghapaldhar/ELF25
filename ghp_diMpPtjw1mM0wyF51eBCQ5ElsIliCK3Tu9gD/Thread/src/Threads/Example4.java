package Threads;

public class Example4
{
	public static void num()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		

		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			System.out.println("something went wrong!!!");
		}

	}
	
	}
public static void main(String[] args)
{
	Thread th=Thread.currentThread();
	System.out.println(th.getName());
	num();
	th.setName("meg");
	System.out.println(th.getName());
			
}

}

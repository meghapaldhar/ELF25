package Thread7;

public class Producer extends Thread
{
	int max_limit;
	Box b;
	Producer(Box b,int max_limit,String name){
		super(name);
		this.max_limit=max_limit;
		this.b=b;
	}

	public void run()
	{
		while(max_limit>0)
		{
			b.addBiscuits(5);
			max_limit-=5;//subtracting
			
			try
			{
				sleep(5000);

			}
			catch(InterruptedException e)

			{
				System.out.println("Interrupted....!!!!");
			}
		}
		System.out.println("Done for the day....!!!!!");
		this.notify();
	}

}







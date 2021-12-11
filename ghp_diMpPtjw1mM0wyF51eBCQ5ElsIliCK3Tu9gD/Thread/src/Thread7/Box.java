package Thread7;

import java.util.ArrayList;

public class Box
{
	ArrayList<Biscuit> box=new ArrayList<>();
	// add biscuits into the box

	public void addBiscuits(int n)
	{
		synchronized(this)
		{
			for(int i=0;i<n;i++)
			{
				box.add(new Biscuit());
				System.out.println("Biscuit added......by "+Thread.currentThread().getName());
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println("Interrupted...!!!!");
					
				}
				
			}
		}//end of synchronized
	}


	//remove biscuits from the box

	public void removeBiscuits(int n)
	{
		synchronized(this)
		{
			while( n!=0)
			{
				if(box.size()==0)
				{
					//later
					try
					{
						this.wait();
					}
					catch(InterruptedException e)
					{
						System.out.println("waiting......!!!!");
					}
				}
				else
				{
					box.remove(0);
					System.out.println("biscuit removed by......."+Thread.currentThread().getName());
					n--;
					try
					{
						Thread.sleep(2000);
					}
					catch(InterruptedException e)
					{
						System.out.println("Interrupted");

					}
				}

			}

		}
	}

}
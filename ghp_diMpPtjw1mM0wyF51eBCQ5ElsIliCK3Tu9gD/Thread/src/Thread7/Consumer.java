package Thread7;

public class Consumer extends Thread
{
Box b;
int n;

Consumer(Box b,int n,String name)
{
	super(name);
	this.b=b;
	this.n=n;
	
}
public void run()
{
	b.removeBiscuits(n);
	System.out.println(getName() +"Successfully consumed" +n+ " biscuits....!!!");
}
}

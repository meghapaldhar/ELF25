package Threads;

public class Table extends Thread
{
int m;

@Override
public void run()
{
	for(int i=1;i<=10;i++)
	{
		int num=m*i;
	
	System.out.println(m +"*" + i + "=" +num);
	
}
}
Table(int m)
{
	this.m=m;
	
	
}
}

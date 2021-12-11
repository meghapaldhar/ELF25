package Threads3;

import java.io.IOException;
import java.io.PrintWriter;

public class Table extends Thread
{
	int m;
	String file_path;
	public Table(int m, String file_path) {
		this.m = m;
		this.file_path = file_path;
	}
	@Override
	public void run()
	{
		PrintWriter pw=null;
		try
		{
			pw=new PrintWriter(file_path);
			for(int i=1;i<=10;i++)
			{

				pw.println(m +"*" + i + "=" +(m*i));
				System.out.println(getName() + "writes into the file" +file_path);
				sleep(2000);
			}
			}
			catch(IOException e)
			{
				System.out.println("Exception pccured in"+getName());
				System.out.println("unable to create file..");
				System.out.println("check for path : "+file_path);
				System.out.println("===============================================");
			}
			catch(InterruptedException e)
			{
				System.out.println("Exception occured in"+getName());
				System.out.println("Thread got interrupted...!!! ");
			}
			finally
			{
				if(pw != null)
				
					pw.close();
				
				
			}

		}

}
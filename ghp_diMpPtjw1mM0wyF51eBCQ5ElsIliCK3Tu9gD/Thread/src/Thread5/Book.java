package Thread5;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

public class Book implements Comparable,Serializable
{
	private String title;
	public void readTitle(String file_path)
	{
		PrintWriter pw=null;
		try
		{
			pw=new PrintWriter(file_path);
			for (int i = 0; i <title.length(); i++) 
			{
				pw.flush();
				pw.print(title.charAt(i));
				System.out.println("writing....");
				Thread.sleep(2000);
			}
			System.out.println("done");
		}
		catch(IOException e)
		{
			System.out.println("Exception in thread" +Thread.currentThread().getName());
			System.out.println("Unable to open the file");
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception in thread" +Thread.currentThread().getName());	
			System.out.println("Interrupted exception....!!!");

		}
		finally
		{
			if(pw!=null)
			{
				pw.close();	
			}
		}
	}

	public void writeTitle(String Title)
	{
		this.title=title;
	}
	@Override
	public int compareTo(Object o)
	{
		Book b=(Book)o;
		return this.title.compareTo(title);
	}

	@Override
	public String toString()
	{
		return "[book{title : "+ title + "}]";
	}
	@Override
	public boolean equals(Object o)
	{
		Book temp=(Book)o;
		return this.title.equals(temp.title);
	}
	@Override

	public int hashCode()
	{
		return this.title.hashCode();	
	}
}



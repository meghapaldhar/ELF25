package Thread4;

import java.io.IOException;
import java.io.PrintWriter;

public class Reader extends Thread
{
	Book b1;
	String file_path;
	public Reader(Book b1, String file_path) {
		super();
		this.b1 = b1;
		this.file_path = file_path;

	}
	public void run()
	{
		PrintWriter pw=null;

		try
		{
			pw=new PrintWriter(file_path);
			for (int i = 0; i <b1.title.length(); i++) {
				
				pw.print(b1.title.charAt(i));
				System.out.println("printing..........");

				sleep(1000);
				pw.flush(); 
			}
		}catch (IOException e) {
			System.out.println("............");
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		// TODO: handle exception
	}
}

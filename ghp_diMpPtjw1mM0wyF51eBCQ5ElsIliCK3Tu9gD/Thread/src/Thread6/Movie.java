package Thread6;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Serializable;
public class Movie implements Comparable<Movie>,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String movieTitle;
	private String releaseYear;
	public Movie() {
	}
	public Movie(String movieTitle, String releaseYear) {
		super();
		this.movieTitle = movieTitle;
		this.releaseYear = releaseYear;
	}
	@Override
	public String toString() {
		return "Movie Title :"+movieTitle+"\nRelease Date :"+releaseYear;
	}
	@Override
	public boolean equals(Object obj) {
		Movie m=(Movie)obj;
		return this.movieTitle.equals(m.movieTitle)&& this.releaseYear.equals(m.releaseYear);
	}
	@Override
	public int hashCode() {
		return this.movieTitle.hashCode()+this.releaseYear.hashCode();
	}
	@Override
	public int compareTo(Movie o) {
		return this.movieTitle.compareTo(o.movieTitle);
	}
	public void readTitle(String filePath) {
		PrintWriter pw=null;
		try {
			pw=new PrintWriter(filePath);
			synchronized (this) {
				for (int i = 0; i < movieTitle.length(); i++) {
					pw.print(movieTitle.charAt(i));
					Thread.sleep(300);
					System.out.println("Printing going On");
				}
				System.out.println("Task Done!!!!!!!!");
			}
		} catch (FileNotFoundException e) {
			System.out.println("Exception in thread : "+Thread.currentThread().getName());
			System.out.println("please the enter the correct path");
		} catch (InterruptedException e) {
			System.out.println("Exception in thread : "+Thread.currentThread().getName());
		}
		finally {
			try {
				if(pw!=null)
					pw.close();
			} catch (Exception e2) {
				System.out.println("Please closed all the costly resource");
			}
		}
	}
	public synchronized void modifiedTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
}

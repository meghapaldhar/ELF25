package Thread6;
public class Writer  extends Thread{
	Movie m;
	String filePath;
	String movieTitle;
	public Writer(Movie m, String movieTitle) {
		super();
		this.m = m;
		this.movieTitle = movieTitle;
	}
	@Override
	public void run() {
		m.modifiedTitle(movieTitle);
		try {
			sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("Exception in thread : "+Thread.currentThread().getName());
		}
	}
}

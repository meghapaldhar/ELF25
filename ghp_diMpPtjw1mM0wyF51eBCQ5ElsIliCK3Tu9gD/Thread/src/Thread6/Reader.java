package Thread6;


public class Reader extends Thread{
	Movie m;
	String filePath;
	public Reader(Movie m, String filePath) {
		super();
		this.m = m;
		this.filePath = filePath;
	}
	@Override
	public void run() {
		m.readTitle(filePath);
		try {
			sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("Exception in thread : "+Thread.currentThread().getName());
		}
	}
}

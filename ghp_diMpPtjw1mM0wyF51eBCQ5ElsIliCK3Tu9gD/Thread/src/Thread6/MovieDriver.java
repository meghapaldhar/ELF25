package Thread6;
import java.util.Scanner;
public class MovieDriver {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Path of first movie :");
		String filePath=s.nextLine();
		System.out.println("Enter the first movie name    :");
		String movieTitle=s.next();
		System.out.println("Enter The Release the date    :");
		String releaseYear=s.next();
		Movie m=new Movie(movieTitle, releaseYear);
		Reader r1=new Reader(m, filePath);
		r1.start();
		Writer w1=new Writer(m, movieTitle );
		w1.start();
		
	}

}

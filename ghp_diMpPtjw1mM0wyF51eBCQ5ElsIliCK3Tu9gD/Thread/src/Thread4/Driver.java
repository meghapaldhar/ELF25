package Thread4;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book("Harry potter");
		Reader r1=new Reader(b1,"E:\\ECLIPSE\\Thread\\src\\Thread4\\a2.txt");
		Reader r2=new Reader(b1,"E:\\ECLIPSE\\Thread\\src\\Thread4\\a3.txt");
		r1.start();
		r2.start();

	}

}

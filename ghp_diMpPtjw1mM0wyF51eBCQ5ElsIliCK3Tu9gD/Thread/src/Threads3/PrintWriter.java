package Threads3;

public class PrintWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table t1=new Table(1,"E:/ECLIPSE/Thread/src/Threads3/f1.txt");
		Table t2=new Table(2,"E:/ECLIPSE/Thread/src/Threads3/f2.txt");
		Table t3=new Table(3,"E:/ECLIPSE/Thread/src/Threads3/f3.txt");
		Table t4=new Table(4,"E:/ECLIPSE/Thread/src/Threads3/f4.txt");
		Table t5=new Table(5,"E:/ECLIPSE/Thread/src/Threads3/f5.txt");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}

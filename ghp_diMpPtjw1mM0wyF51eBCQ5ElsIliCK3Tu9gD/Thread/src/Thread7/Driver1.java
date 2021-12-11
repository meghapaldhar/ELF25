package Thread7;

public class Driver1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Box b=new Box();
	Producer p=new Producer(b,20,"Producer");
	Consumer c=new Consumer(b,3,"Consumer");
	p.start();
	c.start();
	
	
	
	}

}

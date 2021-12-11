package Thread6;

public class DeadLock1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Res1 o1=new Res1();
Res2 o2=new Res2();
Runnable r1=()->{o1.m1(o2);};
Runnable r2=()->{o2.n1(o1);};
Thread t1=new Thread(r1);
Thread t2=new Thread(r2);
t1.start();
t2.start();




	}

}

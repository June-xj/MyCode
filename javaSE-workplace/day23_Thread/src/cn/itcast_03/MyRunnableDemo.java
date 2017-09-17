package cn.itcast_03;

public class MyRunnableDemo {
	public static void main(String[] args) {
		MyRunnable mr=new MyRunnable();
		
//		Thread t1=new Thread(mr);
//		Thread t2=new Thread(mr);
//		t1.setName("hhh");
//		t2.setName("eee");
		
		Thread t1=new Thread(mr,"hhh");
		Thread t2=new Thread(mr,"eee");
		
		t1.start();
		t2.start();
		
	}
}

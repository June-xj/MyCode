package cn.itcast_05;

public class StudentDemo {
	public static void main(String[] args) {
		Student s=new Student();
		
		SetThread st=new SetThread(s);
		GetThread gt=new GetThread(s);
		
		Thread t1=new Thread(st);
		Thread t2=new Thread(gt);
		
		t1.start();
		t2.start();
		
	}
}

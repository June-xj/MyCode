package cn.itcast_04;

public class ThreadGroupDemo {
	public static void main(String[] args) {
		//method1();
		
		method2();
		
	}

	private static void method2() {
		ThreadGroup tg=new ThreadGroup("新线程组");
		
		MyRunnable my=new MyRunnable();
		
		Thread t1=new Thread(tg,my,"林");
		Thread t2=new Thread(tg,my,"刘");
		
		System.out.println(t1.getThreadGroup().getName());
		System.out.println(t2.getThreadGroup().getName());
	}

	private static void method1() {
		MyRunnable m=new MyRunnable();
		Thread t1=new Thread(m,"lin");
		Thread t2=new Thread(m,"liuyi");
		
		ThreadGroup tg1=t1.getThreadGroup();
		ThreadGroup tg2=t2.getThreadGroup();
		
		String name1=tg1.getName();
		String name2=tg2.getName();
		System.out.println(name1);
		System.out.println(name2);
		
		System.out.println(Thread.currentThread().getThreadGroup().getName());
	}
}

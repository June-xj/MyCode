package cn.itcast_02;
/*
 * Ïß³ÌÐÝÃß
 */
public class ThreadSleepDemo {
	public static void main(String[] args) {
		ThreadSleep s1=new ThreadSleep();
		ThreadSleep s2=new ThreadSleep();
		
		s1.setName("lin");
		s2.setName("zhu");
		
		s1.start();
		s2.start();
		
	}
}

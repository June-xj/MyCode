package cn.itcast_02;

import java.util.Date;

public class ThreadSleep extends Thread{
	@Override
	public void run() {
		for(int x=0;x<100;x++){
			
			System.out.println(getName()+":"+x+"ÈÕÆÚ£º"+new Date());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

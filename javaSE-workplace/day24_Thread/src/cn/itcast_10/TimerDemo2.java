package cn.itcast_10;

import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo2 {
	public static void main(String[] args) {
		Timer t=new Timer();
//		t.schedule(new MyTask(), 3000);
		t.schedule(new MyTask2(), 3000,2000);
	}
}

class MyTask2 extends TimerTask{
	
	@Override
	public void run() {
		System.out.println("±¨’®¡À");
	}
}

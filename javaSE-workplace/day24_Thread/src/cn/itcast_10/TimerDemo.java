package cn.itcast_10;

import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
	public static void main(String[] args) {
		Timer t=new Timer();
//		t.schedule(new MyTask(), 3000);
		t.schedule(new MyTask(t), 3000);
	}
}

class MyTask extends TimerTask{
	
	private Timer t;
	public MyTask(){
		
	}
	public MyTask(Timer t){
		this.t=t;
	}

	@Override
	public void run() {
		System.out.println("±¨’®¡À");
		t.cancel();
	}
	
}

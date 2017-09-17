package cn.itcast_05;

public class SellTicket implements Runnable{
	private int tickets=100;
	
	@Override
	public void run() {
		//int tickets=100;
		while(true){
		if(tickets>0){
			System.out.println(Thread.currentThread().getName()+"正在出售第"+tickets--+"张票！");
		}
		}
	}
}

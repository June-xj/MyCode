package cn.itcast_09;

public class SellTicket implements Runnable {

	private int tickets=100;
	private demo d=new demo();
	private int x=0;
	
	
	//同步代码块用任意对象做锁
//	@Override
//	public void run() {
//		while(true){
//			synchronized (d) {
//				if(tickets>0){
//					try {
//						Thread.sleep(100);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					System.out.println(Thread.currentThread().getName()+"正在出售第"+tickets--+"张票");
//				}
//			}
//		}
//	}
	
	@Override
	public void run() {
		while(true){
			if(x%2==0){
			synchronized (d) {
				if(tickets>0){
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"正在出售第"+tickets--+"张票");
				}
			}
			}else{
//				synchronized (d) {
//				if(tickets>0){
//					try {
//						Thread.sleep(100);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					System.out.println(Thread.currentThread().getName()+"正在出售第"+tickets--+"张票");
//				}
//			}
				
				sellTicket();
				
			}
		}
	}


	private synchronized void sellTicket() {
		
			if(tickets>0){
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"正在出售第"+tickets--+"张票");
			}
		
	}

}
class demo{
	
}

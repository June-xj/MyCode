package cn.itcast_04;


public class SellTicket extends Thread {
	//private int tickets=100;
	private static int tickets=100;
	
	@Override
	public void run() {
		//int tickets=100;
		while(true){
		if(tickets>0){
			System.out.println(getName()+"���ڳ��۵�"+tickets--+"��Ʊ��");
		}
		}
	}
}
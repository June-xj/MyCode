package cn.itcast_02;
/*
 * join():等待该线程终止，其他才能执行
 */
public class ThreadJoinDemo {
	
	public static void main(String[] args) {
		ThreadJoin tj1=new ThreadJoin();
		ThreadJoin tj2=new ThreadJoin();
		
		tj1.setName("li");
		tj2.setName("yuan");
		
		tj1.start();
		try {
			tj1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		tj2.start();
		
	}
	
}

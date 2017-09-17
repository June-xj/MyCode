package cn.itcast_09;

public class ThreadDemo {
	public static void main(String[] args) {
		new Thread(){
			@Override
			public void run() {
				for(int x=0;x<100;x++){
					System.out.println(Thread.currentThread().getName()+":"+x);
				}
			}
		}.start();
		
		new Thread(new Runnable(){

			@Override
			public void run() {
				for(int x=0;x<100;x++){
					System.out.println(Thread.currentThread().getName()+":"+x);
				}
			}
			
		}){}.start();
		
		new Thread(new Runnable(){

			@Override
			public void run() {
				for(int x=0;x<100;x++){
					System.out.println("hello"+":"+x);
				}
			}
			
		}){
			public void run() {
				for(int x=0;x<100;x++){
					System.out.println("world"+":"+x);
				}
			}
		}.start();
		
	}
}

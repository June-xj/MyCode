package cn.itcast_03;

public class SetThread implements Runnable {
	private Student s;
	private int x=0;
	
	public SetThread(Student s){
		this.s=s;
	}
	@Override
	public void run() {
		while(true){
			synchronized (s) {
				if(s.flag){
					try {
						s.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if(x%2==0){
					s.name="linqingxia";
					s.age=27;
				}else{
					s.name="liuyi";
					s.age=30;
				}
				x++;
				
				s.flag=true;
				s.notify();
			}
			
		}
		
	}

}

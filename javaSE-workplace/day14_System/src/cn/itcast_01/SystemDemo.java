package cn.itcast_01;

public class SystemDemo {
	public static void main(String[] args) {
		Person p=new Person("zhao",60);
		System.out.println(p);
		
		p=null;
		System.gc();//自动调用finallize()
	}
}

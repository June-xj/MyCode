package cn.itcast_02;

public class SystemDemo {
	public static void main(String[] args) {
//		System.out.println("xihuanLi");
//		System.exit(0);
//		System.out.println("xihuanZhao");
	
		//System.out.println(System.currentTimeMillis());
		
		//统计这段程序运行时间
		long start=System.currentTimeMillis();
		for(int x=0;x<100000;x++){
			System.out.println("hello"+x);
		}
		long end=System.currentTimeMillis();
		System.out.println("耗时："+(end-start)+"毫秒");
		
	}
}

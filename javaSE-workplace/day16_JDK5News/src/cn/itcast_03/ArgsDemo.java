package cn.itcast_03;

public class ArgsDemo {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int result=sum(a, b);
		System.out.println(result);
		
		int c=30;
		result=sum(a, b, c);
		System.out.println(result);
		
		int d=30;
		result=sum(a, b,c,d);
		System.out.println(result);
		
		
	}
	public static int sum(int b,int ... a){
		//int s=0;
		for(int x:a){
			b+=x;
		}
		return b;

	}
	
//	private static int sum(int a, int b, int c,int d) {
//		return a+b+c+d;
//	}
//	
//	private static int sum(int a, int b, int c) {
//		return a+b+c;
//	}
//
//	private static int sum(int a, int b) {
//		return a+b;
//	}

}

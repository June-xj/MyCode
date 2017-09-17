package cn.itcast_01;

public class DiGuiDemo {
	public static void main(String[] args) {
//		int jc=1;
//		for(int x=2;x<=5;x++){
//			jc*=x;
//		}
		System.out.println(test(5));
	}
	public static int test(int n){
		if(n==1){
			return 1;
		}else{
			return n*test(n-1);
		}
	}
}

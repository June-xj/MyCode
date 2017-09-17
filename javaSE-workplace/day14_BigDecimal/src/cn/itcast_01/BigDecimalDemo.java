package cn.itcast_01;

//计算浮点数，解决精度问题
public class BigDecimalDemo {
	public static void main(String[] args) {
		//float/double容易丢失精度
		System.out.println(0.09+0.01);
		System.out.println(1.0-0.32);
		System.out.println(1.015*100);
		System.out.println(1.301/100);
		
		System.out.println(1.0-0.12);
		
		
	}
}

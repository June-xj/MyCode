package cn.itcast_01;
/*
 * 异常
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		int a=10;
		//int b=2;
		int b=0;//ArithmeticException,运行时异常
		System.out.println(a/b);
		System.out.println("over");
	}
}

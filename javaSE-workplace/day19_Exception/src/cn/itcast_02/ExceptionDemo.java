package cn.itcast_02;
/*
 * 处理异常
 * 1.try...catch...finally
 * 2.throws抛出
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		int a=10;
		//int b=2;
		int b=0;//ArithmeticException,运行时异常
		try{
			System.out.println(a/b);
		}catch(ArithmeticException e){
			System.out.println("除数不能为0");
		}
		
		System.out.println("over");
	}
}

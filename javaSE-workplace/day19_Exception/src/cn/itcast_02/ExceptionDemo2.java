package cn.itcast_02;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		//method1();
		method2();
	}

	public static void method2() {
		int a=10;
		int b=0;
		try{
		System.out.println(a/b);
		}catch(ArithmeticException e){
			System.out.println("除数不能为0");
		}
		
		int[] arr={1,2,3};
		try{ 
		System.out.println(arr[3]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("访问索引不存在");
		}
		System.out.println("over");
	}

	public static void method1() {
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

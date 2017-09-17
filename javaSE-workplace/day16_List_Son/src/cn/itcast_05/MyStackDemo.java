package cn.itcast_05;

public class MyStackDemo {
	public static void main(String[] args) {
		MyStack ms=new MyStack();
		
		ms.add("hello");
		ms.add("world");
		ms.add("java");
		
//		System.out.println(ms.get());
//		System.out.println(ms.get());
//		System.out.println(ms.get());
		
		while(!ms.isEmpty()){
			System.out.println(ms.get());
		}
		
	}
}

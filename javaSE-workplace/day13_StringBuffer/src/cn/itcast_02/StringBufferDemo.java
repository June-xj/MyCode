package cn.itcast_02;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		StringBuffer sb =new StringBuffer();
		
//		StringBuffer sb2=new StringBuffer("hello");
//		System.out.println(sb);
//		System.out.println(sb2);
//		System.out.println(sb==sb2);
		
		//在尾部添加
		//一步一步添加数据
//		sb.append("hello");
//		sb.append(true);
//		sb.append(12);
//		sb.append(34.56);
		
		//链式编程
		sb.append("hello").append(true).append(12).append(34.56);
		System.out.println(sb);
		//在指定位置添加
		sb.insert(5, "world");
		System.out.println(sb);
		
	}
	
}

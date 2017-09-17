package cn.itcast_06;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		//substring方法返回的是String类不是StringBuffer类
		sb.append("hello").append("world").append("java");
		System.out.println(sb);
		
		String s=sb.substring(5);
		System.out.println(s);
		System.out.println(sb);
		
		String ss=sb.substring(5, 10);
		System.out.println(ss);
		System.out.println(sb);
		
	}
}

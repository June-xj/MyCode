package cn.itcast_03;

public class StringDemo {
	public static void main(String[] args) {
		String s="helloworld";
		System.out.println(s.length());
		System.out.println("------------");
		System.out.println(s.charAt(7));
		System.out.println("------------");
		System.out.println(s.indexOf('l'));
		System.out.println("------------");
		System.out.println(s.indexOf("owo"));
		System.out.println("------------");
		System.out.println(s.indexOf('l', 4));
		System.out.println("------------");
		System.out.println(s.indexOf('l', 4));
		System.out.println(s.indexOf('k', 4));
		System.out.println(s.indexOf('l', 40));
		System.out.println("------------");
		
		System.out.println(s.substring(5));//��Start
		System.out.println(s.substring(0));
		System.out.println(s.substring(3, 8));//��start������end
		
	}
}

package cn.itcast_03;

public class IntegerDemo {
	public static void main(String[] args) {
		int number=100;
		
		//int---Integer
		//1
		String s1=""+number;
		System.out.println(s1);
		//2
		String s2=String.valueOf(number);
		System.out.println(s2);
		//3
		Integer i=new Integer(number);
		String s3=i.toString();
		System.out.println(s3);
		//4
		String s4=Integer.toString(number);
		System.out.println(s4);
		System.out.println("-------------------");
		
		//String---int
		//1
		String s="100";
		Integer ii=new Integer(s);
		int x=ii.intValue();
		System.out.println(x);
		//2
		int y=Integer.parseInt(s);
		System.out.println(y);
		
	}
}

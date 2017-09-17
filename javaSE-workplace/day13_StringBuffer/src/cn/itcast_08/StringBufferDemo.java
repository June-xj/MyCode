package cn.itcast_08;

public class StringBufferDemo {
	public static void main(String[] args) {
		String s1="hello";
		String s2="world";
		System.out.println(s1+"---"+s2);
		change(s1,s2);
		System.out.println(s1+"---"+s2);
		
		StringBuffer sb1=new StringBuffer(s1);
		StringBuffer sb2=new StringBuffer(s2);
		System.out.println(sb1+"---"+sb2);
		change(sb1,sb2);
		System.out.println(sb1+"---"+sb2);
	}

	public static void change(StringBuffer sb1, StringBuffer sb2) {
		// TODO Auto-generated method stub
		sb1=sb2;
		sb2.append(sb1);
	}

	public static void change(String s1, String s2) {
		// TODO Auto-generated method stub
		s1=s2;
		s2=s1+s2;
	}
}

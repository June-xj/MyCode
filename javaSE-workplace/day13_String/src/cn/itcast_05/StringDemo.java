package cn.itcast_05;

public class StringDemo {
	public static void main(String[] args) {
		String s1="helloworld";
		String s2="heLloworld";
		String s3=s1.replace('l', 'k');
		String s4=s2.replace('l', 'k');
		String s5=s1.replace("owo", "ak47");
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		String s6=" hello   world  ";
		String s7=s4.trim();
		System.out.println(s6+"---");
		System.out.println(s7+"---");
		
		String str1="hello";
		String str2="hello";
		String str3="abc";
		String str4="xyz";
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str3));
		System.out.println(str1.compareTo(str4));
	}
}

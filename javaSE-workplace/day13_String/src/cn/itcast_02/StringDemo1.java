package cn.itcast_02;

public class StringDemo1 {
	public static void main(String[] args) {
		String s="helloWORLD";
		String s1=s.substring(0, 1);
		String s2=s.substring(1);
		String s3=s1.toUpperCase();
		String s4=s2.toLowerCase();
		String s5=s3.concat(s4);
		System.out.println(s5);
	}
}

package cn.itcast_04;

public class RegexDemo {
	public static void main(String[] args) {
		String s="hello12345world3232java";
		//去除所有数字，用‘*’替换
		//String regex="\\d+";
		//String regex="\\d";
		String regex="\\d+";
		String ss="";
		
		String re=s.replaceAll(regex, ss);
		System.out.println(re);
	}
}

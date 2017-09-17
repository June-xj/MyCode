package cn.itcast_05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
	public static void main(String[] args) {
		Pattern p=Pattern.compile("a*b");
		Matcher m=p.matcher("aaaaab");
		boolean b=m.matches();
		System.out.println(b);
		
		String s="aaaaab";
		String regex="a*b";
		boolean bb=s.matches(regex);
		System.out.println(bb);
	}
}

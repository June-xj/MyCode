package cn.itcast_05;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {
	public static void main(String[] args) {
		String s="da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?";
		String regex="\\b\\w{3}\\b";
		
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(s);
		
		//查找有没有满足条件的子串
//		boolean flag=m.find();
//		System.out.println(flag);
//		
//		String ss=m.group();
//		System.out.println(ss);
//		
//		flag=m.find();
//		ss=m.group();
//		System.out.println(ss);
		
		while(m.find()){
			System.out.println(m.group());
		}
		
		//调group之前必须先调find
//		String ss=m.group();
//		System.out.println(ss);
		
		
	}
}

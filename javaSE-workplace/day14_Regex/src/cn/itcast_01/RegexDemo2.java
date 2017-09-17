package cn.itcast_01;

import java.util.Scanner;

public class RegexDemo2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please input qqNumber:");
		String qq=sc.nextLine();
		
		System.out.println(checkQQ(qq));
	}

	private static boolean checkQQ(String qq) {
//		String regex="[1-9][0-9]{4,14}";
//		boolean flag=qq.matches(regex);
//		return flag;
		
		//return qq.matches("[1-9][0-9]{4,14}");
		return qq.matches("[1-9]\\d{4,14}");
	}
}

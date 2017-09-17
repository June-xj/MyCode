package cn.itcast_02;

import java.util.Scanner;

public class RegexTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please input e-mail:");
		String mail=sc.nextLine();
		
		String regex="[A-Za-z0-9]+@[A-Za-z0-9]+\\.com";
		
		boolean flag=mail.matches(regex);
		System.out.println(flag);
	}
}

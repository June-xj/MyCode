package cn.itcast_07;

import java.util.Scanner;

public class StringBufferTest3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please input:");
		String s=sc.nextLine();
		//1
		String s1=myReverse(s);
		System.out.println(s1);
		
		//2
		String s2=myReverse2(s);
		System.out.println(s2);
		
	}
	
	public static String myReverse2(String s){
		return new StringBuffer(s).reverse().toString();
	}
	
	public static String myReverse(String s){
		String result ="";
		char[] chs=s.toCharArray();
		for(int x=chs.length-1;x>=0;x--){
			result+=chs[x];
		}
		return result;
	}
}

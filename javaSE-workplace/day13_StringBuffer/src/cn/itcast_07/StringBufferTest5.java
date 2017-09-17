package cn.itcast_07;

import java.util.Scanner;

public class StringBufferTest5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please input:");
		String s=sc.nextLine();
		
		boolean result=isSame(s);
		System.out.println(result);
		
		boolean b=isSame2(s);
		System.out.println(b);
	}
	
	public static boolean isSame2(String s){
		return new StringBuffer(s).reverse().toString().equals(s);
	}
	
	public static boolean isSame(String s){
		boolean flag=true;
		
		char[] chs=s.toCharArray();
		for(int start=0,end=chs.length-1;start<=end;start++,end--){
			if(chs[start]!=chs[end]){
				flag= false;
				break;
			}
		}
		return flag;
	}
}

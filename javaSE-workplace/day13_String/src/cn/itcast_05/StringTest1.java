package cn.itcast_05;

import java.util.Scanner;

public class StringTest1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String line =sc.nextLine();
		String result="";
		char[] chs=line.toCharArray();
		
		for(int x=chs.length-1;x>=0;x--){
			result+=chs[x];
		}
		System.out.println(result);
		
		String s=myReverse(line);
		System.out.println(s);
	}
	public static String myReverse(String s){
		String result="";
		char[] chs=s.toCharArray();
		
		for(int x=chs.length-1;x>=0;x--){
			result+=chs[x];
		}
		return result;
	}
}

package cn.itcast_03;

import java.util.Arrays;

public class RegexTest {
	public static void main(String[] args) {
		String s1="91 27 46 38 50";
		String[] str1=s1.split(" ");
		for(int x=0;x<str1.length;x++){
			System.out.println(str1[x]);
		}
		
		int[] arr=new int[str1.length];
		for(int x=0;x<str1.length;x++){
			arr[x]=Integer.parseInt(str1[x]);
		}
		Arrays.sort(arr);
		
		StringBuilder sb=new StringBuilder();
		for(int x=0;x<arr.length;x++){
			sb.append(arr[x]).append(" ");
		}
		String res=sb.toString().trim();
		
		System.out.println(res);
		
	}
}

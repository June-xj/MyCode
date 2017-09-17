package cn.itcast_05;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<Character,Integer> tm=new TreeMap<Character,Integer>();
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		char[] ch=s.toCharArray();
		for(char c:ch){
			Integer i=tm.get(c);
			if(i==null){
				tm.put(c, 1);
			}else{
				i++;
				tm.put(c, i);
			}
		}
		
		StringBuilder sb=new StringBuilder();
		Set<Character> set=tm.keySet();
		for(Character key:set){
			Integer value=tm.get(key);
			sb.append(key).append("(").append(value).append(")");
		}
		
		String result=sb.toString();
		System.out.println(result);
		
	}
}

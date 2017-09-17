package cn.itcast_04;
//LinkedHashSetÎ¨Ò»£¬ÓÐÐò
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> l=new LinkedHashSet<String>();
		
		l.add("hello");
		l.add("world");
		l.add("java");
		l.add("world");
		l.add("java");
		
		for(String s:l){
			System.out.println(s);
		}
		
	}
}

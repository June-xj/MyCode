package cn.itcast_02;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> h=new HashSet<String>();
		h.add("hello");
		h.add("world");
		h.add("java");
		h.add("world");
		
		for(String s:h){
			System.out.println(s);
		} 
		
	}
}

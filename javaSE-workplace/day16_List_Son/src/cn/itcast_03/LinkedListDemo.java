package cn.itcast_03;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList link=new LinkedList();
		
		link.add("hello");
		link.add("world");
		link.add("java");
		
//		link.addFirst("javaee");
//		link.addLast("android");
		
		System.out.println(link.getFirst());
		System.out.println(link.getLast());
		
		System.out.println(link.removeFirst());
		System.out.println(link.removeLast());
		
		System.out.println(link);
		
	}
}

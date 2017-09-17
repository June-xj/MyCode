package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("hello");
		arr.add("world");
		arr.add("java");
		
		Iterator<String> it=arr.iterator();
		while(it.hasNext()){
			String s=it.next();
			System.out.println(s);
		}
		System.out.println("-------------");
		
		for(int x=0;x<arr.size();x++){
			String s=arr.get(x);
			System.out.println(s);
		}
		System.out.println("-----------");
		
		for(String s:arr){
			System.out.println(s);
		}
		
	}
}

package cn.itcast_02;

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
		
		for(int x=0;x<arr.size();x++){
			String s=arr.get(x);
			System.out.println(s);
		}
	}
}

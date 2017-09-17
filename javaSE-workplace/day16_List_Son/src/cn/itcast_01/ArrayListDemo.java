package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		arr.add("hello");
		arr.add("world");
		arr.add("java");
		
		Iterator it=arr.iterator();
		while(it.hasNext()){
			String s=(String) it.next();
			System.out.println(s);
		}
		System.out.println("-----------");
		
		for(int x=0;x<arr.size();x++){
			String s=(String) arr.get(x);
			System.out.println(s);
		}
		
		
		
		
	}
}

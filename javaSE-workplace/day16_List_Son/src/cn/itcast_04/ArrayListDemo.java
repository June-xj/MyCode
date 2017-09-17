package cn.itcast_04;

import java.util.ArrayList;
import java.util.Iterator;

//去除集合的重复元素
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		
		arr.add("hello");
		arr.add("world");
		arr.add("java");
		arr.add("hello");
		arr.add("world");
		System.out.println(arr);
		
		
		ArrayList arr1=new ArrayList();
		Iterator it=arr.iterator();
		while(it.hasNext()){
			String s=(String) it.next();
			
			if(!arr1.contains(s)){
				arr1.add(s);
			}
		}
		
		System.out.println(arr1);
		
		
	}
}

package cn.itcast_04;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		
		arr.add("hello");
		arr.add("world");
		arr.add("world");
		arr.add("world");
		arr.add("java");
		arr.add("hello");
		arr.add("world");
		System.out.println(arr);
		for(int x=0;x<arr.size()-1;x++){
			for(int y=x+1;y<arr.size();y++){
				if(arr.get(x).equals(arr.get(y))){
					arr.remove(y);
					y--;
				}
			}
		}
		
		Iterator it=arr.iterator();
		while(it.hasNext()){
			String s=(String) it.next();
			System.out.println(s);
		}
	}
}

package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {
	public static void main(String[] args) {
		
		ArrayList<String> arr=new ArrayList<String>();
		
		arr.add("hello");
		arr.add("world");
		arr.add("java");
		//arr.add(new Integer(100));
		//arr.add(10);//等价于arr.add(Integer.valueOf(10))
		
		Iterator<String> it=arr.iterator();
		while(it.hasNext()){
			//ClassCastException
			//因为我们存了String和Integer两种类型，而遍历都改成了String
			String s=it.next();
			System.out.println(s);
		}
	}
}

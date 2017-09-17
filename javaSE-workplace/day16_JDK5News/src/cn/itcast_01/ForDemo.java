package cn.itcast_01;

import java.util.ArrayList;
import java.util.List;

/*
 * JDK5新特性：自动拆装箱，泛型，增强for，静态导入，可变参数，枚举
 */
public class ForDemo {
	public static void main(String[] args) {
		int [] arr={1,2,3,4,5};
		for(int x=0;x<arr.length;x++){
			System.out.println(arr[x]);
		}
		System.out.println("-------------");
		
		//增强for
		for(int x:arr){
			System.out.println(x);
		}
		
		System.out.println("----------------");
		
		String[] str={"lin","feng","dong","liu"};
		for(String s:str){
			System.out.println(s);
		}
		
		System.out.println("------------");
		
		ArrayList<String> array=new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
		for(String s:array){
			System.out.println(s);
		}
		System.out.println("--------------");
		
		List<String> list=null;
		//NullPointerException
		//增强for的目标不能为null，所以先判断
		if(list!=null){
		for(String s:list){
			System.out.println(s);
		}
		}
		
		//增强for其实是用来替代迭代器的
		//ConcurrentModificationException
		//证明就是替代了
		for(String s:array){
			if("world".equals(s)){
				array.add("javaee");
			}
		}
		System.out.println(array);
		
	}
}

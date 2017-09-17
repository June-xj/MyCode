package cn.itcast_03;

import java.util.Arrays;
import java.util.List;
/*
 * public static <T> List<T> asList(T... a):把数组转换成集合
 * 虽然可以把数组转换成集合，但是长度不能变
 */
public class ArraysDemo {
	public static void main(String[] args) {
//		String[] str={"hello","world","java"};
//		List<String> list=Arrays.asList(str);
		
		List<String> list=Arrays.asList("hello","world","java");
		//UnsupportedOperationException
		//list.add("javaee");
		//UnsupportedOperationException
		//list.remove(1);
		list.set(1, "javaee");
		
		
		
		for(String s:list){
			System.out.println(s);
		}
		
		
		
	}
}

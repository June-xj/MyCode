package cn.itcast_07;

import java.util.Hashtable;

/*
 * Hashtable和HashMap的区别
 * Hashtable:线程安全，效率低，不允许null键和null值
 * HashMap:线程不安全，效率高，允许null键和null值
 */
public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable<String,String> hm=new Hashtable<String,String>();
		hm.put("itoo1", "hello");
		//NullPointerException
//		hm.put(null, "world");
//		hm.put("java", null);
		System.out.println(hm);
	}
}

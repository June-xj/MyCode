package cn_itcast_03;

import java.util.LinkedHashMap;
import java.util.Set;
/*
 * 由哈希表保证键的唯一，由链表保证键的有序
 */
public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<String,String> hm=new LinkedHashMap<String,String>();
		hm.put("2345", "hello");
		hm.put("1234", "world");
		hm.put("3456", "java");
		hm.put("1234", "javaee");
		hm.put("3456", "android");
		
		Set<String> set=hm.keySet();
		for(String key:set){
			String value=hm.get(key);
			System.out.println(key+"--"+value);
		}
		
	}
}

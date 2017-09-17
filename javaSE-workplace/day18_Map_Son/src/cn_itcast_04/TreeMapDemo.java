package cn_itcast_04;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<String,String> tm=new TreeMap<String,String>();
		tm.put("hello", "你好");
		tm.put("world", "世界");
		tm.put("java", "家洼");
		tm.put("world", "世界2");
		tm.put("javaee", "家洼ee");
		
		//字符串实现自然排序
		Set<String> set=tm.keySet();
		for(String key:set){
			String value=tm.get(key);
			System.out.println(key+"--"+value);
		}
		
	}
}

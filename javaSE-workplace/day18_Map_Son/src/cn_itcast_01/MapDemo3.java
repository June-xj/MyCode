package cn_itcast_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map集合的遍历
 * 夫妻对
 */
public class MapDemo3 {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("杨过", "小龙女");
		map.put("郭靖", "黄蓉");
		map.put("杨康", "穆年英");
		map.put("陈玄风", "梅超风");
		
		Set<String> set=map.keySet();
		for(String key:set){
			String value=map.get(key);
			System.out.println(key+"---"+value);
		}
	
	}
}

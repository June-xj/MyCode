package cn_itcast_02;

import java.util.HashMap;
import java.util.Set;
/*
 * HashMap保证键的唯一性
 */
public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("it001", "马云");
		hm.put("it002", "马化腾");
		hm.put("it004", "乔布斯");
		hm.put("it005", "张朝阳");
		hm.put("it002", "裘伯军");
		hm.put("it001", "比尔盖茨");
		
		//遍历
		Set<String> set=hm.keySet();
		for(String key:set){
			String value=hm.get(key);
			System.out.println(key+"-"+value);
		}
		
	}
}

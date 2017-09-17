package cn.itcast_05;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo2 {
		public static void main(String[] args) {
			HashMap<String,HashMap<String,Integer>> cmap=new HashMap<String,HashMap<String,Integer>>();
			
			HashMap<String,Integer> jcmap=new HashMap<String,Integer>();
			jcmap.put("陈宇楼", 20);
			jcmap.put("高月", 22);
			cmap.put("jc", jcmap);
			
			HashMap<String,Integer> jymap=new HashMap<String,Integer>();
			jymap.put("李杰", 21);
			jymap.put("曹氏列", 23);
			cmap.put("jy", jymap);
			
			Set<String> set1=cmap.keySet();
			for(String key1:set1){
				System.out.println(key1);
				HashMap<String,Integer> value1=cmap.get(key1);
				Set<String> set2=value1.keySet();
				for(String key2:set2){
					Integer value2=value1.get(key2);
					System.out.println("\t"+key2+"--"+value2);
				}
			}
			
		}
}

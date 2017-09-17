package cn.itcast_05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
/*
 * HashMapÇ¶Ì×ArrayList
 */
public class HashMapIncludeArrayListDemo {
	public static void main(String[] args) {
		HashMap<String,ArrayList<String>> hm=new HashMap<String,ArrayList<String>>();
		
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("ÂÀ²¼");
		a1.add("ÖÜè¤");
		hm.put("Èı¹úÑİÒå", a1);
		
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("ÁÖ÷ìÓñ");
		a2.add("¼Ö±¦Óñ");
		hm.put("ºìÂ¥ÃÎ", a2);
		
		ArrayList<String> a3=new ArrayList<String>();
		a3.add("ÁÖ³å");
		a3.add("ÎäËÉ");
		hm.put("Ë®ä°´«", a3);
		
		Set<String> set=hm.keySet();
		for(String key:set){
			System.out.println(key);
			ArrayList<String> value=hm.get(key);
			for(String s:value){
				System.out.println("\t"+s);
			} 
		}
		
	}
}

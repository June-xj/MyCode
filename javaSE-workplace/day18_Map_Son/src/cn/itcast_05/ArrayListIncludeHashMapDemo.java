package cn.itcast_05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 * ArrayListÇ¶Ì×HashMap
 */
public class ArrayListIncludeHashMapDemo {
	public static void main(String[] args) {
		ArrayList<HashMap<String,String>> array=new ArrayList<HashMap<String,String>>();
		
		HashMap<String,String> hm1=new HashMap<String,String>();
		hm1.put("ÖÜè¤", "Ğ¡ÇÇ");
		hm1.put("ÂÀ²¼", "õõ²õ");
		array.add(hm1);
		
		HashMap<String,String> hm2=new HashMap<String,String>();
		hm2.put("¹ù¾¸", "»ÆÈØ");
		hm2.put("Ñî¹ı", "Ğ¡ÁúÅ®");
		array.add(hm2);
		
		HashMap<String,String> hm3=new HashMap<String,String>();
		hm3.put("Áîºü³å", "ÈÎÓ¯Ó¯");
		hm3.put("ÁÖÆ½Ö®", "ÔÀÁéÉº");
		array.add(hm3);
		
		for(HashMap<String,String> hm:array){
			
			Set<String> set=hm.keySet();
			for(String key:set){
				String value=hm.get(key);
				System.out.println(key+"--"+value);
			}
		}
		
	}
}

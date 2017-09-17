package cn_itcast_02;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo2 {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(27, "林青霞");
		hm.put(30, "风清扬");
		hm.put(28, "刘意");
		hm.put(29, "林青霞");
		
		//0开头表示八进制，但是不能出现八以上的单个数据
//		hm.put(002, "hello");
//		hm.put(008, "hello");//错误
		
		Set<Integer> set=hm.keySet();
		for(Integer key:set){
			String value =hm.get(key);
			System.out.println(key+"--"+value);
		}
		
		//下面仅仅是集合元素字符串的表示
		System.out.println("hm:"+hm);
		
	}
}

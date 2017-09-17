package cn_itcast_02;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo3 {
	public static void main(String[] args) {
		HashMap<String,Student> hm=new HashMap<String,Student>();
		
		Student s1=new Student("ÖÜĞÇ³Û",58);
		Student s2=new Student("ÁõµÂ»ª",55);
		Student s3=new Student("Áº³¯Î°",54);
		Student s4=new Student("Áõ¼ÎÁá",50);
		
		hm.put("9527", s1);
		hm.put("9522", s2);
		hm.put("9524", s3);
		hm.put("9529", s4);
		
		Set<String> set=hm.keySet();
		for(String key:set){
			Student value=hm.get(key);
			System.out.println(key+"--"+value.getName()+"-"+value.getAge());
		}
		
	}
}

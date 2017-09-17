package cn.itcast_08;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
	public static void main(String[] args) {
		Properties pro=new Properties();
		pro.put("it002", "hello");
		pro.put("it001", "world");
		pro.put("it003", "java");
		
		//System.out.println(pro);
		
		Set<Object> set=pro.keySet();
		for(Object key:set){
			Object value=pro.get(key);
			System.out.println(key+"--"+value);
		}
		
	}
}

package cn.itcast_08;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo2 {
	public static void main(String[] args) {
		Properties pro=new Properties();
		pro.setProperty("zhangsan", "30");
		pro.setProperty("lisi", "40");
		pro.setProperty("wamgwu", "50");
		
		Set<String> set=pro.stringPropertyNames();
		for(String key:set){
			String value=pro.getProperty(key);
			System.out.println(key+"--"+value);
		}
		
	}
}

package cn_itcast_01;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args){
		Map<String ,String> m=new HashMap<String,String>();
		
		//put:添加函数
//		System.out.println("put:"+m.put("文章", "马伊琍"));
//		System.out.println("put:"+m.put("文章", "姚笛"));
		
		m.put("文章", "姚笛");
		m.put("huang", "yang");
		m.put("zhou", "kun");
		m.put("liu", "mi");
		
		//删除
//		System.out.println("remove:"+m.remove("huang"));
//		System.out.println("remove:"+m.remove("huangxiaobo"));
		
		//查询
//		System.out.println("containsKey:"+m.containsKey("huang"));
//		System.out.println("containsKey:"+m.containsKey("huangxiaobo"));
		
		//System.out.println("containsKey:"+m.containsValue("mi"));
		
		//为空？
		//m.clear();
		//System.out.println("isEmpty:"+m.isEmpty());
		
		System.out.println("size:"+m.size());
		
		System.out.println("map:"+m);
		
	}
}

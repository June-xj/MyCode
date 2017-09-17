package cn.itcast_01;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo3 {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add("hello");
		c.add("world");
		c.add("java");
		
		Object[] obj=c.toArray();
		for(int x=0;x<obj.length;x++){
			//System.out.println(obj[x]);
			String s=(String) obj[x];
			System.out.println(s+"---"+s.length());
			
			
			
		}
	}
}

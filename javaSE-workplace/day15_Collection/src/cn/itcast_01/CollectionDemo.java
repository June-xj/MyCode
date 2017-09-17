package cn.itcast_01;

import java.util.ArrayList;
import java.util.Collection;

//集合长度可变，只能存储引用类型（对象），可以存储不同数据类型的对象
//Java提供不同集合类，多个集合类的数据结构不同，但有共性（存储，获取，判断等）

public class CollectionDemo {
	public static void main(String[] args) {
		//错误，接口不能实例化
		//Collection c=new Collection();
		Collection c=new ArrayList();
		
		//add返回boolean型
		//System.out.println(c.add("hello"));
		c.add("hello");
		c.add("world");
		c.add("java");
		
		//移除所有元素
		//c.clear();
		
		//System.out.println(c.remove("hello"));
		//System.out.println(c.remove("hellohaha"));
		
		//System.out.println(c.contains("hello"));
		//System.out.println(c.contains("hellojava"));
		
		System.out.println(c.isEmpty());
		System.out.println(c.size());
		
		System.out.println(c);
		
	}
}

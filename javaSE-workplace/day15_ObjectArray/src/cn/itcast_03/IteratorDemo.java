package cn.itcast_03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		
		c.add("hello");
		c.add("world");
		c.add("java");
		//Iterator iterator():迭代器，集合专用遍历方法
		Iterator it=c.iterator();//实际返回子类对象，这里是多态
		
		//next():获取元素并执行到下一位置
//		Object obj=it.next();
//		System.out.println(obj);
		
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		
		//NoSuchElementException:因为已经找到最后了
		//System.out.println(it.next());
		
		//所以每次获取前判断有无下一个元素，有才获取
		while(it.hasNext()==true){
			String s=(String)it.next();
			System.out.println(s);
		}
		
	}
}

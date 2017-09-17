package cn.itcast_04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo2 {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");
		
//		Iterator it=list.iterator();
//		while(it.hasNext()){
//			String s=(String) it.next();
//			if("world".equals(s)){
//				//ConcurrentModificationException:
//				//并发修改异常
//				//因为迭代器依赖集合存在，集合添加了元素，而it迭代器不知道，接下来的
//				//所以迭代器遍历元素时不能修改元素
//				
//				list.add("javaee");
//			}
//		}
		
		
		//解决
		//1.迭代器迭代元素，迭代器修改元素
		//但是元素跟在迭代元素之后
//		ListIterator lit=list.listIterator();
//		while(lit.hasNext()){
//			String s=(String) lit.next();
//			if("world".equals(s)){
//				lit.add("javaee");
//			}
//		}
		
		//2.集合遍历元素，集合修改元素
		//元素在最后添加
		for(int x=0;x<list.size();x++){
			String s=(String) list.get(x);
			if("world".equals(s)){
				list.add("javaee");
			}
		}
		
		
		
		System.out.println(list);
	}
}

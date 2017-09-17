package cn.itcast_01;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");
		
		Collection c2=new ArrayList();
		c2.add("abc1");
		c2.add("abc2");
		c2.add("abc3");
		c2.add("abc4");
		c2.add("abc5");
		c2.add("abc6");
		c2.add("abc7");
	
		//System.out.println(c1.addAll(c2));
		
		//只要有一个被移除了就返回true
		//System.out.println(c1.removeAll(c2));
		
		//所有包含才算包含 
		//System.out.println(c1.containsAll(c2));
		//c1,c2两个集合，c1对c2做交集，结果保存在c1中，返回值表示c1是否发生改变
		System.out.println(c1.retainAll(c2));
		
		System.out.println("c1:"+c1);
		System.out.println("c2:"+c2);
		
	}
}

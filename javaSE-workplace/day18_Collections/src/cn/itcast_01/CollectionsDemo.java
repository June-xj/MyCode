package cn.itcast_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Colllections:针对集合操作的工具类，有对集合进行排序和二分查找方法
 * Collection:是单列集合的顶层接口，有子接口List和Set
 */
public class CollectionsDemo {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(30);
		list.add(20);
		list.add(50);
		list.add(10);
		list.add(40);
		
		//System.out.println("list:"+list);
		
//		Collections.sort(list);
//		System.out.println("list:"+list);
//		System.out.println("binarySearch:"+Collections.binarySearch(list, 30));
//		//找不到，返回最大索引加1
//		System.out.println("binarySearch:"+Collections.binarySearch(list, 300));
//		System.out.println("max:"+Collections.max(list));
//		Collections.reverse(list);
//		System.out.println("list:"+list);
		Collections.shuffle(list);
		System.out.println("list:"+list);
		
	}
}

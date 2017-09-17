package cn.itcast_03;

import java.util.ArrayList;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

public class ListDemo2 {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");
		
		//集合的长度功能size()
		for(int x=0;x<list.size();x++){
			System.out.println(list.get(x));
		}
		
	}
}

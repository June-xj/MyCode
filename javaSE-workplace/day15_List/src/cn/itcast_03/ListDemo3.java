package cn.itcast_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cn.itcast_02.Student;

public class ListDemo3 {
	public static void main(String[] args) {
		List list=new ArrayList();
		
		Student s1=new Student("lin",27);
		Student s2=new Student("feng",30);
		Student s3=new Student("linghu",33);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		Iterator it=list.iterator();
		while(it.hasNext()){
			Student s=(Student) it.next();
			System.out.println(s.getName()+"--"+s.getAge());
		}
		System.out.println("----------");
		
		for(int x=0;x<list.size();x++){
			Student s=(Student) list.get(x);
			System.out.println(s.getName()+"--"+s.getAge());
		}
	}
}

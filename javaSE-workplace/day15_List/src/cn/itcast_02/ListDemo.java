package cn.itcast_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List list=new ArrayList();
		
		Student s1=new Student("�׹Ǿ�",30);
		Student s2=new Student("֩�뾫",40);
		Student s3=new Student("����",22);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		Iterator it=list.iterator();
		while(it.hasNext()){
			Student s=(Student) it.next();
			System.out.println(s.getName()+"  "+s.getAge());
		}
	}
}

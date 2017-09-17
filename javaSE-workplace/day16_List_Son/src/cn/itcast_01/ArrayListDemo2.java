package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		
		Student s1=new Student("wusong",30);
		Student s2=new Student("luzhishen",28);
		Student s3=new Student("linchong",36);
		Student s4=new Student("yangzhi",38);
		
		arr.add(s1);
		arr.add(s2);
		arr.add(s3);
		arr.add(s4);
		
		Iterator it=arr.iterator();
		while(it.hasNext()){
			Student s=(Student) it.next();
			System.out.println(s.getName()+"---"+s.getAge());
		}
		System.out.println("------------");
		
		for(int x=0;x<arr.size();x++){
			Student s=(Student) arr.get(x);
			System.out.println(s.getName()+"  "+s.getAge());
		}
		
		
	}
}

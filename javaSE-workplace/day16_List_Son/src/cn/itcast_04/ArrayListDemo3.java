package cn.itcast_04;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {
	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		
		Student s1=new Student("zhang",18);
		Student s2=new Student("lin",40);
		Student s3=new Student("feng",30);
		Student s4=new Student("fu",35);
		Student s5=new Student("cui",16);
		Student s6=new Student("lin",40);
		Student s7=new Student("lin",27);
		
		arr.add(s1);
		arr.add(s2);
		arr.add(s3);
		arr.add(s4);
		arr.add(s5);
		arr.add(s6);
		arr.add(s7);
		
		ArrayList newArr=new ArrayList();
		
		Iterator it=arr.iterator();
		while(it.hasNext()){
			Student s=(Student) it.next();
			if(!newArr.contains(s)){
				newArr.add(s);
				
			}
			
		}
		
		
		for(int x=0;x<newArr.size();x++){
			Student s=(Student) newArr.get(x);
			System.out.println(s.getName()+"--"+s.getAge());
		}
		
		
	}
}

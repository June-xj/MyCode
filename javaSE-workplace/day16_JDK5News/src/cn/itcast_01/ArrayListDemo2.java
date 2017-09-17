package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList<Student> arr=new ArrayList<Student>();
		Student s1=new Student("lin",27);
		Student s2=new Student("diao",25);
		Student s3=new Student("zhu",24);
		Student s4=new Student("zhang",20);
		Student s5=new Student("wang",23);
		
		arr.add(s1);
		arr.add(s2);
		arr.add(s3);
		arr.add(s4);
		arr.add(s5);
		
		Iterator<Student> it=arr.iterator();
		while(it.hasNext()){
			Student s=it.next();
			System.out.println(s.getName()+"--"+s.getAge());
			
		}
		System.out.println("----------");
		
		for(int x=0;x<arr.size();x++){
			Student s=arr.get(x);
			System.out.println(s.getName()+"  "+s.getAge());
		}
		
		System.out.println("--------------");
		
		for(Student s:arr){
			System.out.println(s.getName()+"---"+s.getAge());
		}
	}
}

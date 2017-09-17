package cn.itcast_02;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList<Student> arr=new ArrayList<Student>();
		
		Student s1=new Student("zhuge",30);
		Student s2=new Student("jianggan",28);
		Student s3=new Student("caocao",40);
		
		arr.add(s1);
		arr.add(s2);
		arr.add(s3);
		
		Iterator<Student> it=arr.iterator();
		while(it.hasNext()){
			Student s=it.next();
			System.out.println(s.getName()+"  "+s.getAge());
		}
		
	}
}

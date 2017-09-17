package cn.itcast_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo {
	public static void main(String[] args) {
		List<Student> list=new ArrayList<Student>();
		Student s1=new Student("林青霞",27);
		Student s2=new Student("风清扬",30);
		Student s3=new Student("刘意",32);
		Student s4=new Student("林冲",25);
		Student s5=new Student("林青霞",27);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		//排序1(自然排序)
//		Collections.sort(list);		
		//排序2（比较器排序）
		//如果同时有自然排序和比较器排序，就用比较器
		Collections.sort(list, new Comparator<Student>(){

			@Override
			public int compare(Student s1, Student s2) {
				int num=s2.getAge()-s1.getAge();
				int num2=num==0?s2.getName().compareTo(s1.getName()):num;
				return num2;
			}
			
		});
		
		for(Student s:list){
			System.out.println(s.getName()+"--"+s.getAge());
		}
		
	}
}

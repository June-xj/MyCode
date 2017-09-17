package cn.itcast_07;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		//无参构造自然排序
		//TreeSet<Student> ts=new TreeSet<Student>();
		
		//比较器排序
		TreeSet<Student> ts=new TreeSet<Student>(new Comparator<Student>(){
			public int compare(Student s1, Student s2) {
				int num=s1.getName().length()-s2.getName().length();
				int num2=num==0?s1.getName().compareTo(s2.getName()):num;
				int num3=num2==0?s1.getAge()-s2.getAge():num2;
				return num3;
				
			}
		});
		
		Student s1=new Student("linhong",27);
		Student s2=new Student("fan",30);
		Student s3=new Student("wang",29);
		Student s4=new Student("linhong",27);
		Student s5=new Student("linda",20);
		Student s6=new Student("linhou",24);
		Student s7=new Student("linyong",24);
		Student s8=new Student("linhong",28);
		
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		ts.add(s7);
		ts.add(s8);
		
		for(Student s:ts){
			System.out.println(s.getName()+"  "+s.getAge());
		}
	}
}

package cn.itcast_05;

import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String[] args) {
		TreeSet<Student> ts=new TreeSet<Student>();
		
		Student s1=new Student("linhong",27);
		Student s2=new Student("fan",30);
		Student s3=new Student("wang",29);
		Student s4=new Student("lin",27);
		Student s5=new Student("linqing",20);
		Student s6=new Student("linhong",24);
		Student s7=new Student("feng",24);
		
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		ts.add(s7);
		
		for(Student s:ts){
			System.out.println(s.getName()+"  "+s.getAge());
		}
		
	}
}

package cn.itcast_02;

import java.util.HashSet;
/*
 * 存储自定义对象，并保证元素的唯一性
 * 两个对象的成员变量相同则为同一变量
 * 但是HashSet底层依赖的是hashCode和equals方法
 * 而这里没有在Student类中重写，所以哈希值不一样就不能保证唯一性
 */
public class HashSetDemo2 {
	public static void main(String[] args) {
		HashSet<Student> h=new HashSet<Student>();
		
		Student s1=new Student("lin",27);
		Student s2=new Student("fan",30);
		Student s3=new Student("wang",30);
		Student s4=new Student("lin",27);
		Student s5=new Student("lin",20);
		
		h.add(s1);
		h.add(s2);
		h.add(s3);
		h.add(s4);
		h.add(s5);
		
		for(Student s:h){
			System.out.println(s.getName()+"---"+s.getAge());
		}
		
	}
}

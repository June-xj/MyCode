package cn.itcast_04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest2 {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		
		Student s1=new Student("õõ²õ",25);
		Student s2=new Student("Ğ¡ÇÇ",16);
		Student s3=new Student("¹ØÓğ",30);
		Student s4=new Student();
		s4.setName("´óÇÇ");
		s4.setAge(26);
		
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(new Student("ËïÉĞÏã",18));
		
		Iterator it =c.iterator();
		while(it.hasNext()){
			Student s=(Student) it.next();
			System.out.println(s.getName()+"---"+s.getAge());
		}
		
	}
}

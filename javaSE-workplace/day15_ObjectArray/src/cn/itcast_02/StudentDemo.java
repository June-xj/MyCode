package cn.itcast_02;

import java.util.ArrayList;
import java.util.Collection;

public class StudentDemo {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		
		Student s1=new Student("lin",27);
		Student s2=new Student("feng",30);
		Student s3=new Student("linghu",33);
		Student s4=new Student("wu",25);
		Student s5=new Student("liu",22);
		
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);
		
		Object[] obj=c.toArray();
		
		for(int x=0;x<obj.length;x++){
			//System.out.println(obj[x]);
			
			Student s=(Student)obj[x];
			System.out.println(s.getName()+"--"+s.getAge());
			
		}
		
	}
}

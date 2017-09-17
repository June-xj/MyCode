package cn.itcast_03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class IteratorTest {
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
		
		//while
		Iterator it=c.iterator();
		while(it.hasNext()){
			//1
			//System.out.println(it.next());
			
			//2
			Student s=(Student)it.next();
			System.out.println(s.getName()+"--"+s.getAge());
			
			//3  不要多次使用it.next()
			//NoSuchElementException
//			System.out.println(((Student)it.next()).getName()+"---"
//					+((Student)it.next()).getAge());
			
			
			
		}
		
		//for
//		for(Iterator it=c.iterator();it.hasNext();){
//			Student s=(Student)it.next();
//			System.out.println(s.getName()+"--"+s.getAge());
//		}
		
	}
}

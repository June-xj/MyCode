package cn.itcast_04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
	public static void main(String[] args) {
		Collection c=new ArrayList();		
		
		c.add("lin");
		c.add("feng");
		c.add("linghu");
		c.add("wu");
		c.add("liu");
		
		Iterator it=c.iterator();
		while(it.hasNext()){
			String s=(String) it.next();
			System.out.println(s);
		}
		
	}
}

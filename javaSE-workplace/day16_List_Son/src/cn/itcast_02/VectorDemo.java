package cn.itcast_02;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector v=new Vector();
		
		v.addElement("hello");
		v.addElement("world");
		v.addElement("java");
		
		for(int x=0;x<v.size();x++){
			String s=(String) v.elementAt(x);
			System.out.println(s);
		}
		
		System.out.println("-------------");
		
		Enumeration en=v.elements();
		while(en.hasMoreElements()){
			String s=(String) en.nextElement();
			System.out.println(s);
		}
		
		
	}
}

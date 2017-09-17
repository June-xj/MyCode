package cn.itcast_03;

import java.util.HashSet;

public class DogDemo {
	public static void main(String[] args) {
		HashSet<Dog> h=new HashSet<Dog>();
		
		Dog d1=new Dog("小黑",10,"黑色",'男');
		Dog d2=new Dog("小白",9,"白色",'女');
		Dog d3=new Dog("小黑",10,"黑色",'男');
		Dog d4=new Dog("小黑",8,"黑色",'女');
		Dog d5=new Dog("小灰",7,"灰色",'女');
		Dog d6=new Dog("小虎",6,"棕色",'女');
		Dog d7=new Dog("小虎",6,"棕色",'女');
		Dog d8=new Dog("小虎",6,"棕色",'男');
		
		h.add(d1);
		h.add(d2);
		h.add(d3);
		h.add(d4);
		h.add(d5);
		h.add(d6);
		h.add(d7);
		h.add(d8);
		
		for(Dog d:h){
			System.out.println(d.getName()+" "+d.getAge()+" "+d.getColor()+" "+d.getSex());
		}
		
	}
	
	
	
}

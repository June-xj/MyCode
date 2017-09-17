package cn.itcast_06;

public class IntegerDemo {
	public static void main(String[] args) {
		Integer i1=new Integer(127);
		Integer i2=new Integer(127);
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		System.out.println("-------------------");
		
		Integer i3=new Integer(128);
		Integer i4=new Integer(128);
		System.out.println(i3==i4);
		System.out.println(i3.equals(i4));
		System.out.println("------------------");
		
		Integer i5=128;
		Integer i6=128;
		System.out.println(i5==i6);
		System.out.println(i5.equals(i6));
		System.out.println("----------------");
		
		Integer i7=127;
		Integer i8=127;
		System.out.println(i7==i8);
		System.out.println(i7.equals(i8));
		System.out.println("----------------");
		
		//通过查看源码，Integer的数据直接赋值，针对-128到127之间的数据，建了一个数据缓冲池，如果数据在这个范围内不重新创建空间
		//Integer ii=Integer.valueOf(127);
		
		
	}
	
}

package cn.itcast_03;

public class StudentDemo {
	public static void main(String[] args) {
		Student s1=new Student("lin",27);
		Student s2=new Student("lin",27);
		System.out.println(s1==s2);//false
		Student s3=s1;
		System.out.println(s1==s3);
		System.out.println("----------------");
		
		//equals方法默认比较地址值,比较地址值一般意义不大
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equals(s1));
		System.out.println(s1.equals(s3));
		Student s4=new Student("feng",30);
		System.out.println(s1.equals(s4));
		Demo d=new Demo();
		System.out.println(s1.equals(d));//ClassCastException
		
	}

}
class Demo{}

package cn.itcast_01;

public class StudentTest {
	public static void main(String[] args) {
		Student s1=new Student();
		System.out.println(s1.hashCode());//705927765
		
		Student s2=new Student();
		System.out.println(s2.hashCode());//366712642
		
		Student s3=s1;
		System.out.println(s3.hashCode());//705927765
		
		Student s=new Student();
		Class c=s.getClass();
		String str=c.getName();
		System.out.println(str);//cn.itcast_01.Student
		
		//Á´Ê½±à³Ì
		String str2=s.getClass().getName();
		System.out.println(str2);//cn.itcast_01.Student
		
	}
}

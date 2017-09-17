package cn.itcast_04;

public class StudentDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s=new Student();
		s.setName("lin");
		s.setAge(27);
		//克隆学生对象;Cloneable接口是一个标记接口，表明实现该接口的类就可以实现对象的复制
		Object obj=s.clone();
		Student s2=(Student)obj;
		
		System.out.println(s.getName()+"---"+s.getAge());
		System.out.println(s2.getName()+"---"+s2.getAge());
		System.out.println("---------------");
		//不克隆
		Student s3=s;
		System.out.println(s3.getName()+"---"+s3.getAge());
		System.out.println("---------------");
		
		//有区别
		s3.setName("liu");
		s3.setAge(30);
		System.out.println(s.getName()+"---"+s.getAge());
		System.out.println(s2.getName()+"---"+s2.getAge());
		System.out.println(s3.getName()+"---"+s3.getAge());
		
	}

}


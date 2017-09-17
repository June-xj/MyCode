package cn.itcast_05;

public class Student implements Comparable<Student>{
	private String name;
	private int age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	} 
	@Override
	public int compareTo(Student arg0) {
		//return 0;
		//return 1;
		//return -1;
		
		//°´ÄêÁäÅÅĞò
		int num=this.age-arg0.age;
		int num2=num==0?this.name.compareTo(arg0.name):num;
		
		return num2;
	}
	
	
	
}

package cn.itcast_03;

public class Student {

	private String name;
	private int age;
	
	
	public Student() {
		super();
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}

	

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

//	@Override
//	//重写equals
//	public boolean equals(Object obj) {
//		//return true;
//		//根据比较的成员变量返回
//		//name是String类型，String是引用类型，不能用==比较，用equals
//		//String的equals方法是重写自Object类的，比较的是字符串内容是否相等
//		Student s=(Student)obj;
//		if(this.name.equals(s.name)&&this.age==s.age){
//			return true;
//		}else{
//			return false;
//		}
	
//	@Override
//	//重写equals
//	public boolean equals(Object obj) {
//		if(this==obj){
//			return true;
//		}
//		//判断是不是学生的对象
//		//判断对象是否是某个类的对象：对象名instanceof 类名
//		
//		if(!(obj instanceof Student)){
//			return false;
//		}
//		Student s=(Student)obj;
//		return this.name.equals(s.name)&&this.age==s.age;
//		
//	}
	
	
	
}

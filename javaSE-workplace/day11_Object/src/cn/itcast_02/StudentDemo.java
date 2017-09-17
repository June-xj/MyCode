package cn.itcast_02;

public class StudentDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		System.out.println(s.hashCode());
		System.out.println(s.getClass().getName());
		
		System.out.println(s.toString());//cn.itcast_02.Student@2a139a55
		System.out.println("------------------");
		//toString()方法的值等价于getClass().getName()+‘@’+Integer。toHexString(hashCode())
		System.out.println(s.getClass().getName()+'@'+Integer.toHexString(s.hashCode()));
		System.out.println(s.toString());
		
		//直接输出对象名称,相当于调用toString()方法
		System.out.println(s);
		
	}

}

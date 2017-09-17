package cn.itcast_01;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<ArrayList<Student>> bigALs=new ArrayList<ArrayList<Student>>();
		
		ArrayList<Student> big1=new ArrayList<Student>();
		Student s1=new Student("ÌÆÉ®",30);
		Student s2=new Student("ËïÎò¿Õ",29);
		Student s3=new Student("Öí°Ë½ä",28);
		Student s4=new Student("É³É®",27);
		Student s5=new Student("°×ÁúÂí",26);
		
		big1.add(s1);
		big1.add(s2);
		big1.add(s3);
		big1.add(s4);
		big1.add(s5);
		bigALs.add(big1);
		
		ArrayList<Student> big2=new ArrayList<Student>();
		Student s11=new Student("lin",30);
		Student s22=new Student("zhu",23);
		Student s33=new Student("bao",24);
		Student s44=new Student("sha",25);
		
		big2.add(s11);
		big2.add(s22);
		big2.add(s33);
		big2.add(s44);
		bigALs.add(big2);

		ArrayList<Student> big3=new ArrayList<Student>();
		Student s111=new Student("Öî¸ğÁÁ",30);
		Student s222=new Student("Ë¾ÂíÜ²",28);
		Student s333=new Student("ÖÜè¤",26);
		
		big3.add(s111);
		big3.add(s222);
		big3.add(s333);
		bigALs.add(big3);
		
		for(ArrayList<Student> array:bigALs){
			for(Student s:array){
				System.out.println(s.getName()+"---"+s.getAge());
			}
				
		}
		
	}
}

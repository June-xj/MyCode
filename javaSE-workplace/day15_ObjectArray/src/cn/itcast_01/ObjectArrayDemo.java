package cn.itcast_01;

public class ObjectArrayDemo {
	public static void main(String[] args) {
		Student[] students=new Student[5];
		
		Student s1=new Student("lin",27);
		Student s2=new Student("feng",30);
		Student s3=new Student("liu",30);
		Student s4=new Student("zhao",60);
		Student s5=new Student("wang",35);
		
		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
		students[3]=s4;
		students[4]=s5;
		
//		for(int x=0;x<students.length;x++){
//			students[x]=s+""+(x+1);
//		}
		
		for(int x=0;x<students.length;x++){
			//System.out.println(students[x]);
		
			Student s=students[x];
			System.out.println(s.getName()+"---"+s.getAge());
		
		}
		
		
		
		
	}
}

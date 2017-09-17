package cn_itcast_04;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2 {
	public static void main(String[] args) {
		TreeMap<Student,String> tm=new TreeMap<Student,String>(
				new Comparator<Student>(){
					@Override
					public int compare(Student s1, Student s2) {
						int num=s1.getAge()-s2.getAge();
						int num2=num==0?s1.getName().compareTo(s2.getName()):num;
						return num2;
					}
					
				}
				);
		Student s1=new Student("ÅË°²",30);
		Student s2=new Student("ÁøÏÂ»İ",35);
		Student s3=new Student("ÌÆ²®»¢",33);
		Student s4=new Student("ÑàÇà",32);
		Student s5=new Student("ÌÆ²®»¢",33);
		
		tm.put(s1,"ËÎ³¯");
		tm.put(s2, "Ôª³¯");
		tm.put(s3, "Ã÷³¯");
		tm.put(s4, "Çå³¯");
		tm.put(s5, "ºº³¯");
		
		Set<Student> set=tm.keySet();
		//TreeMap.compare(Unknown Source)
		for(Student key:set){
			String value=tm.get(key);
			System.out.println(key.getName()+"  "+key.getAge()+"--"+value);
		}
		
	}
}

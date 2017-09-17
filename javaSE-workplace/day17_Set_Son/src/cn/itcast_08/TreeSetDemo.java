package cn.itcast_08;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * 键盘录入5个学生信息（姓名，语文成绩，数学成绩，英语成绩）
 * 按照总分从高到低输出到控制台
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Student> t=new TreeSet<Student>(new Comparator<Student>(){
			@Override
			public int compare(Student s1, Student s2) {
				int num=s2.getSum()-s1.getSum();
				int num2=num==0?s1.getChinese()-s2.getChinese():num;
				int num3=num2==0?s1.getMath()-s2.getMath():num2;
				int num4=num3==0?s1.getEnglish()-s2.getEnglish():num3;
				
				int num5=num4==0?s1.getName().length()-s2.getName().length():num4;
				
				return num5;
			}
		});
		
		for(int x=1;x<=5;x++){
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入第"+x+"个学生的姓名：");
			String name=sc.nextLine();
			System.out.println("请输入第"+x+"个学生的语文成绩：");
			String cs=sc.nextLine();
			System.out.println("请输入第"+x+"个学生的数学成绩：");
			String ms=sc.nextLine();
			System.out.println("请输入第"+x+"个学生的英语成绩：");
			String es=sc.nextLine();
			
			Student s=new Student();
			s.setName(name);
			s.setChinese(Integer.parseInt(cs));
			s.setMath(Integer.parseInt(ms));
			s.setEnglish(Integer.parseInt(es));
			
			t.add(s);
		}
		System.out.println("学生信息录入完毕！");
		System.out.println("-------");
		System.out.println("姓名\t语文成绩\t数学成绩\t英语成绩");
		
		for(Student s:t){
			System.out.println(s.getName()+"\t"+s.getChinese()+"\t"+s.getMath()+"\t"+s.getEnglish());
		}
		
	}
}

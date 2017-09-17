package cn.itcast_08;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * ����¼��5��ѧ����Ϣ�����������ĳɼ�����ѧ�ɼ���Ӣ��ɼ���
 * �����ִܷӸߵ������������̨
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
			System.out.println("�������"+x+"��ѧ����������");
			String name=sc.nextLine();
			System.out.println("�������"+x+"��ѧ�������ĳɼ���");
			String cs=sc.nextLine();
			System.out.println("�������"+x+"��ѧ������ѧ�ɼ���");
			String ms=sc.nextLine();
			System.out.println("�������"+x+"��ѧ����Ӣ��ɼ���");
			String es=sc.nextLine();
			
			Student s=new Student();
			s.setName(name);
			s.setChinese(Integer.parseInt(cs));
			s.setMath(Integer.parseInt(ms));
			s.setEnglish(Integer.parseInt(es));
			
			t.add(s);
		}
		System.out.println("ѧ����Ϣ¼����ϣ�");
		System.out.println("-------");
		System.out.println("����\t���ĳɼ�\t��ѧ�ɼ�\tӢ��ɼ�");
		
		for(Student s:t){
			System.out.println(s.getName()+"\t"+s.getChinese()+"\t"+s.getMath()+"\t"+s.getEnglish());
		}
		
	}
}
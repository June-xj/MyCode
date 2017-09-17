package cn.itcast_03;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//获取两个int
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		System.out.println("a:"+a+"b:"+b);
//		System.out.println("---------------------");
		
		//获取两个String
//		String s1=sc.nextLine();
//		String s2=sc.nextLine();
//		System.out.println("s1:"+s1+"s2:"+s2);
//		System.out.println("--------------------");
		
//		String s1=sc.nextLine();
//		int b=sc.nextInt();
//		System.out.println("s1:"+s1+"b:"+b);
		
		//先获取一个数值，再获取一个字符串，会出现问题
		//因为回车键是一个换行符，代表字符
//		int a=sc.nextInt();
//		String s2=sc.nextLine();
//		System.out.println("a:"+a+"s2:"+s2);
		
		//先获取数值，在创建新对象获取字符
//		int a=sc.nextInt();
//		Scanner sc2=new Scanner(System.in);
//		String s2=sc2.nextLine();
//		System.out.println("a:"+a+"s2:"+s2);
		//还可以把所有数据都按照字符串获取，要什么就对应转换为什么类型
		
	}
}

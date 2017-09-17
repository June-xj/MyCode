package cn.itcast_02;

import java.util.Scanner;

//一个功能，实现任意范围的随机数
public class MathDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Start:");
		int start=sc.nextInt();
		Scanner sc1=new Scanner(System.in);
		System.out.println("end:");
		int end=sc1.nextInt();
		
		for(int x=0;x<100;x++){
			int num=getRandom(start,end);
			System.out.println(num);
		}
	}
	
	public static int getRandom(int start,int end){
		int number=(int)(Math.random()*(end-start+1))+start;
		return number;
	}
}

package cn.itcast_02;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		//创建对象
		Scanner sc=new Scanner(System.in);
		//获取数据
		if(sc.hasNextInt()){
			int x=sc.nextInt();
			System.out.println("x:"+x);
		}else{
			System.out.println("Wrong Input!");
		}
	}
}

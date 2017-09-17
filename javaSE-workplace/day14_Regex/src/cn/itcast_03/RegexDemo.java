package cn.itcast_03;

import java.util.Scanner;

public class RegexDemo {
	public static void main(String[] args) {
		String ages="18-24";
		
		String regex="-";
		String[] strArray=ages.split(regex);
//		for(int x=0;x<strArray.length;x++){
//			System.out.println(strArray[x]);
//		}
		
		int startAge=Integer.parseInt(strArray[0]);
		int endAge=Integer.parseInt(strArray[1]);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please input your age:");
		int age=sc.nextInt();
		
		if(age>=startAge&&age<=endAge){
			System.out.println("Find you!");
			
		}else{
			System.out.println("Sorry!!");
		}
	}
}

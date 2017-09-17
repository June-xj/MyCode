package cn.itcast_02;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.max;


public class StaticImportDemo {
	public static void main(String[] args) {
//		System.out.println(java.lang.Math.abs(-100));
//		System.out.println(java.lang.Math.pow(2, 3));
//		System.out.println(java.lang.Math.max(20, 30));
		
//		System.out.println(Math.abs(-100));
//		System.out.println(Math.pow(2, 3));
//		System.out.println(Math.max(20, 30));
		
		System.out.println(java.lang.Math.abs(-100));
		System.out.println(pow(2, 3));
		System.out.println(max(20, 30));
		
		
		
	}
	public static void abs(String s){
		System.out.println(s);
	}
}

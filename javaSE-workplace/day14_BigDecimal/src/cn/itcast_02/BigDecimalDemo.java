package cn.itcast_02;

import java.math.BigDecimal;

public class BigDecimalDemo {
	public static void main(String[] args) {
		//float/double容易丢失精度
//		System.out.println(0.09+0.01);
//		System.out.println(1.0-0.32);
//		System.out.println(1.015*100);
//		System.out.println(1.301/100);
		
		BigDecimal b1=new BigDecimal("0.09");
		BigDecimal b2=new BigDecimal("0.01");
		System.out.println("add:"+b1.add(b2));
		
		BigDecimal b3=new BigDecimal("1.0");
		BigDecimal b4=new BigDecimal("0.32");
		System.out.println("subtract:"+b3.subtract(b4));
		
		BigDecimal b5=new BigDecimal("1.015");
		BigDecimal b6=new BigDecimal("100");
		System.out.println("multiply:"+b5.multiply(b6));
		
		BigDecimal b7=new BigDecimal("1.301");
		BigDecimal b8=new BigDecimal("100");
		System.out.println("divide:"+b7.divide(b8));
		//舍取方式，ROUND_HALF_UP
		System.out.println("divide:"+b7.divide(b8,3,BigDecimal.ROUND_HALF_UP));
		System.out.println("divide:"+b7.divide(b8,8,BigDecimal.ROUND_HALF_UP));
	}
}

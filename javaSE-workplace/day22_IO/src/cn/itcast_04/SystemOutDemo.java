package cn.itcast_04;

import java.io.PrintStream;

/*
 * InputStream is=System.in
 * OutputStream os=System.out
 */
public class SystemOutDemo {
	public static void main(String[] args) {
		PrintStream ps=System.out;
		ps.println("hello world");
		//Ïàµ±ÓÚ
		System.out.println("hello world");
		
	}
}

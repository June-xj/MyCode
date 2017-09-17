package cn.itcast_03;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 打印流特点：只能读不能写(只能操作目的地)
 */
public class PrintStreamDemo {
	public static void main(String[] args) throws IOException {
		PrintWriter pw=new PrintWriter("pw.txt");
		
		pw.write("hello");
		pw.write("world");
		pw.write("java");
		
		pw.close();
		
		
		
	}
}

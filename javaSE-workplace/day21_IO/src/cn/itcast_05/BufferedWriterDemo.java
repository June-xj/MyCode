package cn.itcast_05;
/*
 * ×Ö·û»º³åÁ÷
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw=new BufferedWriter(new FileWriter("a.txt"));
		
		bw.write("hello");
		bw.write("world");
		bw.write("java");
		
		bw.flush();
		
		bw.close();
		
	}
}

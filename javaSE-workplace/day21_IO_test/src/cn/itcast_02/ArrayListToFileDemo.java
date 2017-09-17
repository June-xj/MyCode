package cn.itcast_02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 把ArrayList集合中的字符串数据存储到文本文件
 */
public class ArrayListToFileDemo {
	public static void main(String[] args) throws IOException {
		ArrayList<String> array=new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("a.txt"));
		for(String s:array){
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		
		bw.close();
		
	}
}

package cn.itcast_09;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class NIODemo {
	public static void main(String[] args) throws IOException {
		//¸´ÖÆÎÄ¼þ
		//Files.copy(Paths.get("DataStreamDemo.java"), new FileOutputStream("copy.java"));
		
		ArrayList<String> array=new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
		Files.write(Paths.get("array.txt"), array, Charset.forName("GBK"));
		
		
	}
}

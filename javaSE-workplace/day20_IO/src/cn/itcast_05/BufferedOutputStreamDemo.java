package cn.itcast_05;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("bos.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		
		bos.write("hello".getBytes());
		
		bos.close();
		
	}
}

package cn.itcast_05;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException {
		read();
		write();
		
	}

	private static void write() throws IOException {
RandomAccessFile raf=new RandomAccessFile("raf.txt","rw");
		
		raf.writeInt(100);
		raf.writeChar('a');
		raf.writeUTF("中国");
		
		raf.close();
	}

	private static void read() throws IOException {
		RandomAccessFile raf=new RandomAccessFile("raf.txt","rw");
		
		int i=raf.readInt();
		System.out.println(i);
		System.out.println("当前文件指针位置："+raf.getFilePointer());
		
		char c=raf.readChar();
		System.out.println(c);
		System.out.println("当前文件指针位置："+raf.getFilePointer());
		
		String s=raf.readUTF();
		System.out.println(s);
		System.out.println("当前文件指针位置："+raf.getFilePointer());
		
		raf.seek(4);
		c=raf.readChar();
		System.out.println(c);
		
		raf.close();
	}
}

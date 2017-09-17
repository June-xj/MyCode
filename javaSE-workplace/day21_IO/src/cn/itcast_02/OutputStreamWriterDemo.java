package cn.itcast_02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
		//默认GBK
		//OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("osw.txt"));
		//指定GBK
		//OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("osw.txt"),"GBK");		
		//UTF-8
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("osw.txt"),"UTF-8");
		osw.write("中国");
		
		osw.close();
		
	}
}

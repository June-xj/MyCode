package cn.itcast_01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		//FileOutputStream fos=new FileOutputStream("fos3.txt");
		//追加在文件末尾
		FileOutputStream fos=new FileOutputStream("fos3.txt",true);
		for(int x=0;x<10;x++){
			fos.write(("hello"+x).getBytes());
			fos.write("\r\n".getBytes());
		}
		fos.close();
	}
}

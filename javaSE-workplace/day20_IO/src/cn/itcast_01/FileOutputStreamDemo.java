package cn.itcast_01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("fos2.txt");
		
//		fos.write(97); //其实写入的是字符值a
//		fos.write(57);
//		fos.write(55);
		
		byte[] b={97,98,99,100,101};
		fos.write(b);
		fos.write(b,1,3);
		fos.close();
		
	}
}

package cn.itcast_03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("osw1.txt"));
//		osw.write("我爱你");
		osw.write("我爱你",1,2);
		
		osw.flush();
//		osw.write("我爱你",1,2);
		osw.close();
		//osw.write("我爱你",1,2);//Stream closed
		
	}
}

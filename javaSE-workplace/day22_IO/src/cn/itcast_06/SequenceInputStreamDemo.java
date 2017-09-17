package cn.itcast_06;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;

public class SequenceInputStreamDemo {
	public static void main(String[] args) throws IOException {
		InputStream s1=new FileInputStream("DataStreamDemo.java");
		InputStream s2=new FileInputStream("copy.java");
		SequenceInputStream sis=new SequenceInputStream(s1,s2);
		
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("Sequence.java"));
		byte[] bys=new byte[1024];
		int len=0;
		while((len=sis.read(bys))!=-1){
			bos.write(bys,0,len);
		}
		
		bos.close();
		sis.close();
		
	}
}

package cn.itcast_06;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SquenceInputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		Vector<InputStream> v=new Vector<InputStream>();
		
		InputStream s1=new FileInputStream("DataStreamDemo.java");
		InputStream s2=new FileInputStream("DataStreamDemo.java");
		InputStream s3=new FileInputStream("DataStreamDemo.java");
		
		v.add(s1);
		v.add(s2);
		v.add(s3);
		
		Enumeration<InputStream> en=v.elements();
		SequenceInputStream sis=new SequenceInputStream(en);
		
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

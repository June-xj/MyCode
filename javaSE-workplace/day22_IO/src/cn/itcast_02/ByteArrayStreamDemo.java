package cn.itcast_02;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayStreamDemo {
	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		
		for(int x=0;x<10;x++){
			baos.write(("hello"+x).getBytes());
		}
		
		//baos.close();
		
		byte[] bys=baos.toByteArray();
		ByteArrayInputStream bais=new ByteArrayInputStream(bys);
		
		int b=0;
		while((b=bais.read())!=-1){
			System.out.print((char)b);
			
		}
		
	}
}

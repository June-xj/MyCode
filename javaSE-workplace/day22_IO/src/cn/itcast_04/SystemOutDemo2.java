package cn.itcast_04;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class SystemOutDemo2 {
	public static void main(String[] args) throws IOException {
//		OutputStream os=System.out;
		
//		OutputStreamWriter osw=new OutputStreamWriter(os);
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("hello");
		bw.flush();
		
	}
}

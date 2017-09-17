package cn.itcast_01;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 * 使用指定字符集解码字节数组和把字符串编码为字节数组
 * 
 * 编码：String--byte[]
 * 解码：byte[]--String
 */
public class StringDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s="你好";
//		byte[] b=s.getBytes();
//		byte[] b=s.getBytes("GBK");
//		System.out.println(Arrays.toString(b));//[-60, -29, -70, -61]
		byte[] b=s.getBytes("UTF-8");//[-28, -67, -96, -27, -91, -67]
		System.out.println(Arrays.toString(b));
		
		String ss=new String(b);
//		String ss=new String(b,"GBK");
//		String ss=new String(b,"UTF-8");//???
		System.out.println(ss);
		
	}
}

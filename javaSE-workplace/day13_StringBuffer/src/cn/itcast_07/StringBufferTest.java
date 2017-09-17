package cn.itcast_07;

//String和StringBuffer的相互转换
public class StringBufferTest {
	public static void main(String[] args) {
		String s="hello";
		//不能把字符串的值直接赋给StringBuffer
		//StringBuffer sb="hello";
		//StringBuffer sb=s;
		
		StringBuffer sb=new StringBuffer(s);
		StringBuffer sb2=new StringBuffer();
		sb2.append(s);
		System.out.println(sb);
		System.out.println(sb2);
		System.out.println("---------------");
		
		StringBuffer buffer=new StringBuffer("java");
		String str=new String(buffer);
		String str2=buffer.toString();
		System.out.println(str);
		System.out.println(str2);
		
	}
}

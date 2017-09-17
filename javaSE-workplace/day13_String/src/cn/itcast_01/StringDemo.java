package cn.itcast_01;
/*
 * 
 */
public class StringDemo {
	public static void main(String[] args) {
		//public String():空构造
		String s1=new String();
		System.out.println("s1:"+s1);
		System.out.println("s1.length():"+s1.length());
		
		//public String(byte[] bytes):把字节数组转换为字符串
		byte[] bys={97,98,99,100,101};
		String s2=new String(bys);
		System.out.println("s2:"+s2);
		System.out.println("s2.length():"+s2.length());
		
		//把字节数组一部分转换为字符串：public String(byte[] bytes,int index,int length)
		String s3=new String(bys,1,3);
		System.out.println("s3:"+s3);
		System.out.println("s3.length():"+s3.length());
		
		//public String(char[] value)
		char[] chs={'a','b','c','d','e','爱','林','请'};
		String s4=new String(chs);
		System.out.println("s4:"+s4);
		System.out.println("s4.length():"+s4.length());
		
		//public String(char[] value,int index,int count)
		String s5=new String(chs,2,4);
		System.out.println("s5:"+s5);
		System.out.println("s5.length():"+s5.length());
		
		//public String(String original)
		String s6=new String("abcde");
		System.out.println("s6:"+s6);
		System.out.println("s6.length():"+s6.length());
	
	}
}

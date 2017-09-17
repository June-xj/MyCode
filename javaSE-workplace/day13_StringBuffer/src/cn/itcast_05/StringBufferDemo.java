package cn.itcast_05;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		
		sb.append("¡÷«‡œº");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
	}
}

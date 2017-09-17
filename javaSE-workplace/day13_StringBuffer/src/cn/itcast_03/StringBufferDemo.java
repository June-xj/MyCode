package cn.itcast_03;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		sb.append("hello").append("world").append("java");
		System.out.println(sb);
		//deleteCharAt删除指定位置
//		sb.deleteCharAt(1);
//		sb.deleteCharAt(1);
		
		//delete删除从指定位置到指定结束，包左不包右
//		sb.delete(5, 10);
		
		//删除所有
		sb.delete(0, sb.length());
		System.out.println(sb);
	}
}

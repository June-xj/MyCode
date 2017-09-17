package cn.itcast_02;

public class StringDemo {
	public static void main(String[] args) {
		String s1="helloworld";
		String s2="helloworld";
		String s3="HELLOWORLD";
		System.out.println("equals:"+s1.equals(s2));
		System.out.println("equals:"+s1.equals(s3));
		
		System.out.println("equals:"+s1.equalsIgnoreCase(s2));
		System.out.println("equals:"+s1.equalsIgnoreCase(s3));
		
		System.out.println("contains:"+s1.contains("hello"));
		System.out.println("contains:"+s1.contains("world"));
		
		System.out.println("startsWith:"+s1.startsWith("h"));
		System.out.println("startsWith:"+s1.startsWith("hello"));
		System.out.println("startsWith:"+s1.startsWith("world"));
		
		System.out.println("isEmpty:"+s1.isEmpty());
		
		String s4="";
		String s5=null;//对象不存在，不能调用方法，空指针异常
		System.out.println("isEmpty:"+s4.isEmpty());
		System.out.println("isEmpty:"+s5.isEmpty());
		
	
	}
}

package cn.itcast_04;

public class StringDemo {
	public static void main(String[] args) {
		String s="javaSe";
		
		byte[] bys=s.getBytes();
		for(int x=0;x<bys.length;x++){
			System.out.println(bys[x]);
		}
		System.out.println("--------------");
		
		char[] chs=s.toCharArray();
		for(int x=0;x<chs.length;x++){
			System.out.println(chs[x]);
		}
		System.out.println("--------------");
		
		String ss=String.valueOf(chs);
		System.out.println(ss);
		System.out.println("--------------");
		
		int i=100;
		String sss=String.valueOf(i);
		System.out.println(sss);
		System.out.println("----------------");
		
		System.out.println("toLowerCase:"+s.toLowerCase());
		System.out.println(s);
		
		System.out.println("toUpperCase:"+s.toUpperCase());
		System.out.println(s);
	}
}

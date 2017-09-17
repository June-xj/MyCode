package cn.itcast_05;

public class StringTest3 {
public static void main(String[] args) {
		
		String s1="woaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijava";
		String s2="java";
		int c=getCount(s1,s2);
		System.out.println(c);
	}
	public static int getCount(String s1,String s2){
		int count=0;
//		int index=s1.indexOf("java");
//		while(index!=-1){
//			count++;
//			s1=s1.substring(index+s2.length());
//			index=s1.indexOf(s2);
//			
//		}
		
		int index;
		while((index=s1.indexOf(s2))!=-1){
			count++;
			s1=s1.substring(index+s2.length());
			
		}
		return count;
	}
}

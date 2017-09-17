package cn.itcast_07;

public class StringBufferTest2 {
	public static void main(String[] args) {
		int[] arr={44,33,55,11,22};
		String s1=arrayToString(arr);
		System.out.println(s1);
		
		String s2=arrayToString2(arr);
		System.out.println(s2);
	}
	
	//用String拼接
	public static String arrayToString(int[] arr){
		String s="";
		s+="[";
		for(int x=0;x<arr.length;x++){
			if(x==arr.length-1){
				s+=arr[x];
			}else{
				s+=arr[x];
				s+=",";
			}
		}
		s+="]";
		return s;
	}
	
	//用StringBuffer拼接
	public static String arrayToString2(int[] arr){
		StringBuffer sb=new StringBuffer();
		sb.append("[");
		for(int x=0;x<arr.length;x++){
			if(x==arr.length-1){
				sb.append(arr[x]);
	
			}else{
				sb.append(arr[x]).append(",");
			}
			
		}
		sb.append("]");
		return sb.toString();
	}
}

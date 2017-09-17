package cn.itcast_01;
/*
 * Scanner:用于键盘录入数据
 * System类下有一个静态字段：
 * 		public static final InputStream in; 标准的输入流，对应着键盘录入
 * 
 * 		InputStream is=System.in;
 * 
 */
import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {  
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in); 
		int[] pri=new int[] {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47, 53,59,61,67,71,73,79,83,89,97,101,103,107,109,113, 127,131,137,139,149,151,157,163,167,173,179,181,191,193,197, 199,211,223,227,229,233,239,241,251,257,263,269,271,277,281, 283,293,307,311,313,317,331,337,347,349,353,359,367,373,379, 383,389,397,401,409,419,421,431}; 
	    int[] arr=new int[84]; 
	    while(input.hasNext()){ 
		    int c=input.nextInt(); 
		    int n=input.nextInt(); 
		    int k=c-n; 
		    for(int i=0;i< 83;i++){
			    arr[i]= re(c,pri[i])-re(n,pri[i])-re(k,pri[i]);  
		    }
		    long result=1; 
		    for(int i=0;i< 84;i++){
			    if(arr[i]!=0) 
			    	result*=(arr[i]+1);
		    }
		    System.out.println(result); 
		} 
	} 
	public static int re(int n, int p){ 
	     if(n < p) 
	    	 return 0; 
	     else 
	    	 return n / p + re(n / p, p); 
	} 
}

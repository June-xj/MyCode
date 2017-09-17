package TestOne;

import java.util.Scanner;

public class TestOne {
	public static void main(String[] args) {
		int arr[]={0};
		for(int x=0;x<(10^9);x++){
			arr[x]=x+1;
		}
		int out=0;
		while(true){
			Scanner sc=new Scanner(System.in);
			Scanner sc1=new Scanner(System.in);
			int k=sc.nextInt();
			int m=sc1.nextInt();
			if(m==1&&k>1){
				break;
			}
			
		}
		System.out.println(out);
	}
}

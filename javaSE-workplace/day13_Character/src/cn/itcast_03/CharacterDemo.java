package cn.itcast_03;

import java.util.Scanner;

public class CharacterDemo {
	public static void main(String[] args) {
		int bigCont=0;
		int smallCont=0;
		int nuberCont=0;
		
		Scanner sc=new Scanner(System.in);
		String line=sc.nextLine();
		
		char[] chs=line.toCharArray();
		
		for(int x=0;x<chs.length;x++){
			char ch=chs[x];
			
			if(Character.isLowerCase(ch)){
				smallCont++;
			}else if(Character.isUpperCase(ch)){
				bigCont++;
			}else if(Character.isDigit(ch)){
				nuberCont++;
			}
		}
		System.out.println(bigCont);
		System.out.println(smallCont);
		System.out.println(nuberCont);
	}
}

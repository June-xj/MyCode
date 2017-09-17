package cn.itcast_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * 键盘录入多个数据，以0结束，要求在控制台输出这多个数据的中的最大值
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		while(true){
			System.out.println("Please input:");
			int number =sc.nextInt();
			if(number!=0){
				arr.add(number);
			}else{
				break;
			}
		}
		
		Integer[] i=new Integer[arr.size()];
		//i和ii的地址值一样，是同一个，所以不用将i转为ii
		//Integer[] ii=arr.toArray(i);
		arr.toArray(i);
		//System.out.println(i);
		//System.out.println(ii);
		
		Arrays.sort(i);
		System.out.println("数组是："+arrayToString(i)+"最大值是："+i[i.length-1]);
		
	}
	
	public static String arrayToString(Integer[] i){
		StringBuilder sb=new StringBuilder();
		
		sb.append("[");
		for(int x=0;x<i.length;x++){
			if(x==i.length-1){
				sb.append(i[x]);
			}else{
				sb.append(i[x]).append(", ");
			}
		}
		sb.append("]");
		
		return sb.toString();
		
	}
}

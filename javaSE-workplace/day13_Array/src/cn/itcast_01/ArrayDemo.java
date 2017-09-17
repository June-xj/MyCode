package cn.itcast_01;

import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		int arr[] ={24,69,80,57,13};
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.binarySearch(arr, 57));
		System.out.println(Arrays.binarySearch(arr, 577));
		
	}
	
}

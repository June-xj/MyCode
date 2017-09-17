package cn.itcast_08;

import java.util.HashSet;
import java.util.Random;

/*
 * 编写一个程序，获取10个1-20的随机数，要求随机数不重复
 */
public class HashSetDemo {
	public static void main(String[] args) {
		Random r=new Random();
		
		HashSet<Integer> t=new HashSet<Integer>();
		
		while(t.size()<10){
			int num=r.nextInt(20)-1;
			t.add(num);
		}
		for(Integer i:t){
			System.out.println(i);
		}
		
	}
}

package cn.itcast_01;

import java.util.Random;

/*
 * Ramdom:产生随机数的类
 * 
 * 构造方法：
 * 		public Random():没有给种子，用默认的，是当前时间的毫秒值
 * 		public Random(long seed):给了种子,但每次得到的随机数相等
 * 成员方法：
 * 		nextInt()：返回int范围内的随机数
 * 		nextInt(int n)：返回[0,n)范围内
 * 
 */
public class RandomDemo {
	public static void main(String[] args) {
		//Random r=new Random();
		Random r=new Random(1111);
		
		for(int x=0;x<10;x++){
			//int num=r.nextInt();
			int num=r.nextInt(100)+1;
			System.out.println(num);
		}
	}
}

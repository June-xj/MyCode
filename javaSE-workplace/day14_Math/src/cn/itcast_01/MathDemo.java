package cn.itcast_01;

public class MathDemo {
	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
		//绝对值
		System.out.println(Math.abs(10));
		System.out.println(Math.abs(-10));
		System.out.println("-----------------");
		//向上取整
		System.out.println(Math.ceil(12.34));
		System.out.println(Math.ceil(12.56));
		//向下取整
		System.out.println(Math.floor(12.34));
		System.out.println(Math.floor(12.56));
		System.out.println("-----------------");
		//最大值
		System.out.println(Math.max(12, 23));
		System.out.println(Math.max(Math.max(12, 23),18));
		System.out.println(Math.max(Math.max(12, 78), Math.max(34, 56)));
		System.out.println("------------------");
		//a的b次幂
		System.out.println(Math.pow(2, 3));
		System.out.println("------------------");
		//随机数
		System.out.println(Math.random());
		System.out.println((int)(Math.random()*100)+1);
		System.out.println("-----------------");
		//四舍五入
		System.out.println(Math.round(12.34f));
		System.out.println(Math.round(12.56f));
		System.out.println("------------------");
		//正平方根
		System.out.println(Math.sqrt(25));
		
	}
}

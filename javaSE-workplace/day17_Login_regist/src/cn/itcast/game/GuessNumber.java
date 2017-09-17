package cn.itcast.game;

import java.util.Scanner;

public class GuessNumber {
	private GuessNumber(){
	
	}

	public static void start(){
		int number=(int) (Math.random()*100)+1;
		
		int count=0;
		
		while(true){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入数据1-100：");
		int guessNumber=sc.nextInt();
		
		count++;
		
		if(guessNumber>number){
			System.out.println("你猜的数据："+guessNumber+"大了");
		}else if(guessNumber<number){
			System.out.println("你猜的数据"+guessNumber+"小了");
			
		}else{
			System.out.println("恭喜你"+count+"次猜中了！！");
			break;
		}
	}
	}

}

package cn.itcast_03;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 模拟斗地主洗牌和发牌
 */
public class PokerDemo {
	public static void main(String[] args) {
		//创建牌盒
		ArrayList<String> array=new ArrayList<String>();
		
		String[] colors={"♠","♥","♣","◆"};
		String[] numbers={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		for(String color:colors){
			for(String number:numbers){
				//concat追加一个字符串到另一个末
				array.add(color.concat(number));
			}
		}
		array.add("小王");
		array.add("大王");
		
		Collections.shuffle(array);
		
		//System.out.println("array:"+array);
		ArrayList<String> feng=new ArrayList<String>();
		ArrayList<String> lin=new ArrayList<String>();
		ArrayList<String> liu=new ArrayList<String>();
		ArrayList<String> di=new ArrayList<String>();
		
		for(int x=0;x<array.size();x++){
			if(x>=array.size()-3){
				di.add(array.get(x));
			}else if(x%3==0){
				feng.add(array.get(x));
			}else if(x%3==1){
				lin.add(array.get(x));
			}else if(x%3==2){
				liu.add(array.get(x));
			}
		}
		
		//看牌
		lookpoker("风清扬",feng);
		lookpoker("林青霞",lin);
		lookpoker("刘意",liu);
		lookpoker("底牌",di);
		
	}

	private static void lookpoker(String name, ArrayList<String> array) {
		System.out.print(name+"的牌是：");
		for(String s:array){
			System.out.print(s+" ");
		}
		System.out.println();
		
	}
}

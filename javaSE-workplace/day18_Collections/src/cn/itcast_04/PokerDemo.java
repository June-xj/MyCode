package cn.itcast_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerDemo {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		ArrayList<Integer> array=new ArrayList<Integer>();
		
		String[] colors={"♠","♥","♣","◆"};
		String[] numbers={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		
		//从0开始往HashMap存编号，并存对应的牌，往ArrayList里存编号
		int index=0;
		for(String number:numbers){
			for(String color:colors){
				String poker=color.concat(number);
				hm.put(index, poker);
				array.add(index);
				index++;
			}
		}
		hm.put(index, "小王");
		array.add(index);
		index++;
		hm.put(index, "大王");
		array.add(index);
		
		Collections.shuffle(array);
		
		TreeSet<Integer> feng=new TreeSet<Integer>();
		TreeSet<Integer> lin=new TreeSet<Integer>();
		TreeSet<Integer> liu=new TreeSet<Integer>();
		TreeSet<Integer> di=new TreeSet<Integer>();
		
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
		lookpoker("风清扬",feng,hm);
		lookpoker("林青霞",lin,hm);
		lookpoker("刘意",liu,hm);
		lookpoker("底牌",di,hm);
		
	}

	private static void lookpoker(String name, TreeSet<Integer> ts,HashMap<Integer,String> hm) {
		System.out.print(name+"的牌是：");
		for(Integer key:ts){
			String value=hm.get(key);
			System.out.print(value+" ");
		}
		System.out.println();
	}
}

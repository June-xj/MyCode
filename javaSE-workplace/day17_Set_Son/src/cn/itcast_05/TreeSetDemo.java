package cn.itcast_05;
/*
 * TreeSet:≈≈–Ú£®◊‘»ª≈≈–Ú£©£¨Œ®“ª
 */
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> t=new TreeSet<Integer>();
		
		t.add(20);
		t.add(18);
		t.add(23);
		t.add(22);
		t.add(17);
		t.add(24);
		t.add(19);
		t.add(18);
		t.add(24);
		
		for(Integer i:t){
			System.out.println(i);
		}
		
	}
}

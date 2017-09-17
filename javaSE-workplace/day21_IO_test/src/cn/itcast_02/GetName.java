package cn.itcast_02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class GetName {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("a.txt"));
		ArrayList<String> a=new ArrayList<String>();
		String line=null;
		while((line=br.readLine())!=null){
			a.add(line);
		}
		br.close();
		
		//随机产生一个索引
		Random r=new Random();
		int index=r.nextInt(a.size());
		
		String name=a.get(index);
		System.out.println("该幸运者是："+name);
		
	}
}

package cn.itcast_02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileToArrayListDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("a.txt"));
		ArrayList<String> a=new ArrayList<String>();
		
		String line=null;
		while((line=br.readLine())!=null){
			a.add(line);
		}
		br.close();
		
		for(String s:a){
			System.out.println(s);
		}
	}
}

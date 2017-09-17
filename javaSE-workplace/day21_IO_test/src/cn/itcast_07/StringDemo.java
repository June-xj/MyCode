package cn.itcast_07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class StringDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("s.txt"));
		String line=br.readLine();
		
		br.close();
		char[] chs=line.toCharArray();
		
		Arrays.sort(chs);
		String s=new String(chs);
		BufferedWriter bw=new BufferedWriter(new FileWriter("ss.txt"));
		bw.write(s);
		bw.newLine();
		bw.flush();
		
		bw.close();
	}
}

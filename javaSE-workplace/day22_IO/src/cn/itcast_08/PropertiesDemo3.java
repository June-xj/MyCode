package cn.itcast_08;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

public class PropertiesDemo3 {
	public static void main(String[] args) throws IOException {
		//myLoad();
		
		myStore();
	}

	private static void myStore() throws IOException {
		Properties pro=new Properties();
		pro.setProperty("lin", "27");
		pro.setProperty("wu", "30");
		pro.setProperty("liu", "18");
		
		Writer w=new FileWriter("name.txt");
		pro.store(w, "helloworld");
		w.close();
		
	}

	private static void myLoad() throws IOException {
		Properties pro=new Properties();
		
		Reader r=new FileReader("pro.txt");
		pro.load(r);
		r.close();
		
		System.out.println(pro);
	}
}

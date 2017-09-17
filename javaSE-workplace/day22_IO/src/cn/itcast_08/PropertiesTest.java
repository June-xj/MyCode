package cn.itcast_08;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {
	public static void main(String[] args) throws IOException {
		Properties pro=new Properties();
		
		Reader r=new FileReader("pro.txt");
		pro.load(r);
		r.close();
		
		Set<String> set=pro.stringPropertyNames();
		for(String key:set){
			if("lisi".equals(key)){
				pro.setProperty(key, "100");
				break;
			}
		}
		
		Writer w=new FileWriter("pro.txt");
		pro.store(w, null);
		w.close();
		
	}
}

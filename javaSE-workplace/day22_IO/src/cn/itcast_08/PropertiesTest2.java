package cn.itcast_08;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

public class PropertiesTest2 {
	public static void main(String[] args) throws IOException {
//		File file=new File("count.txt");
//		if(!file.exists()){
//			file.createNewFile();
//		}
		
		Properties pro=new Properties();
		Reader r=new FileReader("count.txt");
		pro.load(r);
		r.close();
		
		String value=pro.getProperty("count");
		int number=Integer.parseInt(value);
		if(number<=5){
			number++;
			pro.setProperty("count", String.valueOf(number));
			Writer w=new FileWriter("count.txt");
			pro.store(w, null);
			w.close();
			
			GuessNumber.start();
		}else{
			System.out.println("ÓÎÏ·ÊÔÍæ½áÊø£¬Çë¸¶·Ñ");
			System.exit(0);
		}
		
		
		
		
	}
}

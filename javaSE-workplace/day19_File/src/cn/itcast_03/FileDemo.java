package cn.itcast_03;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		File file=new File("e:\\a.txt");
		file.createNewFile();
		
		
	}
}

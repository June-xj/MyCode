package cn.itcast_04;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		File file=new File("e:\\¡÷.jpg");
//		file.mkdir();
//		file.delete();
		File newFile=new File("∂Æ.jpg");
		newFile.createNewFile();
		System.out.println(newFile.renameTo(file));
	}
}

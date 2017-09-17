package cn.itcast_07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//write();
		read();
	}

	private static void read() throws  IOException, ClassNotFoundException{
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("oos.txt"));
		
		Object o=ois.readObject();
		ois.close();
		System.out.println(o);
	}

	private static void write() throws IOException, IOException {
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("oos.txt"));
		
		Person p=new Person("¡÷«‡œº",27);
		
		oos.writeObject(p);
		oos.close();
		
	}
}

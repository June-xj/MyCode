package cn.itcast_01;

import java.awt.Frame;

public class FrameDemo {
	public static void main(String[] args) {
		Frame f=new Frame();
		
//		f.show();
		f.setTitle("helloworld");
		f.setSize(400, 300);
		f.setLocation(400, 200);
		f.setVisible(true);
		
		//System.out.println("helloworld");
		
	}
}

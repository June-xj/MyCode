package cn.itcast_01;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;

public class FrameDemo2 {
	public static void main(String[] args) {
		Frame f=new Frame("方法调用的前后关系");
		
//		Dimension d=new Dimension(400,300);
//		f.setSize(d);
//		Point p=new Point(400,200);
//		f.setLocation(p);
		
		f.setBounds(400, 200, 400, 300);
		
		f.setVisible(true);
		
	}
}

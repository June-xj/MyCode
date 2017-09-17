package cn.itcast_04;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo {
	public static void main(String[] args) {
		Frame f=new Frame("添加按钮");
		
		f.setBounds(400, 200, 400, 300);
		f.setLayout(new FlowLayout());
		
		Button bu=new Button("点我");
		//bu.setSize(20,10);
		f.add(bu);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		bu.addActionListener(new ActionListener() {
			
			@Override 
			public void actionPerformed(ActionEvent e) {
				System.out.println("再来一次");
			}
		});
		
		f.setVisible(true);
		
	}
}

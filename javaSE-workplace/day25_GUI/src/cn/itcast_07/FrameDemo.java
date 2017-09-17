package cn.itcast_07;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo {
	public static void main(String[] args) {
		Frame f=new Frame("不能输入非数字字符");
		f.setBounds(400, 200, 400, 300);
		f.setLayout(new FlowLayout());
		
		//创建label标签对象
		Label label=new Label("请输入你的qq号，不能是非数字，不信你试试");
		TextField tf=new TextField(40);
		
		//添加到窗体上
		f.add(label);
		f.add(tf);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		//给文本框添加事件
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				//如果不是数字字符，取消事件
				char ch=e.getKeyChar();
				if(!(ch>='0'&&ch<='9')){
					e.consume();
				}
				
			}
		});
		
		
		f.setVisible(true);
		
	}
}

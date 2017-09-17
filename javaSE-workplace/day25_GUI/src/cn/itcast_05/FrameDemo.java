package cn.itcast_05;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo {
	public static void main(String[] args) {
		Frame f=new Frame("数据转移");
		
		f.setBounds(400, 200, 400, 300);
		f.setLayout(new FlowLayout());
		
		TextField tf=new TextField(20);
		Button bu=new Button("数据转移");
		TextArea ta=new TextArea(10,40);
		
		f.add(tf);
		f.add(bu);
		f.add(ta);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		bu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String tf_str=tf.getText().trim();
				tf.setText("");
//				ta.setText(tf_str);
				ta.append(tf_str+"\r\n");
				
				tf.requestFocus();
			}
		});
		
		f.setVisible(true);
		
	}
}

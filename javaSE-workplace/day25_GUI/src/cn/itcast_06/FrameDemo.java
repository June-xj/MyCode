package cn.itcast_06;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo {
	public static void main(String[] args) {
		Frame f=new Frame("更改背景色");
		
		f.setBounds(400, 200, 400, 300);
		f.setLayout(new FlowLayout());
		
		Button redButton=new Button("红色");
		Button greenButton=new Button("绿色");
		Button blueButton=new Button("蓝色");
		
		f.add(redButton);
		f.add(greenButton);
		f.add(blueButton);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
//		reaButton.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				f.setBackground(Color.RED);
//			}
//		});
		
//		redButton.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				f.setBackground(Color.RED);
//			}
//		});
		
		redButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				f.setBackground(Color.RED);
			}
		});
		
		redButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				f.setBackground(Color.WHITE);
			}
		});
		
		greenButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				f.setBackground(Color.GREEN);
			}
		});
		
		greenButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				f.setBackground(Color.WHITE);
			}
		});
		
		blueButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				f.setBackground(Color.BLUE);
			}
		});
		
		blueButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				f.setBackground(Color.WHITE);
			}
		});

		f.setVisible(true);
	}
}

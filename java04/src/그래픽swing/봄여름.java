package 그래픽swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 봄여름 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "따뜻하다");
			}
		});
		b1.setForeground(Color.BLUE);
		b1.setFont(new Font("궁서", Font.PLAIN, 80));
		b1.setBackground(Color.ORANGE);
		
		b1.setText("봄");
		
		f.getContentPane().add(b1);
		JButton b2 = new JButton();
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "덥다...");
			}
		});
		b2.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 96));
		b2.setForeground(new Color(0, 128, 128));
		b2.setBackground(Color.PINK);
		b2.setText("여름");
		f.getContentPane().add(b2);
		
		f.setSize(500, 500);
		
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		f.setVisible(true);
	}

}

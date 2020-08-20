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

public class 봄여름가을겨울 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		JButton b1 = new JButton();
		b1.setBounds(0, 0, 484, 181);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "따뜻하다");
			}
		});
		f.getContentPane().setLayout(null);
		b1.setForeground(new Color(255, 105, 180));
		b1.setFont(new Font("궁서", Font.PLAIN, 80));
		b1.setBackground(new Color(255, 182, 193));
		
		b1.setText("봄");
		
		f.getContentPane().add(b1);
		JButton b2 = new JButton();
		b2.setBounds(0, 180, 484, 187);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "덥다...");
			}
		});
		b2.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 96));
		b2.setForeground(new Color(0, 139, 139));
		b2.setBackground(new Color(47, 79, 79));
		b2.setText("여름");
		f.getContentPane().add(b2);
		
		f.setSize(500, 800);
		
		f.setVisible(true);
	}
}

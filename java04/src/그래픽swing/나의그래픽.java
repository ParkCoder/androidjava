package 그래픽swing;

import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의그래픽 {

	public static void main(String[] args) {
		// 자바는 부품조립식 코드 -> 객체지향형 프로그래밍(OOP)
		// ctrl + shift + o : 자동 import
		JFrame f = new JFrame();// new 복사의 의미 //'new'입력 -> ctrl + space -> 아래
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "나를 눌렀군요..");
			}
		});
		JButton b2 = new JButton();
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "나도 눌렀군");
			}
		});
		JButton b3 = new JButton();
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "이건 하늘이다");
			}
		});
		ImageIcon img = new ImageIcon("sky.png");
		b1.setText("나를 눌러");
		b2.setText("나도 눌러");
		b3.setIcon(img);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);

		f.setSize(1000, 700);
		
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		// setVisible은 맨 아래에 두어야한다 (위에 세팅한걸 보여줘라~)
		f.setVisible(true); // 보여지는 값 true

	}

}

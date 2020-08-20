package 그래픽swing;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 계산기 {

	public static void main(String[] args) {
		// 이미지 //프레임1
		// 라벨 3 //텍스트 입력2
		// 버튼1 //레이아웃1

		// 프레임1
		JFrame f = new JFrame();

		// 이미지1
		ImageIcon img = new ImageIcon("abab.png");

		// 라벨3
		JLabel l1 = new JLabel();
		l1.setBounds(12, 239, 360, -199);
		JLabel l2 = new JLabel();
		l2.setBounds(145, 319, 88, 40);
		l2.setFont(new Font("굴림", Font.PLAIN, 34));
		JLabel l3 = new JLabel();
		l3.setBounds(145, 459, 88, 40);
		l3.setFont(new Font("굴림", Font.PLAIN, 34));
		JLabel result = new JLabel();
		result.setSize(96, 66);
		result.setLocation(145, 683);
		result.setFont(new Font("굴림", Font.PLAIN, 51));
		result.setForeground(new Color(255, 0, 0));

		// 텍스트입력2
		JTextField t1 = new JTextField(10);
		t1.setFont(new Font("굴림", Font.PLAIN, 30));
		t1.setForeground(new Color(0, 0, 128));
		t1.setBackground(new Color(176, 196, 222));
		t1.setBounds(12, 369, 360, 80);
		JTextField t2 = new JTextField(10);
		t2.setFont(new Font("굴림", Font.PLAIN, 30));
		t2.setForeground(new Color(0, 0, 128));
		t2.setBackground(new Color(176, 196, 222));
		t2.setBounds(12, 521, 360, 76);

		// 버튼1
		JButton plus = new JButton();
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// t1.t2 값을 가지고 와야함. 가지고 온 값의 데이터타입은 무조건 String!
				String s1 = t1.getText(); // t1에 있는 텍스트를 가져와라
				String s2 = t2.getText();
				// System.out.println("t1: " + s1);
				// System.out.println("t2: " + s2);

				// 산술연산을 하려면 String->숫자 변환
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				// 숫자로 변환한 값들을 더하자
				int sum = i1 + i2;
				
				//처리한 결과를 사용자에게 보여줌(출력)
				//result.setText(sum + "");
				String sum2 = String.valueOf(sum);
				result.setText(sum2);
			}
		});
		plus.setForeground(new Color(0, 0, 0));
		plus.setBackground(new Color(70, 130, 180));
		plus.setFont(new Font("굴림", Font.PLAIN, 73));
		plus.setBounds(12, 607, 80, 66);
		plus.setText("+");
		f.setSize(400, 800);
		l1.setIcon(img);
		l2.setText("숫자1");
		l3.setText("숫자2");
		
		f.getContentPane().setLayout(null);

		f.getContentPane().add(l1);
		f.getContentPane().add(l2);
		f.getContentPane().add(t1);
		f.getContentPane().add(l3);
		f.getContentPane().add(t2);
		f.getContentPane().add(plus);
		f.getContentPane().add(result);
		
		JButton plus_1 = new JButton();
		plus_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				
				int minu = i1 - i2;
				
				String minu2 = String.valueOf(minu);
				result.setText(minu2);
				
				
			}
		});
		plus_1.setText("-");
		plus_1.setForeground(Color.BLACK);
		plus_1.setFont(new Font("굴림", Font.PLAIN, 73));
		plus_1.setBackground(new Color(70, 130, 180));
		plus_1.setBounds(104, 607, 80, 66);
		f.getContentPane().add(plus_1);
		
		JButton plus_2 = new JButton();
		plus_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				
				int x1 = Integer.parseInt(s1);
				int x2 = Integer.parseInt(s2);
				
				int xx = x1 * x2;
				
				String xx2 = String.valueOf(xx);
				result.setText(xx2);
			}
		});
		plus_2.setText("*");
		plus_2.setForeground(Color.BLACK);
		plus_2.setFont(new Font("굴림", Font.PLAIN, 73));
		plus_2.setBackground(new Color(70, 130, 180));
		plus_2.setBounds(196, 607, 80, 66);
		f.getContentPane().add(plus_2);
		
		JButton plus_3 = new JButton();
		plus_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				
				int nn = n1 / n2;
				
				String nn2 = String.valueOf(nn);
				result.setText(nn2);
			}
		});
		plus_3.setText("/");
		plus_3.setForeground(Color.BLACK);
		plus_3.setFont(new Font("굴림", Font.BOLD, 45));
		plus_3.setBackground(new Color(70, 130, 180));
		plus_3.setBounds(288, 607, 80, 66);
		f.getContentPane().add(plus_3);
		
		f.setVisible(true);

	}

}

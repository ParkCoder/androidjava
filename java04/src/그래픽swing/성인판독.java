package 그래픽swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 성인판독 {

	public static void main(String[] args) {
		//프레임
		JFrame f = new JFrame();
		//라벨
		JLabel l1 = new JLabel();
		l1.setBounds(108, 98, 101, 67);
		l1.setFont(new Font("굴림", Font.PLAIN, 30));
		l1.setText("이름: ");
		JLabel l2 = new JLabel();
		l2.setBounds(12, 160, 242, 60);
		l2.setFont(new Font("굴림", Font.PLAIN, 30));
		l2.setText("태어난 년도: ");
		JLabel l3 = new JLabel();
		l3.setText("성인 확인");
		l3.setFont(new Font("굴림", Font.BOLD, 36));
		l3.setBounds(200, 10, 220, 52);
		
		JLabel result = new JLabel();
		result.setHorizontalAlignment(JLabel.CENTER);
		result.setBounds(41, 241, 492, 73);
		result.setFont(new Font("굴림", Font.BOLD, 25));
		result.setText("결과");
		
		
		//입력
		JTextField t1 = new JTextField(10);
		t1.setBackground(new Color(255, 240, 245));
		t1.setBounds(197, 100, 257, 52);
		t1.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		JTextField t2 = new JTextField(10);
		t2.setBackground(new Color(240, 255, 255));
		t2.setBounds(197, 172, 257, 48);
		t2.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		
		//버튼
		JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				
				int year = Integer.parseInt(s2);
				int age = 18;
				if((2020-year)>=age) {
					result.setText(s1+"은 성인입니다.");
				}else if((2020-year)<age) {
					result.setText(s1+"은 미성년입니다.");
				}
				
				
			}
		});
		button.setBounds(468, 172, 93, 48);
		button.setBackground(new Color(255, 228, 181));
		button.setForeground(new Color(0, 0, 0));
		button.setFont(new Font("굴림", Font.PLAIN, 20));
		button.setText("클릭");
		f.getContentPane().setLayout(null);
		
		f.getContentPane().add(l1);
		
		
		f.getContentPane().add(t1);
		f.getContentPane().add(l2);
		f.getContentPane().add(t2);
		f.getContentPane().add(l3);
		f.getContentPane().add(button);
		f.getContentPane().add(result);
		
		
		f.setSize(600, 400);		
		f.setVisible(true);

	}

}

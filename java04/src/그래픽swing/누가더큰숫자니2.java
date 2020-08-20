package 그래픽swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 누가더큰숫자니2 {

	public static void main(String[] args) {
		//프레임
		JFrame f = new JFrame();
		//라벨2
		JLabel l1 = new JLabel();
		l1.setFont(new Font("굴림", Font.PLAIN, 32));
		l1.setForeground(new Color(25, 25, 112));
		l1.setBounds(149, 10, 308, 78);
		JLabel result = new JLabel();
		result.setHorizontalAlignment(JLabel.CENTER);
		result.setText("어느 숫자가 더 클까");
		result.setFont(new Font("굴림", Font.PLAIN, 25));
		result.setBounds(81, 225, 421, 57);
		
		//입력2
		JTextField t1 = new JTextField(10);
		t1.setFont(new Font("굴림", Font.PLAIN, 30));
		t1.setBounds(31, 112, 156, 83);
		JTextField t2 = new JTextField(10);
		t2.setFont(new Font("굴림", Font.PLAIN, 30));
		t2.setBounds(402, 112, 156, 83);
		
		// 버튼1
		JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				
				if(n1>n2) {
					result.setText("왼쪽이 더큼");
				}else if(n1<n2) {
					result.setText("오른쪽이 더큼");
				}else if(n1==n2) {
					result.setText("똑같음");
				}
				
			}
		});
		button.setBackground(new Color(0, 206, 209));
		button.setFont(new Font("굴림", Font.BOLD, 17));
		button.setText("비교 하기");
		button.setBounds(225, 123, 129, 64);
		
		
		
		
		l1.setText("숫자를 입력해주세요");
		
		
		f.setSize(1300,1000);
		f.getContentPane().setLayout(null);
		
		f.getContentPane().add(l1);
		f.getContentPane().add(result);
		f.getContentPane().add(t1);
		f.getContentPane().add(t2);
		f.getContentPane().add(button);
		
		f.setVisible(true);
		
		
		
	}

}

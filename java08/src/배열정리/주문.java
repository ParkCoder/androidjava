package 배열정리;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;


public class 주문 {
	static int count = 0;
	static int jjmcount = 0;
	static int jbcount = 0;
	static int udcount = 0;
	
	static int now = 0;
	
	
	public static void main(String[] args) {
		String[] images = { "jjm.png", "jjbb.png", "udong.jpg"};
		
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(64, 224, 208));
		f.getContentPane().setLayout(null);
		
		JLabel img = new JLabel("New label");
		img.setIcon(new ImageIcon(images[0]));
		img.setBounds(87, 80, 521, 301);
		f.getContentPane().add(img);
		
		JLabel won = new JLabel("");
		won.setForeground(Color.RED);
		won.setHorizontalAlignment(SwingConstants.RIGHT);
		won.setFont(new Font("휴먼모음T", Font.BOLD, 21));
		won.setBounds(478, 591, 148, 60);
		f.getContentPane().add(won);
		
		JLabel countlabel1 = new JLabel("");
		countlabel1.setForeground(Color.RED);
		countlabel1.setHorizontalAlignment(SwingConstants.RIGHT);
		countlabel1.setFont(new Font("휴먼모음T", Font.BOLD, 21));
		countlabel1.setBounds(538, 556, 70, 35);
		
		JLabel jjcount = new JLabel("");
		jjcount.setHorizontalAlignment(SwingConstants.RIGHT);
		jjcount.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		jjcount.setBounds(396, 404, 70, 35);
		f.getContentPane().add(jjcount);
		
		JLabel jjbbcount = new JLabel("");
		jjbbcount.setHorizontalAlignment(SwingConstants.RIGHT);
		jjbbcount.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		jjbbcount.setBounds(396, 449, 70, 35);
		f.getContentPane().add(jjbbcount);
		
		JLabel udongcount = new JLabel("");
		udongcount.setHorizontalAlignment(SwingConstants.RIGHT);
		udongcount.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		udongcount.setBounds(396, 494, 70, 35);
		f.getContentPane().add(udongcount);
		
		
		JLabel jjwon = new JLabel("");
		jjwon.setHorizontalAlignment(SwingConstants.RIGHT);
		jjwon.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		jjwon.setBounds(512, 404, 93, 35);
		f.getContentPane().add(jjwon);
		
		JLabel jjbbwon = new JLabel("");
		jjbbwon.setHorizontalAlignment(SwingConstants.RIGHT);
		jjbbwon.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		jjbbwon.setBounds(512, 449, 93, 35);
		f.getContentPane().add(jjbbwon);
		
		JLabel udongwon = new JLabel("");
		udongwon.setHorizontalAlignment(SwingConstants.RIGHT);
		udongwon.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		udongwon.setBounds(512, 494, 93, 35);
		f.getContentPane().add(udongwon);
		
		
		
		
		
		JButton btnNewButton = new JButton("짜장면 5000원");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				now=0;
				count++;
				jjmcount++;
				
				ImageIcon icon = new ImageIcon(images[now]);
				img.setIcon(icon);	
				jjcount.setText(jjmcount+"");
				jjwon.setText(jjmcount*5000+"");
				countlabel1.setText(count+"");
				won.setText((udcount*4500)+(jbcount*4000)+(jjmcount*5000)+"");
				
				
			}
		});
		
		btnNewButton.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 17));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(12, 10, 195, 35);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("짬뽕 4000원");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				now=1;
				count++;
				jbcount++;
				
				ImageIcon icon = new ImageIcon(images[now]);
				img.setIcon(icon);
				jjbbcount.setText(jbcount+"");
				jjbbwon.setText(jbcount*4000+"");
				countlabel1.setText(count+"");
				won.setText((udcount*4500)+(jbcount*4000)+(jjmcount*5000)+"");
			}
		});
		
		btnNewButton_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 17));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(249, 10, 195, 35);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("우동 4500원");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				now=2;
				count++;
				udcount++;
				
				ImageIcon icon = new ImageIcon(images[now]);
				img.setIcon(icon);
				udongcount.setText(udcount+"");
				udongwon.setText(udcount*4500+"");
				countlabel1.setText(count+"");
				won.setText((udcount*4500)+(jbcount*4000)+(jjmcount*5000)+"");
				
				
			}
		});
		
		btnNewButton_2.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 17));
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.setBounds(477, 10, 195, 35);
		f.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("총 수량");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("휴먼모음T", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(392, 556, 70, 35);
		f.getContentPane().add(lblNewLabel);
		
		
		JLabel lblNewLabel_2 = new JLabel("지불할 금액");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("휴먼모음T", Font.BOLD, 21));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(321, 591, 175, 60);
		f.getContentPane().add(lblNewLabel_2);
		
		f.getContentPane().add(countlabel1);
		
		
		JLabel lblNewLabel_2_2 = new JLabel("원");
		lblNewLabel_2_2.setForeground(Color.RED);
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setFont(new Font("휴먼모음T", Font.BOLD, 21));
		lblNewLabel_2_2.setBounds(619, 591, 53, 60);
		f.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_1 = new JLabel("개");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("휴먼모음T", Font.BOLD, 21));
		lblNewLabel_1.setBounds(613, 556, 59, 35);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("짜장면");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(321, 404, 84, 35);
		f.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("짬뽕");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(321, 449, 84, 35);
		f.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("우동");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		lblNewLabel_3_2.setBounds(321, 494, 84, 35);
		f.getContentPane().add(lblNewLabel_3_2);
		
		
		
		JLabel lblNewLabel_3_3 = new JLabel("개");
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		lblNewLabel_3_3.setBounds(475, 404, 36, 35);
		f.getContentPane().add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("개");
		lblNewLabel_3_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_4.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		lblNewLabel_3_4.setBounds(478, 449, 28, 35);
		f.getContentPane().add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_5 = new JLabel("개");
		lblNewLabel_3_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_5.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		lblNewLabel_3_5.setBounds(475, 494, 36, 35);
		f.getContentPane().add(lblNewLabel_3_5);
		
		
		
		JLabel lblNewLabel_3_3_1 = new JLabel("원");
		lblNewLabel_3_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		lblNewLabel_3_3_1.setBounds(614, 404, 36, 35);
		f.getContentPane().add(lblNewLabel_3_3_1);
		
		JLabel lblNewLabel_3_3_2 = new JLabel("원");
		lblNewLabel_3_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3_2.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		lblNewLabel_3_3_2.setBounds(614, 449, 36, 35);
		f.getContentPane().add(lblNewLabel_3_3_2);
		
		JLabel lblNewLabel_3_3_3 = new JLabel("원");
		lblNewLabel_3_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3_3.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		lblNewLabel_3_3_3.setBounds(614, 494, 36, 35);
		f.getContentPane().add(lblNewLabel_3_3_3);
		
		JPanel panel = new JPanel();
		panel.setBounds(312, 391, 360, 260);
		f.getContentPane().add(panel);
		
		
		
		
		f.setSize(700, 700);
		f.setVisible(true);
		
		
	}
}

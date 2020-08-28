package 배열정리;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 영화앨범배열이용 {
	static int now = 2; //현재 위치를 체크할 수 있는 변수

	public static void main(String[] args) {
		
		//영화, 이미지, 감독, 평점 목록
		String[] titles = { "오케이 마담", "반교:디텐션", "테넷", "다만 악에서 구하소서", "강철비2:정상회담" };
		String[] images = { "ok.jpg", "ban.jpg", "tn.jpg", "daman.jpg", "gang.jpg" };
		String[] directors = { "이철하", "존 쉬", "크리스토퍼 놀란", "홍원찬", "양우석" };
		double[] rates = { 8.12, 8.31, 8.63, 8.6, 8.02 };

		JFrame f = new JFrame();
		f.setTitle("나의 영화 앨범");
		f.getContentPane().setBackground(SystemColor.activeCaption);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);

		JLabel title = new JLabel(titles[2]);
		title.setForeground(Color.DARK_GRAY);
		title.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 33));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(30, 20, 423, 43);
		f.getContentPane().add(title);

		JLabel img = new JLabel("New label");
		img.setIcon(new ImageIcon(images[2]));
		img.setBounds(68, 85, 206, 304);
		f.getContentPane().add(img);

		JLabel lblNewLabel_2 = new JLabel("감독");
		lblNewLabel_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_2.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 19));
		lblNewLabel_2.setBounds(286, 107, 102, 32);
		f.getContentPane().add(lblNewLabel_2);

		JLabel director = new JLabel(directors[2]);
		director.setForeground(Color.WHITE);
		director.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 18));
		director.setBounds(286, 138, 140, 43);
		f.getContentPane().add(director);

		JLabel lblNewLabel_2_1 = new JLabel("평점");
		lblNewLabel_2_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_2_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 19));
		lblNewLabel_2_1.setBounds(286, 219, 96, 32);
		f.getContentPane().add(lblNewLabel_2_1);

		JLabel rate = new JLabel(rates[2]+" ");
		rate.setForeground(Color.WHITE);
		rate.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 18));
		rate.setBounds(286, 249, 111, 43);
		f.getContentPane().add(rate);

		JButton btnNewButton = new JButton("<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				now--;
				if(now<0) {
					now=4;
				}
				
				
				title.setText(titles[now]);
				ImageIcon icon = new ImageIcon(images[now]);
				img.setIcon(icon);
				director.setText(directors[now]);
				rate.setText(rates[now]+"");
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		btnNewButton.setBounds(0, 191, 48, 83);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton(">");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				now++;
				if(now>4) {
					now=0;
				}
				
				title.setText(titles[now]);
				ImageIcon icon = new ImageIcon(images[now]);
				img.setIcon(icon);
				director.setText(directors[now]);
				rate.setText(rates[now]+"");
			}
		});
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		btnNewButton_1.setBounds(436, 191, 48, 83);
		
		f.getContentPane().add(btnNewButton_1);
		f.setVisible(true);

	}
}

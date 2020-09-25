package 크롤링;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class 증권UI {

	public static void main(String[] args) {
		
		String[] codes = {"005930","293490","019170"};	

		JFrame f = new JFrame();
		f.setSize(400, 600);
		f.getContentPane().setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.YELLOW);
		panel_3.setBounds(50, 274, 290, 62);
		f.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel codelabel = new JLabel("");
		codelabel.setHorizontalAlignment(SwingConstants.CENTER);
		codelabel.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 18));
		codelabel.setBounds(12, 10, 266, 42);
		panel_3.add(codelabel);
		
		JLabel lblNewLabel = new JLabel("CODE");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 21));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(97, 226, 195, 40);
		f.getContentPane().add(lblNewLabel);
		
		JButton samsung = new JButton("삼성전자");
		samsung.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codelabel.setText(codes[0]);
				
				
			}
		});
		samsung.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 24));
		samsung.setBackground(Color.ORANGE);
		samsung.setBounds(50, 10, 290, 62);
		f.getContentPane().add(samsung);
		
		JButton kakao = new JButton("카카오게임즈");
		kakao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codelabel.setText(codes[1]);
				
				
			}
		});
		kakao.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 24));
		kakao.setBackground(Color.ORANGE);
		kakao.setBounds(50, 82, 290, 62);
		f.getContentPane().add(kakao);
		
		JButton shin = new JButton("신풍제약");
		shin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codelabel.setText(codes[2]);
			}
		});
		shin.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 24));
		shin.setBackground(Color.ORANGE);
		shin.setBounds(50, 154, 290, 62);
		f.getContentPane().add(shin);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 18));
		textArea.setBounds(50, 395, 290, 133);
		f.getContentPane().add(textArea);
		f.setVisible(true);
		
		JButton crawl = new JButton("크롤링 시작");
		crawl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				증권크롤링3 naver = new 증권크롤링3();
				String re = codelabel.getText();
				String[] result=naver.crawl(re);
				textArea.setText("현재가: "+result[0]+"\n차이: "+result[1]+"\n증감비율: "+result[2]);
				
				
				
			
			}
		});
		crawl.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 14));
		crawl.setBounds(97, 346, 178, 36);
		f.getContentPane().add(crawl);
		
		
	}
}

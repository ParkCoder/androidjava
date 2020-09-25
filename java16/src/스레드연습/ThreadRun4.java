package 스레드연습;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Date;
import java.awt.Color;
import javax.swing.SwingConstants;

public class ThreadRun4 extends JFrame {
	JLabel top = new JLabel("1"); //전역변수, 글로벌변수
	JLabel center = new JLabel("");
	JLabel sub = new JLabel("3");

	public ThreadRun4() {
		getContentPane().setBackground(new Color(178, 34, 34));
		setTitle("나의 멀티스레드");
		setSize(700, 500);
		getContentPane().setLayout(null);

		top.setForeground(new Color(255, 255, 255));
		top.setHorizontalAlignment(SwingConstants.CENTER);
		top.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 26));
		top.setBounds(12, 82, 660, 49);
		getContentPane().add(top);
		center.setHorizontalAlignment(SwingConstants.CENTER);

		center.setBounds(249, 152, 212, 253);
		getContentPane().add(center);

		sub.setForeground(new Color(255, 255, 255));
		sub.setHorizontalAlignment(SwingConstants.CENTER);
		sub.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 26));
		sub.setBounds(12, 415, 660, 36);
		getContentPane().add(sub);

		JLabel lblNewLabel = new JLabel("LIVERPOOL");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 38));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(195, 10, 300, 41);
		getContentPane().add(lblNewLabel);

		CounterThread2 counter = new CounterThread2();
		TimerThread2 timer = new TimerThread2();
		ImageThread2 img = new ImageThread2();
		counter.start();
		timer.start();
		img.start();
		
		setVisible(true);
	}
	
	//내부클래스(inner class)
	//장점: 변수를 다른 클래스와 공유할 목적
	//단점: 내부클래스는 독립적으로 사용 불가
	
	//top, 카운터
	public class CounterThread2 extends Thread {

		@Override
		public void run() {
			for (int i = 500; i > 0; i--) {
				top.setText("Counter: "+i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	//sub, 타이머
	public class TimerThread2 extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 300; i++) {
				
				Date date = new Date();
				sub.setText("Date: "+date);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	//center, 이미지
	public class ImageThread2 extends Thread {
		@Override
		public void run() {
			String[] img = {"1.png","2.png","3.png","4.png","5.png"};
			for (int i = 0; i < img.length; i++) {
				ImageIcon icon = new ImageIcon(img[i]);
				center.setIcon(icon);

				if (i == 4) { //4되면 다시 0부터
					i = -1;
				}
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		

	}

	
	
	
	
	
	
	public static void main(String[] args) {
		ThreadRun4 t = new ThreadRun4();
	}
}

package 스레드연습;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JPanel;

public class CarRacing extends JFrame{
	
	public CarRacing() {
		setTitle("Car Racing!!");
		setSize(1400, 600);
		getContentPane().setLayout(null); //absolute layout
		
		JLabel lblNewLabel = new JLabel("1");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 58));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 47, 70, 88);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("2");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 215, 0));
		lblNewLabel_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 58));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(0, 229, 70, 88);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("3");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 58));
		lblNewLabel_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1.setBounds(0, 428, 70, 88);
		getContentPane().add(lblNewLabel_1_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 167, 1306, 2);
		getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(12, 385, 1306, 2);
		getContentPane().add(separator_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(119, 136, 153));
		panel.setBounds(1317, 10, 55, 541);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("F");
		lblNewLabel_2.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 55));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(0, 79, 57, 51);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("I");
		lblNewLabel_2_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 55));
		lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(0, 138, 57, 51);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("N");
		lblNewLabel_2_1_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 55));
		lblNewLabel_2_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setBounds(0, 199, 57, 51);
		panel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("I");
		lblNewLabel_2_1_1_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 55));
		lblNewLabel_2_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1.setBounds(0, 260, 57, 51);
		panel.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("S");
		lblNewLabel_2_1_1_1_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 55));
		lblNewLabel_2_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_1.setBounds(0, 321, 57, 51);
		panel.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("H");
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 55));
		lblNewLabel_2_1_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_1_1.setBounds(0, 382, 57, 51);
		panel.add(lblNewLabel_2_1_1_1_1_1);
		Car c1 = new Car("car01.png",100,0);
		Car c2 = new Car("car02.png",100,200);
		Car c3 = new Car("car03.png",100,400);
		
		c1.start();
		c2.start();
		c3.start();
		
		setVisible(true);
	}
	//내부클래스
	public class Car extends Thread{
		int x, y;
		JLabel label;
		
		public Car(String file, int x, int y) {
			ImageIcon icon = new ImageIcon(file);
			label = new JLabel(icon);
			this.x = x;
			this.y = y;
			label.setBounds(x, y, 150, 150);
			add(label);
			
			
		}
		@Override
		public void run() {
			Random r = new Random();
			for (int i = 0; i < 200; i++) {
				int move = r.nextInt(40);
				x = x+move;
				label.setBounds(x, y, 150, 150);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		CarRacing race = new CarRacing();
	}
}

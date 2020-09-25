package 컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;

public class 로또번호생성중복제거2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(SystemColor.window);
		f.setSize(490, 300);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("로또번호 생성기");
		lblNewLabel.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 36));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(75, 10, 342, 73);
		f.getContentPane().add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(220, 20, 60));
		panel.setBounds(163, 82, 72, 73);
		f.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lotto3 = new JLabel("?");
		lotto3.setHorizontalAlignment(SwingConstants.CENTER);
		lotto3.setFont(new Font("맑은 고딕", Font.BOLD, 31));
		lotto3.setBounds(0, 10, 72, 53);
		panel.add(lotto3);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(100, 149, 237));
		panel_1.setLayout(null);
		panel_1.setBounds(237, 82, 72, 73);
		f.getContentPane().add(panel_1);

		JLabel lotto4 = new JLabel("?");
		lotto4.setHorizontalAlignment(SwingConstants.CENTER);
		lotto4.setFont(new Font("맑은 고딕", Font.BOLD, 31));
		lotto4.setBounds(0, 10, 72, 53);
		panel_1.add(lotto4);

		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(new Color(0, 128, 0));
		panel_3_1.setLayout(null);
		panel_3_1.setBounds(311, 82, 72, 73);
		f.getContentPane().add(panel_3_1);

		JLabel lotto5 = new JLabel("?");
		lotto5.setHorizontalAlignment(SwingConstants.CENTER);
		lotto5.setFont(new Font("맑은 고딕", Font.BOLD, 31));
		lotto5.setBounds(0, 10, 72, 53);
		panel_3_1.add(lotto5);

		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBackground(new Color(255, 99, 71));
		panel_3_2.setLayout(null);
		panel_3_2.setBounds(385, 82, 72, 73);
		f.getContentPane().add(panel_3_2);

		JLabel lotto6 = new JLabel("?");
		lotto6.setHorizontalAlignment(SwingConstants.CENTER);
		lotto6.setFont(new Font("맑은 고딕", Font.BOLD, 31));
		lotto6.setBounds(0, 10, 72, 53);
		panel_3_2.add(lotto6);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 0));
		panel_2.setLayout(null);
		panel_2.setBounds(89, 82, 72, 73);
		f.getContentPane().add(panel_2);

		JLabel lotto2 = new JLabel("?");
		lotto2.setHorizontalAlignment(SwingConstants.CENTER);
		lotto2.setFont(new Font("맑은 고딕", Font.BOLD, 31));
		lotto2.setBounds(0, 10, 72, 53);
		panel_2.add(lotto2);

		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(0, 139, 139));
		panel_2_1.setLayout(null);
		panel_2_1.setBounds(15, 82, 72, 73);
		f.getContentPane().add(panel_2_1);

		JLabel lotto1 = new JLabel("?");
		lotto1.setFont(new Font("맑은 고딕", Font.BOLD, 31));
		lotto1.setHorizontalAlignment(SwingConstants.CENTER);
		lotto1.setBounds(0, 10, 72, 53);
		panel_2_1.add(lotto1);
		f.setVisible(true);
		JButton btnNewButton = new JButton("생성 버튼");
		btnNewButton.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int lotto[] = new int[6];
				
				Random r = new Random();
				for (int i = 0; i < lotto.length; i++) {
					lotto[i] = r.nextInt(45) + 1;
					for (int j = 0; j < i; j++) {
						if (lotto[i] == lotto[j]) {
							i--;
							break;
						}
					}
				}
				Arrays.sort(lotto); 
				String one = Integer.toString(lotto[0]);
				String two = Integer.toString(lotto[1]);
				String thr = Integer.toString(lotto[2]);
				String fou = Integer.toString(lotto[3]);
				String fiv = Integer.toString(lotto[4]);
				String six = Integer.toString(lotto[5]);
				lotto1.setText(one);
				lotto2.setText(two);
				lotto3.setText(thr);
				lotto4.setText(fou);
				lotto5.setText(fiv);
				lotto6.setText(six);

			}
		});
		btnNewButton.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 18));
		btnNewButton.setBounds(163, 165, 145, 52);
		f.getContentPane().add(btnNewButton);

	}
}

package 순차문;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class 마이윈도우 {
	/**
	 * @wbp.nonvisual location=360,-1
	 */
	private static final JPanel panel = new JPanel();

	public static void main(String[] args) {
		//틀역할 하는 부품이 필요
		JFrame f = new JFrame();
		f.setSize(500,500);
		
		JScrollPane scrollPane = new JScrollPane();
		f.getContentPane().add(scrollPane, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("나를 눌러라");
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(f, "날 눌렀구먼..");
			}
		});
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		f.setVisible(true);

	}

}

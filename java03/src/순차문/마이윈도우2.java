package 순차문;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 마이윈도우2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500,500);
		
		JButton btnNewButton = new JButton("버튼");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "ㅎㅎㅎ");
				
			}
		});
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setForeground(Color.RED);
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("가운데버튼");
		btnNewButton_1.setBackground(Color.CYAN);
		f.getContentPane().add(btnNewButton_1, BorderLayout.CENTER);
			
		
		JButton btnNewButton_2 = new JButton("아래버튼");
		btnNewButton_2.setBackground(Color.MAGENTA);
		f.getContentPane().add(btnNewButton_2, BorderLayout.SOUTH);
		f.setVisible(true);
	}

}

package db연결;

import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 회원CRUDUI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(SystemColor.activeCaption);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(109, 91, 87, 39);
		f.getContentPane().add(lblNewLabel);

		JLabel lblPassword = new JLabel("PW");
		lblPassword.setHorizontalAlignment(SwingConstants.LEFT);
		lblPassword.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 20));
		lblPassword.setBounds(109, 140, 87, 39);
		f.getContentPane().add(lblPassword);

		JLabel lblName = new JLabel("NAME");
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 20));
		lblName.setBounds(109, 189, 87, 39);
		f.getContentPane().add(lblName);

		JLabel lblTel = new JLabel("TEL");
		lblTel.setHorizontalAlignment(SwingConstants.LEFT);
		lblTel.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 20));
		lblTel.setBounds(109, 238, 87, 39);
		f.getContentPane().add(lblTel);

		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 17));
		t1.setBounds(208, 97, 138, 28);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 17));
		t2.setColumns(10);
		t2.setBounds(208, 140, 138, 28);
		f.getContentPane().add(t2);

		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.PLAIN, 17));
		t3.setColumns(10);
		t3.setBounds(208, 189, 138, 28);
		f.getContentPane().add(t3);

		t4 = new JTextField();
		t4.setFont(new Font("굴림", Font.PLAIN, 17));
		t4.setColumns(10);
		t4.setBounds(208, 238, 138, 28);
		f.getContentPane().add(t4);

		JButton Create = new JButton("회원가입");
		Create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				
				MemberDAO dao = new MemberDAO();
				try {
					dao.create(id, pw, name, tel);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
				

			}
		});
		Create.setBackground(SystemColor.controlLtHighlight);
		Create.setBounds(40, 358, 97, 23);
		f.getContentPane().add(Create);

		JButton read = new JButton("회원검색");
		read.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				MemberDAO dao = new MemberDAO();
				try {
					int result = dao.read(id);
					if (result==1) {//검색결과 있음
						
					}else {//검색결과 없음
						t1.setText("없음");
						t2.setText("없음");
						t3.setText("없음");
						t4.setText("없음");
						t1.setBackground(Color.blue);
						t2.setBackground(Color.blue);
						t3.setBackground(Color.blue);
						t4.setBackground(Color.blue);
					}
					
					
					
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		read.setBackground(SystemColor.control);
		read.setBounds(149, 358, 97, 23);
		f.getContentPane().add(read);

		JButton update = new JButton("회원수정");
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String id = t1.getText();
				String tel = t4.getText();
				
				MemberDAO dao = new MemberDAO();
				try {
					dao.update(tel, id);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			
				
				
			}
		});
		update.setBackground(SystemColor.scrollbar);
		update.setBounds(258, 358, 97, 23);
		f.getContentPane().add(update);

		JButton delete = new JButton("회원삭제");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				
				MemberDAO dao = new MemberDAO();
				try {
					dao.delete(id);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		delete.setBackground(SystemColor.activeCaptionBorder);
		delete.setBounds(367, 358, 97, 23);
		f.getContentPane().add(delete);
		f.setVisible(true);

	}
}

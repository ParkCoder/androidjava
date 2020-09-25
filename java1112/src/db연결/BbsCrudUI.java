package db연결;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class BbsCrudUI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.getContentPane().setBackground(SystemColor.inactiveCaption);
		f.setSize(1000, 700);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("게시판");
		lblNewLabel.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(93, 30, 292, 33);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("제목");
		lblNewLabel_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(12, 179, 57, 33);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("내용");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(12, 222, 57, 33);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("글번호");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(12, 136, 57, 33);
		f.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("작성자");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		lblNewLabel_1_3.setBounds(164, 136, 57, 33);
		f.getContentPane().add(lblNewLabel_1_3);
		
		t1 = new JTextField();
		t1.setBounds(81, 142, 71, 21);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(233, 142, 71, 21);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(81, 185, 369, 21);
		f.getContentPane().add(t3);
		
		JTextPane t4 = new JTextPane();
		t4.setBounds(22, 259, 437, 325);
		f.getContentPane().add(t4);
		
		JButton btnNewButton = new JButton("글쓰기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no = t1.getText();
				String writer = t2.getText();
				String title = t3.getText();
				String content = t4.getText();
				
				BbsDAO dao = new BbsDAO();
				BbsVO bag = new BbsVO();
				bag.setNo(Integer.parseInt(no));
				bag.setWriter(writer);
				bag.setTitle(title);
				bag.setContent(content);
				try {
					dao.create(bag);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
				JOptionPane.showMessageDialog(f, "글쓰기 완료");
					
				
				
				
			}
		});
		btnNewButton.setBounds(32, 594, 97, 23);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("검색");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no = t1.getText();
				String writer = t2.getText();
				String title = t3.getText();
				String content = t4.getText();
				
				BbsDAO dao = new BbsDAO();
				try {
					  BbsVO bag = dao.one(Integer.parseInt(no));
		               t1.setText(String.valueOf(bag.getNo()));
		               t2.setText(bag.getTitle());
		               t3.setText(bag.getContent());
		               t4.setText(bag.getWriter());

				} catch (Exception e1) {
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(f, "검색완료");
				
			
			}
		});
		btnNewButton_1.setBounds(141, 594, 97, 23);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("글수정");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BbsVO vo = new BbsVO();
				vo.setNo(Integer.parseInt(t1.getText()));
				vo.setWriter(t2.getText());
				vo.setTitle(t3.getText());
				vo.setContent(t4.getText());
				
				BbsDAO dao = new BbsDAO();
				try {
					dao.update(vo);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(f, "수정완료");
			}
		});
		btnNewButton_2.setBounds(250, 594, 97, 23);
		f.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("글삭제");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no = t1.getText();
				
				BbsDAO dao = new BbsDAO();
				BbsVO vo = new BbsVO();
				
				vo.setNo(Integer.parseInt(no));
				try {
					dao.delete(vo);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(f, "삭제완료");
			}
			
		});
		btnNewButton_2_1.setBounds(353, 594, 97, 23);
		f.getContentPane().add(btnNewButton_2_1);
		
		JTextArea all = new JTextArea();
		all.setBounds(497, 69, 475, 511);
		f.getContentPane().add(all);
		
		JButton btnNewButton_3 = new JButton("전체 목록");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				BbsDAO dao = new BbsDAO();
				ArrayList<BbsVO> list;
				
					list = dao.all();
					for (int i = 0; i < list.size(); i++) {
						BbsVO bag = list.get(i);
						all.append("No"+bag.getNo()+" 작성자:"+bag.getWriter()+" 제목:"+bag.getTitle()+" 내용:"+bag.getContent()+"\n");
						
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			
			
			}
		});
		btnNewButton_3.setBounds(704, 594, 97, 23);
		f.getContentPane().add(btnNewButton_3);
		f.setVisible(true);
	}
}

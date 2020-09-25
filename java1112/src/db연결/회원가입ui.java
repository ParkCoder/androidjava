package db연결;

import javax.swing.JOptionPane;

public class 회원가입ui {

	public static void main(String[] args) throws Exception {

		String id = JOptionPane.showInputDialog("id 입력");
		String pw = JOptionPane.showInputDialog("pw 입력");
		String name = JOptionPane.showInputDialog("name 입력");
		String tel = JOptionPane.showInputDialog("tel 입력");

		MemberDAO db = new MemberDAO();
		db.create(id, pw, name, tel);
		
	}

}

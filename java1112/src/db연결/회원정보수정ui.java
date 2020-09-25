package db연결;

import javax.swing.JOptionPane;

public class 회원정보수정ui {

	public static void main(String[] args) throws Exception {

		String id = JOptionPane.showInputDialog("검색할 id 입력");
		String tel = JOptionPane.showInputDialog("수정할 tel 입력");

		MemberDAO db = new MemberDAO();
		db.update(tel, id);
		
	}

}

package db연결;

import javax.swing.JOptionPane;

public class 삭제ui {

	public static void main(String[] args) throws Exception {

		String id = JOptionPane.showInputDialog("삭제할 id");
		
		
		MemberDAO db = new MemberDAO();
		db.delete(id);
	}

}

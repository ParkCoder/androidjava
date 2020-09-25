package db연결;

import javax.swing.JOptionPane;

public class 회원가입UI2 {

	public static void main(String[] args) throws Exception {

		String id = JOptionPane.showInputDialog("id를 입력해주세요");
		String pw = JOptionPane.showInputDialog("pw를 입력해주세요");
		String name = JOptionPane.showInputDialog("name를 입력해주세요");
		String tel = JOptionPane.showInputDialog("tel를 입력해주세요");
		
		MemberVO bag = new MemberVO(); //가방 만들기
		bag.setId(id);  //set메서드를 통해서 가방에 각 값들을 하나씩 넣으세요.
		bag.setPw(pw);
		bag.setName(name);
		bag.setTel(tel);
		
		MemberDAO dao = new MemberDAO();
		dao.create(bag);
	}

}

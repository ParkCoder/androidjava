package DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

//특정한 방법을 처리하는 클래스: 방법(model, DB처리) 클래스
public class DB처리전담 {
//DB처리하는 방법이 4단계로 정해져있다
	public void create(String id, String pw, String name, String tel) throws Exception {
		System.out.println("DB에 저장처리함");
		// 1.connerctor 설정
		Class.forName("com.mysql.jdbc.Driver");
		// 자바에서는 에러가 너무 많이 발생할 것 같은 상황에서는 반드시 에러 처리를 해주어야함.
		// 네트워크 연결, db연결, 파일연결, cpu연결

		System.out.println("1. connector 설정 성공");
		// 2.db연결
		// 1)url: ip+port+db명
		// 2)user: root
		// 3)password: 1234
		String url = "jdbc:mysql://localhost:3366/shop";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. shop 연결 성공");
		
		//db연동 index는 1부터 시작
		String sql = "insert into member values (null, ?, ?, ?)";
		//                      db저장될 이름	  이자리에 안넣겠다

		// 컴퓨터는 이 문장을 그냥 String으로 인식
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);

		System.out.println("3. SQL문 생성 성공");

		ps.executeUpdate();
		System.out.println("4. SQL문을 mySQL로 네트워크 전송 성공");

	}

	//public void create() {
		// JOptionPane.showMessageDialog(null, "DB에 저장 처리");
	//	System.out.println("DB에 저장처리함");
	//}

	public void read() {
		JOptionPane.showMessageDialog(null, "DB에 검색 처리");
	}

	public void update() {
		JOptionPane.showMessageDialog(null, "DB에 수정 처리");
	}

	public void delete() {
		JOptionPane.showMessageDialog(null, "DB에 삭제 처리");
	}

}

package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO2 {

	Connection con; // 전역변수

	public MemberDAO2() throws Exception {
		// 1. connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 성공!!");

		// 2. db연결
		// String url = "연결하는방법 ://ip:port/db명"
		String url = "jdbc:mysql://localhost:3366/shop?useUnicode=true&characterEncoding=utf8";
		String user = "root";
		String password = "1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 성공");

	}

	public boolean create(MemberVO2 vo) throws Exception {

		// 3. sql문을 만든다(create)
		String sql = "insert into member2 values(?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getId());
		ps.setString(2, vo.getFirst_name());
		ps.setString(3, vo.getLast_name());
		ps.setString(4, vo.getEmail());
		ps.setString(5, vo.getGender());
		ps.setString(6, vo.getIp_address());

		System.out.println("3. SQL문 생성 성공!!");

		// 4. sql문을 전송
		int row = ps.executeUpdate();
		System.out.println("4. SQL문 전송 성공!!");
		boolean result = false;
		if (row == 1) {
			result = true;
		}
		ps.close();
		con.close();
		return result;

	}

}

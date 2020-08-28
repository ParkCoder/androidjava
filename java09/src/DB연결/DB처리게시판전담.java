package DB연결;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;

	//특정한 방법을 처리하는 클래스: 방법(model, DB처리) 클래스
	public class DB처리게시판전담 {
	//DB처리하는 방법이 4단계로 정해져있다
		public void create(String title, String content, String writer) throws Exception {
			System.out.println("DB에 저장처리함");
	
			Class.forName("com.mysql.jdbc.Driver");
		

			System.out.println("1. connector 설정 성공");
		
			String url = "jdbc:mysql://localhost:3366/shop";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. shop 연결 성공");
			
		
			String sql = "insert into bbs values (null, ?, ?, ?)";
			//                       db이름	  이자리에 안넣겠다


			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setString(3, writer);

			System.out.println("3. SQL문 생성 성공");

			ps.executeUpdate();
			System.out.println("4. SQL문을 mySQL로 네트워크 전송 성공");

		}
}

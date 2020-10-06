package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BbsDAO {
	Connection con;

	public BbsDAO() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 성공!!");

		String url = "jdbc:mysql://localhost:3366/shop?useUnicode=true&characterEncoding=utf8";
		String user = "root";
		String password = "1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 성공");
	}
	
	public List<BbsVO> conall(String content) throws Exception {

		String sql = "select * from bbs where content = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, content);
		System.out.println("3. SQL문 생성.!!");
	
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 전송 성공.!!");

		List<BbsVO> list = new ArrayList<BbsVO>();
		while (rs.next()) {
			BbsVO bag = new BbsVO();
			bag.setNo(rs.getInt("no"));
			bag.setWriter(rs.getString("writer"));
			bag.setTitle(rs.getString("title"));
			bag.setContent(rs.getString("content"));
			
			list.add(bag);
		}

		return list;
	}
	
	public List<BbsVO> titleall(String title) throws Exception {

		String sql = "select * from bbs where title = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, title);
		System.out.println("3. SQL문 생성.!!");
	
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 전송 성공.!!");

		List<BbsVO> list = new ArrayList<BbsVO>();
		while (rs.next()) {
			BbsVO bag = new BbsVO();
			bag.setNo(rs.getInt("no"));
			bag.setWriter(rs.getString("writer"));
			bag.setTitle(rs.getString("title"));
			bag.setContent(rs.getString("content"));
			
			list.add(bag);
		}

		return list;
	}
		
		// bag은 참조형 변수, 주소를 전달!

	public void create(BbsVO VO) throws Exception {

		String sql = "insert into bbs values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setInt(1, VO.getNo());
		ps.setString(2, VO.getTitle());
		ps.setString(3, VO.getContent());
		ps.setString(4, VO.getWriter());

		System.out.println("3. SQL문 생성 성공!!");

		ps.executeUpdate();
		System.out.println("4. SQL문 전송 성공!!");

		ps.close();
		con.close();

	}

	public BbsVO one(int no) throws Exception {

		String sql = "select * from bbs where no = ?";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, no);

		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 전송 성공.!!");
		BbsVO bag = new BbsVO();// 가방만들어서,
		if (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
			System.out.println("검색결과가 있어요.");
			int no2 = rs.getInt("no");
			String title = rs.getString("title");
			String content = rs.getString("content");
			String writer = rs.getString("writer");

			bag.setNo(no2);
			bag.setTitle(title);
			bag.setContent(content);
			bag.setWriter(writer);
			System.out.println("검색결과 ino2: " + no2);
			System.out.println("검색결과 title: " + title);
			System.out.println("검색결과 content: " + content);
			System.out.println("검색결과 writer: " + writer);
		} else {
			System.out.println("검색결과가 없어요.");
		}
		rs.close();
		ps.close();
		con.close();
		return bag;

	}

	public void update(BbsVO vo) throws Exception {

		String sql = "update bbs set writer=?, title=?, content=? where no =?";

		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, vo.getWriter());
		ps.setString(2, vo.getTitle());
		ps.setString(3, vo.getContent());
		ps.setString(4, String.valueOf(vo.getNo()));

		ps.executeUpdate();
		System.out.println("성공.!!");

		ps.close();
		con.close();

	}
	
		public boolean update1(BbsVO vo) throws Exception {

		String sql = "update bbs set writer = ?, title = ?, content = ? where no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getWriter());
		ps.setString(2, vo.getTitle());
		ps.setString(3, vo.getContent());
		ps.setInt(4, vo.getNo());

		System.out.println("3. SQL문 생성 성공!!");

		int row = ps.executeUpdate();
		System.out.println("4. SQL문 전송 성공!!");

		ps.close();
		con.close();

		boolean result = false;
		if (row == 1) {
			result = true;
		}
		return result;
	}

	public void delete(BbsVO vo) throws Exception {

		String sql = "delete from bbs where no =?";

		PreparedStatement ps = con.prepareStatement(sql);

		ps.setInt(1, vo.getNo());

		ps.executeUpdate();
		
		System.out.println("성공.!!");
		
		
		
		ps.close();
		con.close();

	}
	
	public boolean delete1(String title) throws Exception {

		// 3. sql문을 만든다.(create)
		String sql = "delete from bbs where title = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, title);
		System.out.println("3. SQL생성 성공.!!");

		// 4. sql문은 전송
		int row = ps.executeUpdate();
		System.out.println("4. SQL문 전송 성공.!!");

		ps.close();
		con.close();
		boolean result = false;

		if (row == 1) {
			result = true;
		}
		return result;
	}
	
	
	
	
	

	public List<BbsVO> all() throws Exception {
		
		List<BbsVO> list = new ArrayList<BbsVO>();

		
		String sql = "select * from bbs";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. SQL문 생성.!!");
		
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 전송 성공.!!");
		while (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
			BbsVO bag = new BbsVO();// 가방만들어서,
			
		
			bag.setNo(rs.getInt("no")); 
			bag.setTitle(rs.getString("title"));
			bag.setContent(rs.getString("content"));
			bag.setWriter(rs.getString("writer"));
			
			list.add(bag);
		}
		rs.close();
		ps.close();
		con.close();
		return list;
		
	}

}

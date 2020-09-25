package db연결;

import java.util.ArrayList;

public class 게시판전체프린트 {

	public static void main(String[] args) throws Exception {
		BbsDAO dao = new BbsDAO();
		ArrayList<BbsVO> list = dao.all();
		//System.out.println(list.size());
	
		for (int i = 0; i < list.size(); i++) {
			BbsVO bag = list.get(i);
			System.out.println("No."+bag.getNo());
			System.out.println("Writer: "+bag.getWriter());
			System.out.println("Title: "+bag.getTitle());
			System.out.println("Content: "+bag.getContent());
			System.out.println();
		}
	}

}

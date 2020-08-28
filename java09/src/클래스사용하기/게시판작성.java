package 클래스사용하기;

import 클래스만들기.Bbs;

public class 게시판작성 {

	public static void main(String[] args) {
		
		System.out.println("ID Title Content Writer");
		System.out.println("-----------------------");
		
		Bbs main1 = new Bbs();
		main1.id=1;
		main1.title="java";
		main1.content="fun java";
		main1.writer="park";
		main1.글을쓰다();
		
		System.out.println(main1);
		
		
		Bbs main2 = new Bbs();
		main2.id=2;
		main2.title="jsp";
		main2.content="fun jsp";
		main2.writer="kim";
		main1.글을삭제하다();
		
		System.out.println(main2);
		
		
	}
	
}

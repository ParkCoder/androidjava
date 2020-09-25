package 컬렉션;

import java.util.ArrayList;

import db연결.BbsVO;

public class 순서list형태 {

	public static void main(String[] args) {
		//List-순서가 의미가 있는 자료=>ArrayList, LinkedList

		ArrayList list = new ArrayList();

		// 집어 넣을 때는 add(값)메서드 사용
		list.add(19);
		list.add("자바과정");
		list.add(25.5);
		list.add(false);
		list.add(new BbsVO());

		// list에 몇개들어있나
		System.out.println(list.size() + "개 들어있음");

		// 꺼내올땐 get(index)메서드 사용
		System.out.println(list.get(0));
		System.out.println(list.get(1));

		// 지울때는 remove(index) 메서드 사용
		list.remove(0);
		System.out.println(list.size() + "개 들어있음");
		System.out.println(list.get(0));

		// 중간에 끼워넣을때는 add(끼워넣을 위치, 값) 메서드 사용
		list.add(0, "홍길동"); // 0번 앞에 끼워넣음
		System.out.println(list.size() + "개 들어있음");
		System.out.println(list.get(0));

		// 값을 변경할 때는 set(변경할 위치, 값) 메서드 사용
		list.set(0, "김길동");
		System.out.println(list.get(0));
		   for (int i = 0; i < list.size(); i++) {
		         System.out.println(i + ": " + list.get(i));
		   }
		   System.out.println();
		   System.out.println("------List 예제------");
		   ArrayList ski = new ArrayList();
			
			ski.add("박스키");
			ski.add("송스키");
			ski.add("김스키");
			ski.add("정스키");
			
			System.out.println("스키대회 순위");
			for (int i = 0; i < ski.size(); i++) {
				 System.out.print((i+1) + "등:" + ski.get(i)+"  ");
			}
			System.out.println();
			System.out.println("2등 송스키 탈락! 최종순위");
			ski.remove(1);
			for (int i = 0; i < ski.size(); i++) {
				 System.out.print((i+1) + "등:" + ski.get(i)+"  ");
			}
	
	
	}
	

}

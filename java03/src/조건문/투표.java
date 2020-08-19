package 조건문;

import javax.swing.JOptionPane;

public class 투표 {

	public static void main(String[] args) {
		//카운트 변수
		int iu = 0;
		int you = 0;
		int bts = 0;

		while (true) { //투표 무한루프
			String choice = JOptionPane.showInputDialog("인기투표 1)아이유, 2)유재석, 3)BTS, 4)종료");
			int choice1 = Integer.parseInt(choice); //투표 입력값 정수 변환

			if (choice1 == 4) { //종료
				System.out.println("투표가 종료되었습니다.");
				break;
			} else if (choice1 == 1) { 
				System.out.println("아이유에 투표했습니다.");
				iu++;
			} else if (choice1 == 2) {
				System.out.println("유재석에 투표했습니다.");
				you++;
			} else if (choice1 == 3) {
				System.out.println("BTS에 투표했습니다.");
				bts++;
			}
		}
		System.out.println("<총득표수>");
		System.out.println("아이유: " + iu + "표");
		System.out.println("유재석: " + you + "표");
		System.out.println("BTS: " + bts + "표");
	}

}

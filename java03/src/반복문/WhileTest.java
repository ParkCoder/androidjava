package 반복문;

import javax.swing.JOptionPane;

public class WhileTest {

	public static void main(String[] args) {
		//계속 반복하고자 하는 경우
		
		while (true) {
			System.out.println("내가 계속 돌아요");
			String choice = JOptionPane.showInputDialog("프로그램을 종료하시겠습니까? yes or no");
			if(choice.equals("y")) {
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
				//break; //while 반복문을 종료, while 아래에 있는 것들은 계속 실행
			}
		}
		
		//제한된 횟수를 반복하고자 하는 경우
		/*int i = 1; //시작값
		while (i < 11) { //조건식
			System.out.println(i+"번 돌아요.");//실행내용
			i++; //증감값
		}*/
		
	}

}

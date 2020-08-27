package 배열문제;

import java.util.Scanner;

public class 무한루프입력 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("게임을 계속 하실래요? 1)네  2)아니오 >>");
			int choice = scan.nextInt();
			if (choice==2) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		
		
	}

}

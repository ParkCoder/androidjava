package 배열문제;

import java.util.Scanner;

public class 이차원배열 {

	public static void main(String[] args) {
		// 2차원 배열의 각 행 열의 개수는 유동적
		// 0행은 열개수 5개
		// 1행은 열개수10개
		Scanner scan = new Scanner(System.in);
		int[][] seat = new int[3][10];
		int count=0;
		
		seat[0][0] = 1; //행 좌석 번호
		seat[1][0] = 2;
		seat[2][0] = 3;

		while (true) {
			System.out.println("  1 2 3 4 5 6 7 8 9"); //열 좌석 번호
			System.out.println("--------------------");
			// 극장 좌석
			for (int i = 0; i < seat.length; i++) {// 행의 개수=>3(0~2)
				for (int j = 0; j < seat[i].length; j++) {
					System.out.print(seat[i][j] + " ");
				}
				System.out.println();
			}

			System.out.print("좌석 세로번호(행)를 입력해주세요(1~3  종료는  0)>> ");
			int choice1 = scan.nextInt();
			
			if(choice1==0) {
				System.out.println("프로그램 종료");
				break;
			}
			
			System.out.print("좌석 가로번호(열)를 입력해주세요(1~9  종료는  0)>> ");
			int choice2 = scan.nextInt();
			
			if(choice2==0) {
				System.out.println("프로그램 종료");
				break;
			}
			
			if (seat[choice1 - 1][choice2] == 1) {
				System.out.println("이미 예약되었습니다. 다시입력해주세요.");
			} else {
				seat[choice1 - 1][choice2] = 1;
				System.out.println("예약완료");
				count++;
			}
			System.out.println("매수: "+ count +"  결제가격: "+(count*10000)+"원");
			System.out.println();
		}
	}
}

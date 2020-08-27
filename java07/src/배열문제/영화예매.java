package 배열문제;

import java.util.Scanner;

public class 영화예매 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] seat = new int[10]; //좌석마다 예매상황을 저장할 공간들
		int count = 0;
		
		
		
		while (true) {
			System.out.println("--------------------------------------");
			for (int i = 1; i < 11; i++) {
				System.out.print(i+"   ");
			}
			System.out.println();
			System.out.println("--------------------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print((seat[i])+"   ");
				
			}
			System.out.println();
			System.out.print("원하시는 좌석번호를 입력해주세요(종료는 -1)>> ");
			
			int choice = scan.nextInt();
			
			
			if (choice == -1) {
				System.out.println("프로그램 종료");
				
				break;
			}
			
			if(seat[choice-1]==0) {
				seat[choice-1] = 1;
				System.out.println("예약을 완료했습니다");
				count++;
				
			}else {
				System.out.println("이미 예약된 자리 입니다. 다른좌석을 선택해주세요!");
			}
			
			System.out.println("매수: "+ count +" 장"+"   결제가격: "+(count*10000)+" 원");
			System.out.println();
			System.out.println();
			
			
			
			
			
			// 이미 예약 자리는 예약 불가..다른자리 선택하라고 알려주기
			// 종료시 몇 좌석이 예매가 되었는지 프린트 한 장당 10000원 , 결제금액 프린트
			// 좌석번호 1번 부터 시작되게
			
			
			
		}
		
		
	}

}

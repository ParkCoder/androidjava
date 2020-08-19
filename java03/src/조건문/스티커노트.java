package 조건문;

import javax.swing.JOptionPane;

public class 스티커노트 {

	public static void main(String[] args) {

		int sticker = 3000; //스티커 1개 가격
		int note = 5000; //노트 1개 가격
		int result1 = 0, result2 = 0, result3 = 0; // 총합 선언
		
		String st = JOptionPane.showInputDialog("스티커 몇개를 구매 하시겠습니까?");
		int sticke1 = Integer.parseInt(st); //스티커 구매 갯수 입력받아 정수로 저장


		String nt = JOptionPane.showInputDialog("노트 몇개를 구매 하시겠습니까?");
		int note1 = Integer.parseInt(nt); //노트 구매 갯수 입력받아 정수로 저장

		result1 = sticker * sticke1; //스티커 가격 * 구매 갯수
		result2 = note * note1;     //노트 가격 * 구매갯수
		result3 = result1 + result2; //두개의 총가격
		
		//출력
		System.out.println("스티커 "+ sticke1+"개는 " + (result1) + "원");
		System.out.println("노트 "+ note1 +"개는" + (result2) + "원");
		System.out.println("합산금액 "+ result3 + "원");
		//두개의 총가격에 따른 할인 유무
		if(result3 < 25000) {
			System.out.println("결제금액은"+result3+"원 입니다.");
		}else if(result3 >= 25000) { // 25000원 이상인 경우 3천원 할인
			System.out.println("결제금액은"+(result3 - 3000)+"원 입니다.");
		}
		
		
		
		
		
	}

}

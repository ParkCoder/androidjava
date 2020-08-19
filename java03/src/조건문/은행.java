package 조건문;

import javax.swing.JOptionPane;

public class 은행 {

	public static void main(String[] args) {

		int allmoney = 0; // 은행 잔고

		while (true) {
			String choice = JOptionPane.showInputDialog("1)입금, 2)출금, 3)잔고, 4)종료");
			int x = Integer.parseInt(choice); // 선택사항 입력시 정수로 변환

			int inmoney; // 입금 된 돈
			int outmoney; // 출금 된 돈

			if (x == 1) { // 입금
				String mymoney = JOptionPane.showInputDialog("입금액을 입력해주세요.");
				inmoney = Integer.parseInt(mymoney); // 입금액 정수 변환

				allmoney += inmoney; // 입금액을 잔고에 더함

				System.out.println(inmoney + "원이 입금 되었습니다.");
				// System.out.println("현재잔고는:" + allmoney);

			} else if (x == 2) {// 출금
				String mymoney2 = JOptionPane.showInputDialog("출금액을 입력해주세요.");
				outmoney = Integer.parseInt(mymoney2); // 출금액 정수 변환

				allmoney -= outmoney; // 잔고에서 출금액 빼기

				System.out.println(outmoney + "원이 출금 되었습니다.");
				// System.out.println("현재잔고는:" + allmoney);

				if (allmoney <= 0) { // 잔고가 0보다 작으면 잔고 부족
					System.out.println("잔고가 부족합니다.");
				}

			} else if (x == 3) {// 잔고 표시

				System.out.println("잔고: " + allmoney + "원");

			} else if (x == 4) { // 종료
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0); // 4 선택시 프로그램 종료
			}

		}

	}

}

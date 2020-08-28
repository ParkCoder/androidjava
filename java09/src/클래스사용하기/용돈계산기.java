package 클래스사용하기;

import 클래스만들기.계산기3;

public class 용돈계산기 {

	public static void main(String[] args) {

		계산기3 cal = new 계산기3();

		int month1 = 6;
		int money1 = 100000;

		int mul1 = cal.mul(money1, month1);

		if (mul1 > 500000) {
			System.out.println("상반기 용돈은 " + (mul1 = 500000) + "만원");
		} else if (mul1 < 500000) {
			System.out.println("상반기 용돈은 " + (mul1 + 150000) + "만원");
		}

		System.out.println("---------------------------");

		int sangmoney = 600000;
		int hamoney = 500000;

		int sum = cal.add(sangmoney, hamoney);
		System.out.println("1년 용돈은 "+sum+"만원");
	}

}

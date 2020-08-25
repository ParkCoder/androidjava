package 복습;

import java.util.Random;

public class 원하는값찾기 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] number = new int[5];
		int max = number[0];
		int min = number[0];

		for (int i = 0; i < number.length; i++) {
			number[i] = r.nextInt(1000);
		}
		for (int i = 0; i < number.length; i++) {
			System.out.println(i + ":" + number[i]);
		}

		for (int i = 1; i < number.length; i++) {
			if (number[i] > max) {
				max = number[i];
			}
		}
		System.out.println("최대값은 " + max);

		for (int i = 1; i < number.length; i++) {
			if (number[i] < min) {
				min = number[i];
			}
		}
		System.out.println("최소값은 "+min);
	}

}

package 배열응용;

import java.util.Random;

import javax.swing.JOptionPane;

public class 입력해서넣어보자4 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] data = new int[100];

		for (int i = 0; i < 100; i++) {

			data[i] = r.nextInt(10);
		}
		for (int x : data) {
			System.out.println(x);
		}
		System.out.println("첫번째 숫자:" + data[0] + " 마지막 숫자: " + data[99]);
		System.out.println("두수의 합: " + (data[0] + data[99]));
	}

}

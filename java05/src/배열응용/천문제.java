package 배열응용;

import java.util.Random;

import javax.swing.JOptionPane;

public class 천문제 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] my = new int[1000];
		int[] result = new int[1000];
		int count = 0;

		String a = new String();
		System.out.println("문항	정답	내답	처리");
		System.out.println("---------------------------");
		for (int i = 0; i < 1000; i++) {
			my[i] = r.nextInt(4);
			result[i] = r.nextInt(4);

			if (result[i] == my[i]) {
				a = "정답";
				count++;
			} else {
				a = "오답";
			}
			System.out.println(i + "번	" + result[i] + "	" + my[i] + "	" + a);
		}
		System.out.println("---------------------------");
		System.out.println("		정답 갯 수: " + count);

	}

}

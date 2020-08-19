package 조건문;

public class 예제3 {

	public static void main(String[] args) {

		for (int i = 2; i < 10; i++) { // 구구단 -단
			System.out.println();
			for (int j = 1; j < 10; j++) { // 곱하는 수
				if (i < j) {
					break;
				}
				System.out.println(i + "X" + j + "=" + (i * j)); // 출력

			}

		}

	}

}

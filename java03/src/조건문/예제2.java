package 조건문;

public class 예제2 {

	public static void main(String[] args) {
		//짝수 단만 출력하기
		for (int i = 1; i < 10; i++) {

			// 2로 나눴을때 1이 남으면 continue
			if (i % 2 == 1) {
				continue;
			}
			for (int x = 1; x < 10; x++) {
				int result = i * x;
				// 출력
				System.out.println(i + "X" + x + "=" + result);
			}
				System.out.println("\n");
				
		}
	}

}

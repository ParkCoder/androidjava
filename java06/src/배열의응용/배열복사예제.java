package 배열의응용;

public class 배열복사예제 {

	public static void main(String[] args) {

		// 과목명, 1학기, 2학기 점수
		String[] subject = { "국어", "수학", "과학", "컴퓨터", "영어" };
		int[] jumsu1 = { 100, 99, 77, 87, 66 };
		int[] jumsu2 = jumsu1.clone(); // 1학기 점수 복사
		// 2학기 점수 수정
		jumsu2[2] = 44; // 2학기 과학44점
		jumsu2[4] = 55; // 2학기 영어 55점

		// 과목명, 1학기, 2학기 점수 프린트
		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println();
		System.out.println("<1학기>");

		for (int x : jumsu1) {
			System.out.print(x + "점\t");
		}
		System.out.println();
		System.out.println("<2학기>");

		for (int x : jumsu2) {
			System.out.print(x + "점\t");
		}

		System.out.println();

		// 점수가 변경된 과목수
		int count = 0;
		System.out.print("점수가 변경된 과목: ");
		for (int i = 0; i < jumsu1.length; i++) {
			if (jumsu1[i] != jumsu2[i]) {
				System.out.print(subject[i] + "  ");
				count++;
			}
		}
		System.out.println();
		System.out.println("점수가 변경된 과목수: " + count + "개");

		// 평균이 더 높은 학기
		// 1학기 평균
		int sum = 0;
		double aver = 0;
		for (int i = 0; i < jumsu1.length; i++) {
			sum = jumsu1[i] + sum;
			aver = sum / jumsu1.length;
		}
		System.out.println("1학기 평균: " + aver);
		// 2학기 평균
		int sum1 = 0;
		double aver1 = 0;
		for (int i = 0; i < jumsu2.length; i++) {
			sum1 = jumsu2[i] + sum1;
			aver1 = sum1 / jumsu2.length;
		}
		System.out.println("2학기 평균: " + aver1);
		
		// 1,2학기중 평균이 더 높은 학기는?
		if (aver > aver1) {
			System.out.println("1학기 평균이 더 높다");
		} else if (aver < aver1) {
			System.out.println("2학기 평균이 더 높다");
		} else {
			System.out.println("똑같다");
		}
	}
}

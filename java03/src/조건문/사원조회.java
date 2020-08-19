package 조건문;

public class 사원조회 {

	public static void main(String[] args) {
		String a = "A100EX";
		char sub = a.charAt(0);
		String num = a.substring(1, 4);
		// index 1~3 범위 추출이면 substring(1,4)써줌
		// endIndex는 3보다 하나 큰 4를 써줘야한다.

		switch (sub) {
		case 'A':
			System.out.println("사원의 부서는 기획부 입니다.");
			break;
		case 'B':
			System.out.println("사원의 부서는 총무부 입니다.");
			break;
		case 'C':
			System.out.println("사원의 부서는 개발부 입니다.");
			break;

		default:
			System.out.println("해당없음");
			break;
		}
		System.out.println("사원고유번호는" + num + "입니다.");
	}

}

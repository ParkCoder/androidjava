package 클래스만들기;

public class 계산기2 {
	// 각 부품의 기능을 정의할때는 메서드를 쓴다
	// 메소드의 입력값 잠깐 저장할 용도로 선언된 변수, 메소드의 사용과 처리의 중간다리역할을 하는변수: 매개변수(parameter,파라메터)
	public void add(int x, int y) { // void == 없다
		int result = x + y;
		System.out.println("합: " + result);
	}

	public void minus(int x, int y) {
		// x,y 변수는 add메서드 지역에서만 쓸 수 있는 지역변수
		// local 변수, 로컬변수 = 전역변수
		// 지역변수는 자동 초기화가 안된다
		int result = x - y;
		System.out.println("빼기: " + result);
	}

	public int mul(int x, int y) {
		int result = x * y;
		return result;
	}

	public void div(int x, int y) {
		int result = x / y;
		System.out.println("나누기: " + result);
	}

}

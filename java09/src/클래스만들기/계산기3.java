package 클래스만들기;

public class 계산기3 {
	// 각 부품의 기능을 정의할때는 메서드를 쓴다
	// 메소드의 입력값 잠깐 저장할 용도로 선언된 변수, 메소드의 사용과 처리의 중간다리역할을 하는변수: 매개변수(parameter,파라메터)
	public int add(int x, int y) { // void == 없다
		int result = x + y;
		return result;
	}


	public int mul(int x, int y) {
		int result = x * y;
		return result;
	}


}

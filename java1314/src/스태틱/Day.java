package 스태틱;

import javax.swing.JOptionPane;

public class Day {

	String doing;
	int time;
	String local;
	static int count;// 전역변수는 자동 초기화됨. 0으로 초기화
	static int sum;
	static String company = "더조은";

	public Day(String doing, int time, String local) {
		count++;
		sum = sum + time;
		this.doing = doing;
		this.time = time;
		this.local = local;

	}

	// static 메서드 (정적메서드): 객체 생성하지 않아도 클래스 이름으로 바로 사용가능
	public static String getName() {
		return company;

	}
	//자주 사용하는 기능의 메서드는 바로바로 쓸 수 있게 만들어 두는 것이 좋다
	//Integer.parseInt(), JOpionpane.showInputDialog()
	

	// 일반 메서드: 객체 생성 후, 참조형 변수의 주소로 접근 가능!
	public int getAvg() {
		return sum / count;

	}

	public Day() {

	}
	// 메서드 이름을 동일하게 할 수 있음
	// 단, 입력값이 달라야함.
	// 하나의 이름으로 메서드 여러개 만들수 있음
	// 오버로딩(overloading): 다형성(하나의 이름으로 다양한 형태의 메서드를 구현, polymorphism(폴리모피즘))

	// 파라메터를 통해서 만든 멤버변수값을 한번에 출력하고자 하는 경우, toString()을 재정의
	@Override // 재정의, 오버라이드, 오버라이딩
	public String toString() {
		return "doing=" + doing + ", time=" + time + ", local=" + local + ", " + count + "일차";
	}

}

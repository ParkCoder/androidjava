package 클래스사용하기;

import 클래스만들기.계산기4;

public class 계산기4사용 {

	public static void main(String[] args) {

		계산기4 cal = new 계산기4();
		
		cal.add();
		cal.add(100);
		cal.add(5, 6);
		cal.add(3.5, 5);
		cal.add(4, 2.52);
	}

}

package 연산자;

import javax.swing.JOptionPane;

public class 기본입출력2 {

	public static void main(String[] args) {
		// 두 수를 입력받아
		//int로 변환 한 후
		//더한 다음
		//더한 결과 값 출력
		
		
		//ctrl + alt + 화살표아래: 한 줄 복사
		//alt + 화살표방향: 이동

		
		String number1 = JOptionPane.showInputDialog("첫번째 숫자를 입력해주세요");
		int num1 = Integer.parseInt(number1);
		
		String number2 = JOptionPane.showInputDialog("두번째 숫자를 입력해주세요");
		int num2 = Integer.parseInt(number2);
		
		int lastNum = num1 + num2;
		//+ 연산자: cpu
		
		System.out.println("두 숫자의 합은:"+lastNum);
		

	}

}

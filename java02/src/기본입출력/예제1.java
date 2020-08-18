package 기본입출력;

import javax.swing.JOptionPane;

public class 예제1 { //2개의 숫자를 입력받아서 사칙연산 하기

	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("첫번째 숫자를 입력해주세요");
		String num2 = JOptionPane.showInputDialog("두번째 숫자를 입력해주세요");
		
		int numb1 = Integer.parseInt(num1);
		int numb2 = Integer.parseInt(num2);
		
		System.out.println("더하기: "+(numb1 + numb2));
		System.out.println("빼기: "+(numb1 - numb2));
		System.out.println("곱하기: "+(numb1 * numb2));
		System.out.println("나누기: "+(numb1 / numb2));
				
				

	}

}

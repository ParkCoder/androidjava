package 조건문;

import javax.swing.JOptionPane;

public class 예제1 {

	public static void main(String[] args) {
		//사칙연산 첫번째 숫자 입력
		String numb1 = JOptionPane.showInputDialog("첫번째 숫자 입력");
		int num1 = Integer.parseInt(numb1);
		//사칙연산 기호 입력
		//String에서 char추출
		String oper = JOptionPane.showInputDialog("사칙연산입력(+ - * /)");
		char operator = oper.charAt(0);
		//사칙연산 두번째 숫자 입력
		String numb2 = JOptionPane.showInputDialog("두번째 숫자 입력");
		int num2 = Integer.parseInt(numb2);
		//사칙연산 결과
		int result1=num1+num2, result2=num1-num2, result3=num1*num2, result4=num1/num2;
		
		
		switch (operator) { //char값에 따른 결과 출력
		case '+':
			System.out.println(num1+"+"+num2+"="+result1);
			break;
		case '-':
			System.out.println(num1+"-"+num2+"="+result2);
			break;
		case '*':
			System.out.println(num1+"*"+num2+"="+result3);
			break;
		case '/':
			System.out.println(num1+"/"+num2+"="+result4);
			break;
		default:
			System.out.println("사칙연산을 정확하게 입력하세요");
			break;
		}
		
	}

}

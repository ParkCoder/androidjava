package 기본입출력;

import javax.swing.JOptionPane;

public class 예제2 { //숫자 입력을 2개 받아서 나열하기 (ex: 시작값5 종료값 1000 이면 5~1000까지 모든 숫자 프린트
	

	
	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("첫 숫자를 입력해주세요");
		String num2= JOptionPane.showInputDialog("마지막 숫자를 입력해주세요");
				int numb1 = Integer.parseInt(num1);
				int numb2 = Integer.parseInt(num2);
			for(int i = numb1; i <= numb2; i++) {
				System.out.println(i);
				
			}
				
	}

}

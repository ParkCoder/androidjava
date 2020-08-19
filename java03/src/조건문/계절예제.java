package 조건문;

import javax.swing.JOptionPane;

public class 계절예제 {

	public static void main(String[] args) {
		String x = JOptionPane.showInputDialog("몇 월이냐");
		int month = Integer.parseInt(x);
		
		switch (month) {//사용가능: 정수(byte,short,int), 문자, 문자열(String)
						//가용불가: 실수X
		case 2:
			System.out.println("28일까지 있다");
			break;
		case 4:case 6:case 9:case 11:
			System.out.println("30일까지 있다");
			break;
		default:
				System.out.println("31일까지 있다");
				
		
		}
	}

}

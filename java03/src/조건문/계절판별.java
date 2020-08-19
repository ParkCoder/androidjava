package 조건문;

import javax.swing.JOptionPane;

public class 계절판별 {

	public static void main(String[] args) {
		//int month = 8;
		String x = JOptionPane.showInputDialog("몇 월이냐");
		int month = Integer.parseInt(x);
		
		switch (month) {
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6:case 7:case 8:
			System.out.println("여름");
			break;
		case 9:case 10:case 11:
			System.out.println("가을");
			break;
		case 12:case 1:case 2:
			System.out.println("겨울");
			break;
		default:
			System.out.println("다시");
			break;
		}
	}

}

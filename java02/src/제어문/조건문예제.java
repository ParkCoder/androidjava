package 제어문;

import javax.swing.JOptionPane;

public class 조건문예제 {

	public static void main(String[] args) {
		/*먹고싶은 음식: 아이스크림

		아이스크림 =  뚜레주르로 가요
		아이스커피 = 이디야로 가요
		다른 것 = 물이나 마셔요*/
		
		//입력
		String food = JOptionPane.showInputDialog("뭐먹고싶니");
		
		
		//처리
		String result = "";
		if (food.equals("아이스크림")) {
			result = "뚜레주르로 가요";
		} else if (food.equals("아이스커피")) {
			result ="이디야로 가요";
		} else {
			result = "물이나마셔라";
		}
		
		//출력
		System.out.println(result);

	}

}

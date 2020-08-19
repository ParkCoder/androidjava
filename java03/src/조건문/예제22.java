package 조건문;

import javax.swing.JOptionPane;

public class 예제22 {

	public static void main(String[] args) {

		//구구단 단수 입력
		//String -> int 변환
		String gg = JOptionPane.showInputDialog("구구단  단수 입력");
		int g = Integer.parseInt(gg); 
		
		//9까지 반복
		for (int i = 1; i < 10; i++) {
		//int x는 입력값  * i(9)만큼 반복
			int x = g*i;
		//홀수 스킵
			if(x%2==1) {
				continue;
			}
		//출력
			System.out.println(g+"X"+i+"="+x);
		}	System.out.println("짝수인 구구단 값아 출력되었습니다.");
		
		
		
		
	}

}

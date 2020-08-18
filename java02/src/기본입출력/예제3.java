package 기본입출력;

import javax.swing.JOptionPane;

public class 예제3 {//숫자 1개를 입력받고 문자1개를 입력받아서 입력한 숫자만큼 문자 프린트 예) 숫자: 5 문자:★ 출력: ★★★★★

	public static void main(String[] args) {

		String num = JOptionPane.showInputDialog("숫자를 입력해주세요");
		String x = JOptionPane.showInputDialog("문자를 입력해주세요");
		
		int numb = Integer.parseInt(num);
		
		for (int i = 0; i < numb; i++) {
			System.out.print(x);
		}
		
		
		
		
	}

}

package 조건문;

import javax.swing.JOptionPane;

public class 반복문예제2 {

	public static void main(String[] args) {

		int fals = 0;
		int count = 0;

		while (true) {
			int target = 88;
			// 입력을 받아서 정답(target)이면 축하합니다! -> 종료 // 정답이 아니면 계속 반복 + 횟수 입력
			String choice = JOptionPane.showInputDialog("숫자를 맞춰보세요");
			int x = Integer.parseInt(choice);
			// 입력받은 숫자(choice)를 정수로 변환(x)
			count++;

			if (target == x) {
				System.out.println("정답입니다. 축하합니다!");
				break;
			// 입력한 숫자(x)와 정답(target)이 같으면 반복 종료(break)

			} else if (target > x) {
				System.out.println("숫자가 너무 작아요!");
				fals++;
			} else if (target < x) {
				System.out.println("숫자가 너무 커요!!");
				fals++;
			}
			// 정답(target)이 아닐 경우 계속 반복
		}
		System.out.println("틀린횟수: " + fals); // 틀렸을경우 fals++로 1씩 증가
		System.out.println("시도횟수: " + count); // 입력을 받은만큼 count++로 1씩 증가

	}
}

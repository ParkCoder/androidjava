package 복습;

import javax.swing.JOptionPane;

public class 입력받아평균내기 {

	public static void main(String[] args) {
		//5명의 성적을 입력받아 평균내기
		int[] jumsu =  new int[5];
		for (int i = 0; i < 5; i++) {
			String data = JOptionPane.showInputDialog("성적을 입력하시요");
			jumsu[i] = Integer.parseInt(data);
		}
		double sum = 0;
		for (int i = 0; i < jumsu.length; i++) {
			sum=sum+jumsu[i];
		}System.out.println("5명 점수의 평균은 "+(sum/jumsu.length)+"점 입니다.");
		
	}

}

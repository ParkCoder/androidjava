package 배열의응용;

import java.util.Random;

public class 값찾기 {

	public static void main(String[] args) {
		Random r = new Random(42);
		int[] number = new int[100];
		
		//1000까지의 랜덤값 생성
		for (int i = 0; i < number.length; i++) {
			number[i] = r.nextInt(1000);
		}
		//랜덤값이 생성되야 하니 값 생성 된 아래에 선언
		int max = number[0];
		int min = number[0];
		
		for (int i = 0; i < number.length; i++) {
			System.out.println(i + ":" + number[i]);
		}
		//최대값 구하기
		for (int i = 1; i < number.length; i++) {
			if (number[i] > max) {
				max = number[i];
			}
		}
		System.out.println("최대값은 " + max);
		//최소값 구하기
		for (int i = 1; i < number.length; i++) {
			if (number[i] < min) {
				min = number[i];
			}
		}
		System.out.println("최소값은 "+min);
		//최대값, 최소값의 위치
		for (int i = 0; i < number.length; i++) {
			if(number[i]==max) {
				System.out.println(max+"값의 위치는"+i+"번에 있습니다.");
			}
			if(number[i]==min) {
				System.out.println(min+"값의 위치는"+i+"번째에 있습니다.");
			}
		}
	
	
	}
	
	

}

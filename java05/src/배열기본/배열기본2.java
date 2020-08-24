package 배열기본;

public class 배열기본2 {

	public static void main(String[] args) {
		// 일주일간 온도를 넣은 공간을 만들어서 데이터를 넣고, 전체 출력

		//다양한 타입을 묶을때에는 배열을 쓰지 않음
		//배열은 고정된 크기를 가진다.(크기변경 불가)
		
		int temp[] = new int[7];
		temp[0] = 30;
		temp[1] = 31;
		temp[2] = 29;
		temp[3] = 30;
		temp[4] = 32;
		temp[5] = 33;
		temp[6] = 38;

		
		
		for (int i = 0; i < temp.length; i++) {
			System.out.println((i+1)+"일차 온도: " + temp[i] +"도");
		}

	}

}

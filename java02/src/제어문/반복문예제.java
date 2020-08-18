package 제어문;

public class 반복문예제 {

	public static void main(String[] args) {
		// 1. 100부터 1까지 프린트
		int start = 100; //시작값
		int end = 1; //끝값
		//int add = 1; //감소값
		
		while (start >= end) { //end(=1)은 start(=100)보다 작거나 같다
			System.out.println(start); //위 조건이 true일때 start 출력
			//start = start - add; //start=100 시작값
								//100에서 1(add)씩 감소(-)하며 조건이 false때까지 출력
			start--;//증감연산자: -- 1씩 감소할때만 사용가능
			
		}

	}

}

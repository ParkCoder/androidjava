package 제어문;

public class 반복문예제2 {

	public static void main(String[] args) {
		// 2. 5부터 10까지 프린트
		int start = 5; //시작값
		int end = 10; //끝값
		//int add = 1; //증가값
		
		while (start <= end) { //start(=5)는 end(=10)보다 작거나 같다
			System.out.println(start);//위 조건이 true일때 start 출력
			//start = start + add; //start = 5 시작값
								//5에서 1(add)씩 증가(+)하며 조건이 false일때까지 출력
			start++; //증감연산자 ++ 1씩증가
		}

	}

}

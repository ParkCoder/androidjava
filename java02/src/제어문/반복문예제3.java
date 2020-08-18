package 제어문;

public class 반복문예제3 {

	public static void main(String[] args) {
		// 3. 1부터 100까지 중 2씩 증가하면서 프린트
		int start = 1; //시작값
		int end = 100; //끝값
		int add = 2; //증가값
		while (start<=end) {//start(=1)는 end(=100)보다 작거나 같다
			System.out.println(start); //위 조건이 true일때 start 출력
			start = start + add; //start = 1 시작값
		}						//1에서 2(add)씩 증가(+)하며 조건이 false일때까지 출력

	}

}

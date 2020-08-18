package 연산자;

public class 형변환예제 {

	public static void main(String[] args) {
		//1 : 작은 것 -> 큰 것 자동형변환
		byte x = 100;
		int y = x;
		
		//2 : byte는 127까지만 가능
		int x = 300;
		byte y = x;
		
		//3 : int 강제형변환 가능
		double x = 400;
		int y = (int)x;
		
		
		//4 : 작은 것 -> 큰 것 자동형변환 
		int x = 400;
		double y = x;
		System.out.println(x);
		
	}

}

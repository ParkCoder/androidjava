package 연산자;

public class 논리연산자2 {

	public static void main(String[] args) {
		int hot = 25;
		int wind = 100;
		//hot 이 30도 이상, wind 88 이하
		// 양산을 들고 가자!
		
		if(hot>=30 || wind <=88) {
			System.out.println("양산을 들고감");
		}else {
			System.out.println("양산을 안들고감");
		}
		
	}

}

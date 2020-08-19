package 조건문;

public class SwitchCaseText {

	public static void main(String[] args) {
		String food = "국수";
		switch (food) {
		case "알밥": 
			System.out.println("분식집으로 가자");
			break;
		case "국수":
			System.out.println("국수집으로 가자");
			break;
		case "짜장면":
			System.out.println("중국집으로 가자");
			break;
		case "냉면":
			System.out.println("일식집으로 가자");
			break;
		default://if의 else와 동일
			System.out.println("먹지말자");
			
		
		}
	}

}

package 조건문;

public class 성별판별 {

	public static void main(String[] args) {
		String ssn = "900305-1234567";
		//프로그램 언어로 문자를 char로 받을 수 있는 방법은 없다.
		//String으로 입력을 받아서 원하는 char만 추출해야함
		char gender = ssn.charAt(7);
		//위치를 가지고 특정한 문자 한개를 추출하면 됨
		//위치는 index라고 부름, index는 0번부터 시작

		 switch (gender) {
		case '1':case '3':
			System.out.println("남성");
			break;
		case '2':case '4':
			System.out.println("여성");
			break;
		default:
			System.out.println("다시 입력해주세요");
			break;
		}
		
	}

}

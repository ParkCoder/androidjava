package 클래스만들기;

public class 내방 {

	public static void main(String[] args) {
		//. => 접근연산자
		휴대폰 p1 = new 휴대폰();
		// color, size, company 멤버변수 복사 => 자동초기화
		//p1변수 생성 => 멤버 변수들을 가르키는 주소
		
		p1.color = "흰색";
		p1.size = 7;
		p1.company = "삼성";

		System.out.println("<폰1>");
		System.out.println("폰1의 칼라: " + p1.color);
		System.out.println("폰1의 크기: " + p1.size);
		System.out.println("폰1의 회사: " + p1.company);

		p1.문자하다();

		System.out.println("---------------------");

		휴대폰 p2 = new 휴대폰();
		p2.color = "빨강";
		p2.size = 11;
		p2.company = "애플";

		System.out.println("<폰2>");
		System.out.println("폰2의 칼라: " + p2.color);
		System.out.println("폰2의 크기: " + p2.size);
		System.out.println("폰2의 회사: " + p2.company);

		p2.전화하다();

		System.out.println("---------------------");

		강아지 dog1 = new 강아지();

		dog1.size = "중형견";
		dog1.color = "흰색";

		System.out.println("강아지1 크기: " + dog1.size);
		System.out.println("강아지1 색상: " + dog1.color);
		System.out.println("강아지1은");
		dog1.eat();
		dog1.poo();

		System.out.println("---------------------");

		강아지 dog2 = new 강아지();

		dog2.size = "소형견";
		dog2.color = "검정";

		System.out.println("강아지2 크기: " + dog2.size);
		System.out.println("강아지2 색상: " + dog2.color);
		System.out.println("강아지2는");
		dog2.shout();
		dog2.poo();
		dog2.run();

	}

}

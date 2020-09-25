package 상속;

public class 슈퍼맨사용 {

	public static void main(String[] args) {
		
		슈퍼맨 s = new 슈퍼맨("클라크",100,10000,true);
		
//		s.age = 1000; //사람
//		s.name="클라크"; //사람
//		s.power=10000; //맨
//		s.fly =true; //슈퍼맨
		
		System.out.println(s);
		//최종 재정의된 슈퍼맨의 toString()이 호출됨
		
		s.eat(); //사람
		s.space(); //맨
		s.run(); //슈퍼맨
		
	}

}

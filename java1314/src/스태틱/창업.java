package 스태틱;

public class 창업 {

	public static void main(String[] args) {

		직원 member1 = new 직원("홍길동","남",80);
		System.out.println(member1);
		직원 member2 = new 직원("박길동","남",30);
		System.out.println(member2);
		직원 member3 = new 직원("노길동","여",20);
		System.out.println(member3);
		
		System.out.println("직원 "+직원.count+"명의 평균 나이는 "+직원.sum/직원.count+"살");
		
		
	}

}

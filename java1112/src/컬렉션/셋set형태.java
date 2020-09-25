package 컬렉션;

import java.util.HashSet;

public class 셋set형태 {

	public static void main(String[] args) {
		//set- 순서는 없지만, 자료의 중복을 허용하지 않는자료 => HashSet
		
		HashSet bag = new HashSet();
		
		bag.add("볼펜");
		bag.add("휴지");
		bag.add("지갑");
		bag.add("공책");
		System.out.println(bag.size());
		System.out.println(bag);
		
		System.out.println();
		System.out.println("------Set 예제------");
		
		HashSet team = new HashSet();
		team.add("디자이너");
		team.add("프로그래머");
		team.add("DB관리자");
		team.add("디자이너");
		team.add("디자이너");
		team.add("프로그래머");
		
		System.out.println(team);
		
	}

}

package 컬렉션;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class 예제 {

	public static void main(String[] args) {
		System.out.println("<1번 예제>");
		ArrayList run = new ArrayList();
		
		run.add("박소정");
		run.add("김정민");
		run.add("소지현");
		run.add("김개념");
		
		System.out.println("달리기 순위");
		for (int i = 0; i < run.size(); i++) {
			System.out.print((i+1)+"등:"+run.get(i)+"  ");
		}
		System.out.println();
		System.out.println("김정민 반칙! 최종 순위");
		run.remove(1);
		for (int i = 0; i < run.size(); i++) {
			System.out.print((i+1)+"등:"+run.get(i)+"  ");
		}
		
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println("<2번 예제>");
		HashMap sys = new HashMap();
		sys.put(100, "김데이");
		sys.put(200, "김사전");
		sys.put(300, "김구조");
		sys.put(400, "김자료");
		
		sys.remove(200);
		sys.put(300, "김충성");
		
		System.out.println(sys);
		
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println("<4번 예제>");
		
		HashSet trip = new HashSet();
		
		trip.add("유럽");
		trip.add("필리핀");
		trip.add("캐나다");
		trip.add("미국");
		trip.add("일본");
		System.out.println(trip);
		
		
		
		
	}

}

package DB연결;

import java.util.Date;

public class 반환값연습사용 {
	public static void main(String[] args) {
		반환값연습 p = new 반환값연습();

		Date date = p.add();
		System.out.println(date.getDate());
		System.out.println(date.getHours());

		boolean result3 = p.add(true);
		System.out.println(result3);

		int[] result4 = p.add(100);
		for (int x : result4) {
			System.out.println(x);
		}
		
		double result5 = p.add(55.5, 100);
		System.out.println(result5);
		
		String result6=p.add("나는", 1000);
		System.out.println(result6);
	}
}

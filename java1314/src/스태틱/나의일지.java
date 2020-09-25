package 스태틱;

import java.util.ArrayList;

public class 나의일지 {

	public static void main(String[] args) {

		Day day1 = new Day("자바", 8, "경기도");
		System.out.println(day1);
		System.out.println(Day.count + "일차 누적시간: " + Day.sum);
		Day day2 = new Day("여행", 10, "제주도");
		System.out.println(day2);
		System.out.println(Day.count + "일차 누적시간: " + Day.sum);
		Day day3 = new Day("운동", 11, "경기도");
		System.out.println(day3);
		System.out.println(Day.count + "일차 누적시간: " + Day.sum);

		System.out.println("평균시간은 " + day1.getAvg());
		System.out.println("회사이름은" + Day.getName());

//		ArrayList<Day> list = new ArrayList<>();
//		list.add(day1);
//		list.add(day2);
//		list.add(day3);
//		list.add(day4);
//		파일로저장 file = new 파일로저장();
//		file.save(list);

	}

}

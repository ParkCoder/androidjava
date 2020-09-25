package 컬렉션복습;

import java.io.FileWriter;
import java.util.ArrayList;

import 스태틱.Day;

public class 파일로저장 {

	public void save(ArrayList<Day> list) {
		//외부에서 데이터를 받아 파일로 저장
		
		System.out.println(list.size()+"일치가 넘어옴");
		for (int i = 0; i < list.size(); i++) {
			Day day = list.get(i);
			System.out.println((i+1)+"일차 "+day);
			System.out.println("---------------");
			
			try {
				FileWriter w = new FileWriter(i+".txt");
				w.write(day.doing+"\n");
				w.write(day.time+"\n");
				w.write(day.local+"\n");
				w.close();
			} catch (Exception e) {
			//try내에서 코드 에러 발생시 대응처리하는 내용을 써줌
				System.out.println("파일 저장 중 에러 발생");
			}
		}
			
	}
}

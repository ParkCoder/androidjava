package 크롤링;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습 {

	public static void main(String[] args) {
		// 크롤링: 웹사이트에서 정보를 가지고 오는 것
		// 단순: 스크래핑 단순+@: 크롤링

		// 크롤링순서
		// 1. 사이트연결 2. 해당 페이지 다운로드(html) 3. 원하는 위치의 정보를 추출해냄

		// 1.사이트 연결
		Connection con = Jsoup.connect("http://ncov.mohw.go.kr/");
		System.out.println("1. 사이트 연결 성공!");

		// 2.해당 페이지 다운로드
		try {
			Document doc = con.get();// index.html 첫화면
			System.out.println("2. 해당 페이지 다운로드 성공!");
			// System.out.println("-----------------------");
			// System.out.println(doc);

			// 3.원하는 위치의 정보를 추출해냄

			Elements list = doc.select("div.rpsa_map span.num");
			Elements list2 = doc.select("div.rpsa_map span.before");
			//Elements list3 = doc.select("div.liveNum span.num");
			//Elements list4 = doc.select("div.liveNum span.before");

			System.out.println("-----------지역별누적-----------");
			for (int i = 0; i < list.size(); i++) {
				Element tag = list.get(i);
				String text = tag.text();
				System.out.print(text+"  ");

			}
			System.out.println();
			System.out.println("--------지역별 전일대비---------");

			for (int i = 0; i < list2.size(); i++) {
				Element tag = list2.get(i);
				String text = tag.text();
				System.out.print(text+"  ");

			}
			System.out.println();
//
//			System.out.println("-----------------누적----------------");
//			for (int i = 0; i < list3.size(); i++) {
//				Element tag = list3.get(i);
//				String text = tag.text();
//				System.out.print(text + "  ");
//
//			}
//			System.out.println();
//
//			System.out.println("----------------전일대비 누적-----------------");
//			for (int i = 0; i < list4.size(); i++) {
//				Element tag = list4.get(i);
//				String text = tag.text();
//				System.out.print(text + "  ");
//
//
//			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}

}

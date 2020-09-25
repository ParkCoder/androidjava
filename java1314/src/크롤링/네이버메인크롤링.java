package 크롤링;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버메인크롤링 {

	public static void main(String[] args) {
		//크롤링: 웹사이트에서 정보를 가지고 오는 것
		//단순: 스크래핑    단순+@: 크롤링
		
		//크롤링순서
		//1. 사이트연결  2. 해당 페이지 다운로드(html) 3. 원하는 위치의 정보를 추출해냄
		
		
		//1.사이트 연결
		Connection con = Jsoup.connect("https://www.naver.com/");
		System.out.println("1. 사이트 연결 성공!");
		
		//2.해당 페이지 다운로드
		try {
			Document doc =con.get();//index.html 첫화면
			System.out.println("2. 해당 페이지 다운로드 성공!");
			//System.out.println("-----------------------");
			//System.out.println(doc);
			
		//3.원하는 위치의 정보를 추출해냄
			//System.out.println(doc.select("a.nav"));
			Elements list = doc.select("a.nav");
			//Elements == ArrayList+@@
			
			for (int i = 0; i < list.size(); i++) {
				Element tag=list.get(i);
				String text = tag.text();
				System.out.print(text+" ");
			}
			System.out.println();
//			Element tag = list.get(0);
//			System.out.println(tag);
//			String text = tag.text();
//			System.out.println(text);
			
			System.out.println("3. 원하는 위치의 정보를 추출 성공!");
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

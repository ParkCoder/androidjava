package 크롤링;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버메인크롤링2 {

	public static void main(String[] args) {
		
		Connection con = Jsoup.connect("https://movie.naver.com/movie/bi/mi/basic.nhn?code=190010");
		System.out.println("1. 사이트 연결 성공!");
		
		//2.해당 페이지 다운로드
		try {
			Document doc =con.get();
			System.out.println("2. 해당 페이지 다운로드 성공!");
			
			
		
			Elements list = doc.select("h3 a");
			//Elements == ArrayList+@@
			System.out.println(list.size());
			//System.out.println(list);
			System.out.println(list.get(0).text());
		
			Elements list2 = doc.select("dl.info_spec p.count");
			System.out.println(list2.get(0).text());
			
			
			
//			for (int i = 0; i < list.size(); i++) {
//				Element tag=list.get(i);
//				String text = tag.text();
//				System.out.print(text+" ");
//			}
//			System.out.println();

			
			System.out.println("3. 원하는 위치의 정보를 추출 성공!");
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

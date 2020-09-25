package 크롤링;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 증권크롤링3 {

	public String[] crawl(String code) {

		Connection con = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + code);

		String[] result = null;

		try {
			Document doc = con.get();

			Elements list3 = doc.select("div.today");
			Elements list4 = list3.select(".blind");
			
			String now = list4.get(0).text(); // 현재가
			String dif = list4.get(1).text(); // 차이
			String percent = list4.get(2).text(); // 증감비율

			result = new String[]{now, dif, percent};
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

}

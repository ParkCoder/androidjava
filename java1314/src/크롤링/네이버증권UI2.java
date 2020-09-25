package 크롤링;

public class 네이버증권UI2 {

	public static void main(String[] args) {

		String[] codes = {"005930","293490","019170","253840"};
		//String[] names = {"삼성전자","카카오게임즈","신풍제약","수젠텍"}; 
		
		증권크롤링2 naver = new 증권크롤링2();
		
		for (int i = 0; i < codes.length; i++) {
			String[] result=naver.crawl(codes[i]);
			System.out.println(result[i]);

		}
	
	}

}

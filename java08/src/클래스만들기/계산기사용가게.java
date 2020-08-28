package 클래스만들기;

public class 계산기사용가게 {

	public static void main(String[] args) {
		계산기 cal = new 계산기();
		
		cal.plus();
		
		//tv 부품을 사용해서, 켜고 끄기
		
		TV tv1 = new TV();
		TV tv2 = new TV();
		
		tv1.on();
		tv1.chup();
		tv1.off();
		System.out.println("------------");
		tv2.on();
		tv2.off();
		
	}
}

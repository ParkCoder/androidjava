package 클래스만들기;

public class 우리가족계좌 {

	public static void main(String[] args) {
		System.out.println("                    우리가족 계좌정보");
		System.out.println("-------------------------------");
		System.out.println("이름\t계좌이름\t금액");
		System.out.println("-------------------------------");
		
		계좌 father = new 계좌();

		father.name = "홍길동";
		father.bankname = "튼튼적금";
		father.money = 1000;
		
		System.out.println(father.name+"\t"+father.bankname+"\t"+father.money);

		계좌 mom = new 계좌();
		
		mom.name="박길동";
		mom.bankname="튼튼예금";
		mom.money=2000;
		
		System.out.println(mom.name+"\t"+mom.bankname+"\t"+mom.money);
		
		계좌 me = new 계좌();
		
		me.name="홍기사";
		me.bankname="다음적금";
		me.money=3000;
		
		System.out.println(me.name+"\t"+me.bankname+"\t"+me.money);
	
		father.in();
		me.out();
		System.out.println();
		System.out.print("=> 아버지는 ");
		father.in();
		System.out.print(" 딸은 ");
		me.out();
	
	}

}

package 컬렉션복습;

import java.util.ArrayList;

public class 은행 {

	public static void main(String[] args) {
		
		
		계좌 account1 = new 계좌("홍길동","정기적금",300000);
		계좌 account2 = new 계좌("김길동","정기예금",100000000);
		계좌 account3 = new 계좌("박길동","정기적금",600000);
		계좌 account4 = new 계좌("이길동","정기적금",8000000);
		계좌 account5 = new 계좌("노길동","정기예금",10000000);
		System.out.println(account1);
		System.out.println(account2);
		System.out.println(account3);
		System.out.println(account4);
		System.out.println(account5);
		
		ArrayList<계좌> bank = new ArrayList<계좌>();
		bank.add(account1);
		bank.add(account2);
		bank.add(account3);
		bank.add(account4);
		bank.add(account5);
		
		계좌저장 file = new 계좌저장();
		file.save(bank);
		
		
	}

}

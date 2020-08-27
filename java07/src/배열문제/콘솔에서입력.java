package 배열문제;

import java.util.Scanner;

public class 콘솔에서입력 {

	public static void main(String[] args) {
		//콘솔에서 입력: Scanner
		//모든 입력의 데이터 타입은 String!!
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("이름을 입력>> ");
		String x = scan.next();
		System.out.println("이름: "+ x);
		System.out.print("나이를 입력>> ");
		int y = scan.nextInt();//String을 int로 변환
		System.out.println("내년 나이는 "+ (y+1)+"살");
		
		//현재 키: 150.5  내년 키: 170.5
		System.out.print("현재키를 입력>> ");
		double z = scan.nextDouble();
		System.out.println("내년키는 "+(z+20)+"cm");
		
		//true: 우산을 가지고 가자 false: 우산을 두고 가자
		System.out.print("밖에 비가 오냐>> ");
		boolean a = scan.nextBoolean();
		if (a==true) {
			System.out.println("우산을 가지고 가자");
		}else {
			System.out.println("우산을 두고 가자");
		}
		
		System.out.print("당신의 목표는>> ");
		scan.nextLine();
		String life = scan.nextLine(); //엔터치기까지의 문장
		System.out.println("목표는 "+life);
		
		
		
	}

}

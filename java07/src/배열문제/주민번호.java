package 배열문제;

import java.util.Random;

public class 주민번호 {

	public static void main(String[] args) {
		Random jumin = new Random(); //랜덤 번호 생성
		int[] people = new int[100]; //100명 주민번호 생성
		//지역 카운트
		int seoul = 0, busan = 0, jeju = 0, etc = 0;
		//지역별 male, female 카운트
		int sm = 0, sf = 0, bm = 0, bf = 0, jm = 0, jf = 0, em = 0, ef = 0;
		//주민번호 100000~4999999 생성
		for (int i = 0; i < people.length; i++) {
			people[i] = jumin.nextInt(4000000) + 1000000;
		}

		for (int i = 0; i < people.length; i++) {
			String peoplest = Integer.toString(people[i]); //생성된 랜덤값 스트링 변형
			//System.out.println(i + " : " + peoplest); //번호 생성 확인

			char gender = peoplest.charAt(0); //char 0번째 자리 추출
			char city = peoplest.charAt(1); //char 1번째 자리 추출

			if (city == '1') {
				seoul++;
				if (gender == '1' || gender == '3') {
					sm++;
				} else if (gender == '2' || gender == '4') {
					sf++;
				}
			} else if (city == '2') {
				busan++;
				if (gender == '1' || gender == '3') {
					bm++;
				} else if (gender == '2' || gender == '4') {
					bf++;
				}

			} else if (city == '3') {
				jeju++;
				if (gender == '1' || gender == '3') {
					jm++;
				} else if (gender == '2' || gender == '4') {
					jf++;
				}

			} else {
				etc++;
				if (gender == '1' || gender == '3') {
					em++;
				} else if (gender == '2' || gender == '4') {
					ef++;
				}
			}

		}
		System.out.println("서울지역" + seoul + "명 중 남성은 " + sm + " 명 " + "여성은 " + sf + " 명");
		System.out.println("부산지역" + busan + "명 중 남성은 " + bm + " 명 " + "여성은 " + bf + " 명");
		System.out.println("제주지역" + jeju + "명 중 남성은 " + jm + " 명 " + "여성은 " + jf + " 명");
		System.out.println("기타지역" + etc + "명 중 남성은 " + em + " 명 " + "여성은 " + ef + " 명");

	}

}

package 배열문제;


import java.util.Scanner;

public class 성적관리 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String [][] jumsu = new String[6][4];
		
		jumsu[0][0]="이름";
		jumsu[1][0]="학번";
		jumsu[2][0]="1-중간";
		jumsu[3][0]="1-기말";
		jumsu[4][0]="2-중간";
		jumsu[5][0]="2-기말";
		
		
		int count=0;
		while (true) {
			for (int i = 1; i < 4; i++) {
				System.out.print("이름 입력 >> ");
				String name = scan.nextLine();
				System.out.print("학번 입력 >> ");
				String code = scan.nextLine();
				System.out.print("1학기 중간고사>> ");
				String result1 = scan.nextLine();
				System.out.print("1학기 기말고사>> ");
				String result2 = scan.nextLine();
				System.out.print("2학기 중간고사>> ");
				String result3 = scan.nextLine();
				System.out.print("2학기 기말고사>> ");
				String result4 = scan.nextLine();
					
					jumsu[0][i]=name;
					jumsu[1][i]=code;
					jumsu[2][i]=result1;
					jumsu[3][i]=result2;
					jumsu[4][i]=result3;
					jumsu[5][i]=result4;
				System.out.println("-------------------------------");	
					
				count++;
			
				
			int h11 = Integer.parseInt(result1);
			int h12 = Integer.parseInt(result2);
			int h21 = Integer.parseInt(result3);
			int h22 = Integer.parseInt(result4);
			
			int sum1= h11+h12;
			int sum2= h21+h22;
			
			if(sum1>sum2) {
				System.out.println(name+"은 1학기 보다 성적이 떨어짐");
			}else if(sum1<sum2) {
				System.out.println(name+"은 1학기 보다 성적이 오름");
			}else if(sum1==sum2) {
				System.out.println(name+"은 1,2학기 성적 동일");
				
			}
			System.out.println("-------------------------------");		
			}
			
		
			for (int i = 0; i < jumsu.length; i++) {
				for (int j = 0; j < jumsu[i].length; j++) {
					System.out.print(jumsu[i][j]+"\t");
				}System.out.println();
			
			}
			if(count==3) {
				break;
			}
			
			
		}

	

	}

}

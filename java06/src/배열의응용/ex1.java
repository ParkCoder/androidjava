package 배열의응용;

import javax.swing.JOptionPane;

public class ex1 {

	public static void main(String[] args) {
		// 10,20,30,40,50을 배열에 넣어 첫번째 값과 두번째 값을 더해서 print
		int[] num = { 10, 20, 30, 40, 50 };
		System.out.println("첫번째값 + 두번째값 = : " + (num[0] + num[1]));

		
		//JAVA, SPRING, JSP를 입력받아 배열에 넣어보세요
		  
		 String[] a = new String[3];
		 
		 for (int i = 0; i < 3; i++) {
			 a[i] = JOptionPane.showInputDialog("JAVA, SPRING, JSP를 입력해보세요"); 
		} System.out.println("**"+a[0]+"보다는 "+a[1]+"**");
		 
		 

		// 11,22,33,44을 배열에 넣어서 33은 몇번째 위치에 있는지 프린트
		
		int[] num1 = { 11, 22, 33, 44 };
		for (int i = 0; i < num1.length; i++) {
			if (num1[i] == 33) {
				System.out.println("33 은 " + i + "번째에 있음");
			}
		}

		// 5개의 정수배열을 만들어서 3~5까지 입력하여 프린트
		int[] number = new int[5];

		for (int i = 0; i < number.length; i++) {
			String number1 = JOptionPane.showInputDialog("숫자입력");
			number[i] = Integer.parseInt(number1);
			System.out.print(number[i]+" ");
		}System.out.println("");

		// 66,77,88,99중 최대값을 찾아보세요
		int[] maxx = { 66, 77, 88, 99 };
		int max = maxx[0];
		for (int i = 1; i < maxx.length; i++) {
			if (maxx[i] > max) {
				max = maxx[i];
			}
		}
		System.out.println("최대값은 " + max);

		//6번  66,77,88,99 순서 바꾸기
		int[] num6 = {66,77,88,99};
		
		int imsi = num6[0]; //imsi <- 66
		num6[0] = num6[3]; //num6[0] <- 99
		num6[3] = imsi; //num6[3] <- imsi
		
		for (int x : num6) {
			System.out.print(x+" ");
		}System.out.println();
		
	
	}

}

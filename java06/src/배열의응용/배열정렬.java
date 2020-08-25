package 배열의응용;


public class 배열정렬 {

	public static void main(String[] args) {
		int[] age = { 99, 10, 100, 88, 33, 24, 10, 77 };
		// 배열을 복사할때는 clone() 함수 사용!
		// 깊은 복사, 배열은 깊은 복사를 해야한다.
		int[] age2 = age.clone();
		for (int x : age) {
			System.out.print(x + "\t");
		}
		System.out.println();
		
		
		age2[0]=123;
		for (int x : age2) {
			System.out.print(x + "\t");
		}System.out.println();
		System.out.println("------------------------------------------------------------");
	}

		/*
		 Arrays.sort(age); //파괴함수 for (int x : age) { System.out.print(x + " ");
		 
		 }System.out.println(); System.out.println(age[2]);
		 */
	}



package 조건문;

import javax.swing.JOptionPane;

public class 반복문예제1 {

	public static void main(String[] args) {
		//누적시키는 변수는 반복문 밖으로.
		//반복할때마다 누적되지않고 초기화 되기 때문!
		
		//카운트 변수
		int ok = 0, no = 0, etc = 0;
		
	
		while(true) { //무한루프
		
			String data = JOptionPane.showInputDialog("ok)긍정, no)부정, etc)잘모르겠음, x)종료");
			if(data.equals("ok")) {
				System.out.println("긍정"); //ok 입력시 긍정 출력
				ok++;//증감연산자 
				//ok = ok + 1;
			}else if(data.equals("no")){
				System.out.println("부정"); //no 입력시 부정 출력
				no++;
			}else if(data.equals("etc")){
				System.out.println("잘모르겠음"); //etc 입력시 잘모르겠음 출력
				etc++;
			}else if(data.equals("x")){
				System.out.println("프로그램을 종료합니다."); // x 입력시 반복문 중단
				break; 
			}
		}
			//카운트 변수 증가 확인 (++)
			System.out.println("긍정: " + ok + "회");
			System.out.println("부정: " + no + "회");
			System.out.println("잘모르겠음: "+ etc + "회");
	}	
}

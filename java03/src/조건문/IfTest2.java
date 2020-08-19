package 조건문;

import javax.swing.JOptionPane;

public class IfTest2 {

	public static void main(String[] args) {
		//누적시키는 변수는 반복문 밖으로.
		//반복할때마다 누적되지않고 초기화 되기 때문!
		int ok = 0, no = 0, etc = 0;
		
		for (int i = 0; i < 5; i++) {
		String data = JOptionPane.showInputDialog("ok)긍정, no)부정, etc)잘모르겠음");
		
			if(data.equals("ok")) {
				System.out.println("긍정");
				ok++;//증감연산자 
				//ok = ok + 1;
			}else if(data.equals("no")){
				System.out.println("부정");
				no++;
			}else {
				System.out.println("잘모르겠음");
				etc++;
			}
		}	System.out.println("긍정: " + ok + "회");
			System.out.println("부정: " + no + "회");
			System.out.println("잘모르겠음: "+ etc + "회");
	}	
}

package 배열의응용;
import javax.swing.JOptionPane;

public class 투표 {

	public static void main(String[] args) {
		String[] name = {"블랙핑크","유재석","아이유","이효리","비"};
		int[] topyo = new int[5]; 
		
		
		for (int i = 0; i < 10; i++) {
			String choice = JOptionPane.showInputDialog("투표 해주세요 \n 0.블랙핑크\n 1.유재석\n 2.아이유\n 3.이효리\n 4.비");
			int choice2 = Integer.parseInt(choice);
			
			topyo[choice2]++;
			
	}	for (int i = 0; i < topyo.length; i++) {
		System.out.println(name[i]+": "+topyo[i]+"표");
	}
	
	
	
}
}

package 컬렉션복습;

import java.io.FileWriter;
import java.util.ArrayList;

public class 계좌저장 {

	public void save(ArrayList<계좌> bank) {
		
		for (int i = 0; i < bank.size(); i++) {
			계좌 b = bank.get(i);
			try {
				FileWriter w = new FileWriter(b.name+".txt");
				w.write(b.name+"\n");
				w.write(b.field+"\n");
				w.write(b.money+"\n");
				w.close();
			} catch (Exception e) {
			
				System.out.println("파일 저장 중 에러 발생");
			}
		}
		
	}

}

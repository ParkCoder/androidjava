package 스레드연습;

import java.util.Date;

public class TimerThread extends Thread {
	
	//@ => kyung_za@naver.com(at, -에)
	//@ => Annotation(표시, 표기)
	@Override //상속받은것을 재정의
	public void run() {
		for (int i = 0; i < 300; i++) {
			
			Date date = new Date();
			System.out.println(date);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

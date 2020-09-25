package 스레드연습;

public class ThreadRun3 {

	public static void main(String[] args) {
		CounterThread counter = new CounterThread();
		TimerThread timer = new TimerThread();
		ImageThread img = new ImageThread();
		
		counter.start();
		timer.start();
		img.start();
	}

}

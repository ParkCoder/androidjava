package 스레드;

public class ThreadRun {

	public static void main(String[] args) {

		StarThread star = new StarThread();
		AtThread at = new AtThread();
		star.start();
		at.start();
	}

}

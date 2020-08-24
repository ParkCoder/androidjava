package 배열기본;

public class 값이정해진경우2 {

	public static void main(String[] args) {
		String[] name = { "홍길동", "김길동", "최길동", "박길동" };
		for (String x : name) {
			System.out.println(x);
		}
		
		int[] age = { 20, 25, 33, 31 };
		for (int x : age) {
			System.out.println(x);
		}
		
		char[] sung = { '남', '남', '여', '여' };
		for (char x : sung) {
			System.out.println(x);
		}
		
		boolean[] morning = { true, false, true, true };
		for (boolean x : morning) {
			if(x==true){
				System.out.println("먹음");
			}else {
				System.out.println("안먹음");
				}
		}
		
		double[] weight = { 88.1, 65.4, 70.3, 100.5 };
		for (double x : weight) {
			System.out.println(x);
		}
		
		
		
		/*for (int i = 0; i < name.length; i++) {
			System.out.println("이름: " + name[i] + " 나이: " + age[i] + " 성별: " + sung[i] + " 몸무게: " + weight[i] + " 아침밥: "
					+ morning[i]);
		}*/

	}

}

package 스태틱;

public class 직원 {

	String name;
	String gender;
	int age;
	static int count;
	static int sum;

	public 직원(String name, String gender, int age) {
		count++;
		sum = sum + age;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	@Override
	public String toString() {
		return "이름: " + name + ", 성별:" + gender + ", 나이: " + age + "살";
	}

}

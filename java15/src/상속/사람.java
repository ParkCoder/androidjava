package 상속;

public class 사람 extends Object{
	//멤버변수
	String name;
	int age;
	
	//파라메터 있는 생성자를 정의하게 되면, 파라메터 없는 기본 생성자는 자동으로 만들어지지 않음.
	//new 사람(); --> 불가
	
	
	public 사람(String name, int age) {
		super(); // == Object(); : 부모의 기본 생성자 호출
		this.name = name;
		this.age = age;
	}
	

	
	public void eat() {
		System.out.println("먹다");
	}

	
	
	
	@Override
	public String toString() {
		return "사람 [name=" + name + ", age=" + age + "]";
	}

	

}

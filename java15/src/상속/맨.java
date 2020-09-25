package 상속;

public class 맨 extends 사람{
	//멤버변수2, 메서드1
	int power;
	

	
	
	public 맨(String name, int age, int power) {
		super(name, age);
		this.power = power;
	}

	public void run() {
		System.out.println("빨리 달리다");
	}

	//Source - Generate toString - power + inherited fields(사람 에서 상속받은 name/age) 
	@Override
	public String toString() {
		return "맨 [power=" + power + ", name=" + name + ", age=" + age + "]";
	}
	
	
}

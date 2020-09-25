package 상속예제;

public class Car {

	String brand;
	String size;
	
	public void oil() {
		System.out.println("기름이 가득 찼다.");
	}
	
	public void baggage() {
		System.out.println("짐이 가득 찼다.");
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", size=" + size + "]";
	}

}

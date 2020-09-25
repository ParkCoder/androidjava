package 상속예제;

public class CoffeeTruck extends Truck{

	int open_time;
	
	public void close() {
		System.out.println("영업종료");
	}

	@Override
	public String toString() {
		return "CoffeeTruck [open_time=" + open_time + ", t=" + t + ", brand=" + brand + ", size=" + size + "]";
	}
	
	
}

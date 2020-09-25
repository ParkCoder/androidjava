package 상속예제;

public class Truck extends Car{

	double t ;
	

	public void tire() {
		System.out.println("공기압을 점검하자.");
	}


	@Override
	public String toString() {
		return "Truck [t=" + t + ", brand=" + brand + ", size=" + size + "]";
	}
	
	
	
	
	
}

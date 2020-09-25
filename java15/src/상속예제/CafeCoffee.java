package 상속예제;

public class CafeCoffee {

	public static void main(String[] args) {

		CoffeeTruck 커피트럭 = new CoffeeTruck();
		
		커피트럭.brand="kia";
		커피트럭.size="중형";
		커피트럭.t=1;
		커피트럭.open_time=9;
		
		System.out.println(커피트럭);
		
		커피트럭.oil();
		커피트럭.tire();
		커피트럭.baggage();
		커피트럭.close();
		
	}

}

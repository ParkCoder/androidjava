package 컬렉션;

import java.util.HashMap;

public class 맵map형태 {

	public static void main(String[] args) {
		//map- 키와 값의 쌍으로 저장하고자 하는자료 =>HashMap
		HashMap phone = new HashMap();
		
		phone.put(1, "엄마");
		phone.put(2, "아빠");
		phone.put(3, "친구");
		System.out.println(phone);
		System.out.println(phone.get(1));
		
	}

}

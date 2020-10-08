package network;

import java.net.InetAddress;


public class Domain {

	public static void main(String[] args) throws Exception {
		//domain name : www.naver.com
		//DNS (domain 범위 name system
		
		String domain = "www.kakao.com";
		InetAddress ip = InetAddress.getByName(domain);
		
		System.out.println("ip주소: " + ip.getHostAddress());
				
	}

}

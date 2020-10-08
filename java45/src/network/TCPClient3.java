package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient3 {

	public static void main(String[] args) throws Exception{
		
		for (int i = 0; i < 1000; i++) {
			//localhost의 9100 포트로 연결
			Socket socket = new Socket("localhost",9100);
			System.out.println("client3 서버와 연결됨.");
			
			BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String data = input.readLine();
			System.out.println("받은데이터: " + data);
		}
	}

}

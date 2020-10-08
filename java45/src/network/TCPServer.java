package network;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	// 1.연결 요청만 담당하는 서버용 socket필요
    // prototype(프로트타입) 방법 <-> singletone(싱글론)
    // 필요할떄마다 객체생성 <-> 하나만 객체 생성 주소를 재사용
	
	public static void main(String[] args) throws Exception {
		
		//포트번호 9100 server 생성
		ServerSocket server = new ServerSocket(9100);
		System.out.println("TCP서버 시작됨");
		System.out.println("클라이언트의 요청을 기다리는중..");
		int count = 1;
		
		while (true) {
			//소켓 연결 대기
			Socket socket = server.accept();
			System.out.println(count+"번째 서버와의 연결 성공.");
			count++;
			//
			PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
			out.println("i am a java programmer");
		}
		
		
		
	}

}

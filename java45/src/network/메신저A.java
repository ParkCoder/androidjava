package network;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class 메신저A extends JFrame {
	private JTextField input;
	private JTextArea list;

	public 메신저A() {

		setTitle("메신저A");
		setSize(300, 500);
		getContentPane().setLayout(null);

		list = new JTextArea();
		list.setForeground(new Color(255, 255, 255));
		list.setFont(new Font("Monospaced", Font.BOLD, 20));
		list.setBackground(new Color(70, 130, 180));
		list.setBounds(0, 0, 284, 430);
		getContentPane().add(list);

		input = new JTextField();
		input.setForeground(new Color(0, 0, 0));
		input.setFont(new Font("굴림", Font.BOLD, 18));
		input.setBackground(new Color(211, 211, 211));
		input.setBounds(0, 430, 284, 31);
		getContentPane().add(input);
		input.setColumns(10);
		list.setEditable(false);

		input.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String data = input.getText();
				// 입력한 값 가지고 와서 list up!!
				list.append("나>> " + data + "\n");
				input.setText("");
				// 상대방에게 네트워크 전송
				try {
					DatagramSocket socket = new DatagramSocket();
					byte[] data2 = data.getBytes();
					InetAddress ip = InetAddress.getByName("192.168.1.80");
					DatagramPacket packet = new DatagramPacket(data2, data2.length, ip, 5000);
					socket.send(packet);
					
					InetAddress ip2 = InetAddress.getByName("192.168.1.197");
					DatagramPacket packet2 = new DatagramPacket(data2, data2.length, ip2, 4000);
					socket.send(packet2);
					socket.close();
					
				}catch (Exception e1) {
					System.out.println("데이터 보내는 중 에러!!");
				}

			}
		});
		setVisible(true);

	}

	public void process() {
		while (true) {
			try {
				DatagramSocket socket = new DatagramSocket(3000);
				// 빈 패킷 필요
				byte[] data = new byte[256];
				DatagramPacket packet = new DatagramPacket(data, data.length);
				socket.receive(packet);
				System.out.println("받은데이터 : " + new String(data));
				list.append("너>> " + new String(data) + "\n");
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("데이터 받는 도중 에러!!");
			}
		}
	}

	public static void main(String[] args) {
		메신저A m = new 메신저A();
		m.process();

	}
}

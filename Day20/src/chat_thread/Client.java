package chat_thread;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

// 나(사용자)
public class Client {
	// 소켓, 필터스트림(선)
	private Socket clientSocket;
	private DataInputStream dataInputStream;
	private DataOutputStream dataOutputStream;

	public Client(Socket temp) {
		this.clientSocket = temp;
		try {
			// 서버가 나한테 보내주는거
			dataInputStream = new DataInputStream(clientSocket.getInputStream());
			// 내가 서버한테 요청하는거
			dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());
		} catch (IOException e) {
		}
	} // 생성자 끝
	public void send(String message) {
		
		// 익명클래스
		//  - 이름이 없는 클래스 1회용
		Runnable thread = new Runnable() {
			
			@Override
			public void run() {
				
				try {
					dataOutputStream.writeUTF(message);
				} catch (IOException e) {}
			}
		};
		// 여러 개의 쓰레드를 관리하는 pool
		Server.threadpool.submit(thread);
	}
	
	public void receive() {
		
		Runnable thread = new Runnable() {
			
			@Override
			public void run() {
				
				try {
					// 메시지 수신을 계속 반복적으로 한다.
					while(true) {
						// utf-8 읽어온다
						String recvData = dataInputStream.readUTF();
						System.out.println("[메시지수신 성공]");
						// getRemoteSocketAddress() 연결된 시스템에 대한 주소를 반환한다.
						System.out.println(clientSocket.getRemoteSocketAddress()+Thread.currentThread().getName());
						
						for(Client client: Server.clientList) {
							client.send(Thread.currentThread().getName()+":"+recvData);
						}
					}
				} catch (Exception e) {
				}
			}
		};
		Server.threadpool.submit(thread);
		
		
	}
	
	
} // client끝

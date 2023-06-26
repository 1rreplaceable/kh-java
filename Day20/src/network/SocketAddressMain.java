package network;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

public class SocketAddressMain {

	public static void main(String[] args) {
		// SocketAddress
		// ip 주소(호스트 이름) + port번호 관리하는 추상클래스
		// 상속을 받는다. InetSocketAddress 클래스로 사용이 가능하다
		
		// InetSocketAddress(포트번호)
		//  - ip주소 없이 내부의 포트 정보만 지정
		
		InetAddress ia1;
		try {
			int port = 20000;
			ia1 = InetAddress.getByName("www.google.com");
			InetSocketAddress isa1 = new InetSocketAddress(port);
			InetSocketAddress isa2 = new InetSocketAddress("www.google.com", port);
			InetSocketAddress isa3 = new InetSocketAddress(ia1, port);
			
			System.out.println(isa1);
			System.out.println(isa2);
			System.out.println(isa3);
		} catch (UnknownHostException e) {
			System.out.println("주소가 없습니다");
		}
		
		
	
		
		
		
	}
}

package NetWork;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {

	public static void main(String[] args) {

		// 사람들끼리 정보를 교환하기 위해서 인터넷에 접속
		// 호스트
		//  - 사용자
		
		// 라우터
		//  - 호스트에서 생성된 데이터를 여러 네트워크를 거쳐
		//   전송함으로써 다른 네트워크에 데이터를 교환할 수 있다.
		
		// 클라이언트 cient 나
		// 서버 server    네이버, 구글 사이트
		
		// 컴퓨터 간의 관계를 역할로 구분하는 개념
		// 서비스를 제공하는 쪽이 서버
		// 제공 받는 쪽 클라이언트
		
		// 통신 프로토콜
		//  - 호스트가 라우터와 라우터 통신
		
		// 인터넷을 이용하려면 규칙(프로토콜)
		// ip 주소 (ipv4) 32bit 주소를 생성
		//	      (ipv6) 64bit 주소를 생성
		
		// tcp/ip 계층 구조
		//  - 역할 : 물리적 네트워크 통한 데이터 송수신
		//  - 구성요소 : 네트워크 하드웨어 + 장치 드라이버
		//  - 주소 저장 방식 : 물리 주소 이더넷 48비트
		
		// 내 컴퓨터 정보를 확인
		// 돋보기 -> cmd -> 명령프롬프트 -> ipconfig(간단)
		//					ipconfig /all
		
		// 인터넷에 접속을 할 때는 공인 ip 중복을 할 수 없다
		// 					사설 ip
		
		// 포트
		//  - 연결 통로 (통신 연결하는 번호)
		//  - 웹 서버 80
		
		// ip 주소를 나타내는 클래스 InetAddress
		// ip 번호랑 URL을 조사할 때 사용
		
		// DNS 서버
		// 114 똑같다
		// URL 찾아서 ip주소로 변환하는 서버
		// 문자로 돌아온 주소값을 ip 주소인 ipv4로 변경
		
		// TCP / UDP
		// tcp -> 전화
		// 요청 -> 응답이 온다. 프로세스 간에 통신을 하려면
		// 	소켓 
		// 1:1 통신 방식이다. 데이터가 오류 메시지나 전달 안될 경우
		// 바로 확인 가능하다. 파일 전송 신뢰성이 높다
		// 전화통화 
		
		// udp
		//  - 오류 발생시에 데이터를 전달 하느냐 안하느냐 신뢰성
		//  - 우편(소포), 택배 
		
		// url
		//  인터넷 상의 파일이나 데이터베이스 같은 자원에
		//  대한 주소를 지정하는 방법
		// 프로토콜 이름: http
		// 호스트 이름: www.naver.com
		// 파일 이름: 웹문서 index.html
		// 포트 번호: 80
		
		// getHostAddress() ip주소를 String 타입으로 변환한다.
		String hostname = "www.naver.com";
		
		try {
			InetAddress address = InetAddress.getByName(hostname);
			System.out.println("ip주소 : "+address.getHostAddress());
		} catch (UnknownHostException e) {
			System.out.println(hostname + "의 ip를 찾을 수 없습니다.");
		}
		
		// 통신하려면 Socket 연결통로
		// 두 컴퓨터 간에 통신하는 끝 부분을 의미
		
		// Socket(InetAddress address, int port)
		
		
		
	}

}

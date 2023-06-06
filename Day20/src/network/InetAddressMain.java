package network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressMain {

	public static void main(String[] args) {
		// 네트워크의 기본 개념 (통신 방식)

		// 통신 일 대 일, 일 대 다, 일 대 다 특정 그룹

		// 유니캐스트
		// - 두 장치간 1:1로 통신한다.
		// - 특정 대상이랑만 통신, 같은 네트워크 대역에서
		// 사용을 할 수 있다.
		// - 잔디 디엠 (카카오톡 1:1 대화)

		// 브로드 캐스트
		// - 네트워크에 있는 모든 대상과 통신하는 것
		// - 유튜브

		// 멀티캐스트
		// - 여러명이 같은 네트워크에 있지만
		// 특정 지정한 몇명과 통신하는 것
		// 카카오톡 그룹채팅 1:N

		// 네트워크의 분류 (크기)
		// LAN (Local Area Network)
		// - 가까운 지역을 하나로 묶는 네트워크
		// - 같은 pc방 통신, 같은 강의장
		// - 관리를 해서 다른 강의장이나 다른 pc방으로
		// 그걸 관리하는 장치 바로 스위치

		// WAN (Wide Area Network)
		// - 멀리 있는 지역을 한데 묶은 네트워크
		// - LAN과 LAN을 묶인 것을 하나로 묶는 것

		// 네트워크에 따른 연결 형태

		// 노드: 인터넷에 연결된 시스템의 가장 기본적인 용어
		// 데이터를 구별하는 것

		// star형
		// 단점: 중앙 장치가 오류가 생기면 모든 네트워크들은
		// 통신을 할 수 없다.
		// 공유기

		// Mesh형
		// - 여러 노드들이 서로 그물처럼 연결된 것
		// - star형의 단점을 없애준다.

		// ip주소(호스트) 저장 및 관리를 하는 클래스
		// getByName("도메인")
		// - Host 이름과 해당 ip주소를 저장 (객체로 리턴)
		// - 인터넷통신하려면 ip 꼭 필요하다
		// - 도메인을 변경하는 것 -> DNS 서버 대표적으로 kt

		// getByAddress(byte[])
		// 입력한 주소 저장 객체 리턴(128이상 일 경우 byte 형변환)

		// getByAddress(String, byte[])
		// 입력한 문자열과(호스트), ip주소를 저장 객체 리턴
		
		// 통신을 하기 위해서는 원격지(나) 필요하다 상대방ip, 호스트이름
		// 인터넷 통신을 할 수 있다.
		try {
			InetAddress ia1 = InetAddress.getByName("www.google.com");
			InetAddress ia2 = InetAddress.getByAddress(new byte[] { (byte) 172, (byte) 217, (byte) 161, (byte) 132 });
			InetAddress ia3 = InetAddress.getByAddress("www.google.com",
					new byte[] { (byte) 172, (byte) 217, (byte) 161, (byte) 132 });
			
			System.out.println(ia1);
			System.out.println(ia2);
			System.out.println(ia3);
			
			// 로컬 / 루프백 IP
			//  - 자기 자신을 나타내는 가상적인 주소
			//  - localhost / 127.0.0.1
			InetAddress ia4 = InetAddress.getLocalHost();
			InetAddress ia5 = InetAddress.getLoopbackAddress();
			
			System.out.println("ia4"+ia4.getHostAddress());
			System.out.println(ia5.getHostAddress());
			
			// InetAddress ip만 관리
			// 접속하고 싶은 사이트 ip 확인하기
			
			// 하나의 호스트가 여러개 ip를 가지고 있을 경우
			// getAllByName() 여러개의 ip를 사용하는 경우 모든 호스트 ip리턴 
			
			InetAddress[] ia6 = InetAddress.getAllByName("www.google.com");
			System.out.println(Arrays.toString(ia6));
			
			System.out.println();
			
			// 호스트와 ip 알아내기
			byte[] address = ia1.getAddress();
			System.out.println(Arrays.toString(address));
			
			System.out.println(ia1.getHostName());
			System.out.println(ia1.getLoopbackAddress());
			
			// 멀티캐스트 영역, cmd에서 ping 네트워크 접속확인
			System.out.println(ia1.isMulticastAddress());
			System.out.println(ia1.isReachable(1000));
			
		} catch (UnknownHostException e) {
			System.out.println("없는 주소입니다.");
		} catch (IOException e) {}

	}
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) {

		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		Scanner sc = new Scanner(System.in);

		try {
			listener = new ServerSocket(9999);
			System.out.println("연결을 기다리고 있습니다......");
			socket = listener.accept();

			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			while (true) {
				String inputMessage = in.readLine();

				if (inputMessage.equalsIgnoreCase("bye")) {
					System.out.println("사용자가 bye로 연결 종료");
					break;
				}

				System.out.println("사용자:" + inputMessage);
				System.out.println("관리자>");
				String outputMessage = sc.nextLine();
				out.write(outputMessage + "\n");
				out.flush(); // 모든 내용을 전송

			}

		} catch (IOException e) {
		} finally {
			sc.close(); // 스캐너 닫기
			try {
				socket.close(); // 통신 소켓 닫기
				listener.close(); // 서버소켓 닫기
			} catch (IOException e) {}
		}

	}

}

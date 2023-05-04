package Methods;

import java.util.Scanner;

public class Resrvation {

	public static int ticketing(String dest) {
		String[] area = { "춘천", "수원", "대전", "광주", "부산", "대구" };
		int[] fee = { 5000, 3000, 25000, 35000, 40000, 35000 };
		int pay = 0;
		int idx = -1;

		for (int i = 0; i < area.length; i++) {
			if (dest.equals(area[i])) {
				idx = i;
				pay += fee[idx];
			}
		}
		return pay;
	}

	public static int train(String train) {
		String[] whatTrain = { "ktx", "srt", "새마을호", "무궁화호" };
		int[] tarinFee = { 10000, 5000, 1000, 2000 };
		int trainPay = 0;
		int trainIdx = -1;
		for (int i = 0; i < whatTrain.length; i++) {
			if (train.equals(whatTrain[i])) {
				trainIdx = i;
				trainPay += tarinFee[trainIdx];
			}
		}
		return trainPay;
	}

	public static void main(String[] args) {

		/*
		 * 열차예매 1. 목적지를 매개변수로 받으면 운임비를 main에 있는 pay변수에 저장
		 * 
		 */
		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.println("가고싶은 역을 입력>");
			String dest = in.nextLine();
			System.out.println("열차 종류를 입력>");
			String train = in.nextLine();
			int ticketPay = ticketing(dest);
			int trainPay = train(train);
			System.out.println(dest + "까지 가는 총 운임비는 " + (ticketPay + trainPay)+" 원 입니다.");
		}
	}

}

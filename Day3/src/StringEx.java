import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {

		String[] arr = { "IMF", "제주도", "자바도시", "한글나라", "컴퓨터", "java", "python", "초롱초롱", "군고구마", "바람", "스크립터", "모카" };
		Arrays.sort(arr);

		// toString()
		System.out.println(Arrays.toString(arr));

		String str1 = "a";
		String str2 = "b";
		String str3 = "a";

		int res1 = str1.compareTo(str2);
		System.out.println(res1);

		int res2 = str2.compareTo(str1);
		System.out.println(res2);

		int res3 = str1.compareTo(str3);
		System.out.println(res3);

		// "hello"
		String str = "hello";
		char ch = str.charAt(0);
		System.out.println(ch);
		str = "python java html jsp spring";
		System.out.println(str.substring(7, 11));

		str = "python,java,html,jsp,spring";
		String[] arr2 = str.split(",");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		
		// 길이확인 length()
		
		System.out.println(str.length());
		
		String jumin = "890101-2012932";
		char check = jumin.charAt(7);
		if (check == '2') {
			System.out.println("여성");
		}else if (check == '1') {
			System.out.println("남성");
		}
		
		Scanner in = new Scanner(System.in);
		System.out.println("이메일을 입력>");
		String userEmail = in.nextLine();
		String[] backEmail = userEmail.split("@");
		String dotEmail = userEmail.substring(userEmail.length()-3, userEmail.length());
		System.out.println(dotEmail);
		if(backEmail[0].length() >= 9) {
			System.out.println("가입이 가능합니다.");
			if(dotEmail.equals("com")|| dotEmail.equals("net")) {
				System.out.println("정상적으로 가입이 가능합니다.");
			}else {
				System.out.println("정상적으로 가입이 불가능합니다.");
			}
		}else {
			System.out.println("가입이 불가능합니다.");
		}
	}

}

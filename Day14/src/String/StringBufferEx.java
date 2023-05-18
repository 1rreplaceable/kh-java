package String;

public class StringBufferEx {

	// String StinrgBuffer, StringBuilder
	// 공통점 : 문자열 다룬다.
	// 차이점 : 사용 목적에 따라 쓰임새 많이 다르다.

	// StringBuffer, StringBuilder
	// 문자열을 연산(추가하거나 변경) 할 때 자주쓴다.

	static void showstrbu() {
		// 버퍼(buffer)
		// - 임시 저장 공간(독립적인 공간)
		// 문자열을 바로 추가할 수 있고 공간 나입도 없고
		// 연산속도가 매우 빠르다.

		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append("world");
		sb.append("java");
		sb.append("fun");

		String result = sb.toString();
		System.out.println(result);
		System.out.println(sb.hashCode());
		System.out.println(result.hashCode());

	}

	void showstrbu2() {

		String str = "abcdefg";
		StringBuffer sb = new StringBuffer();

		
		sb.insert(2, "추가합니다");

	}

	void showstr() {

		String str = "";
		str += "이서희";
		str += ",";
		str += "jump to java";

		System.out.println(str);
	}

}

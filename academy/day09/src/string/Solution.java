package string;

class Solution {
	public String solution(String new_id) {
		String answer = "";
		// 1단계
		new_id = new_id.toLowerCase();
		// 2단계
		String myFilter = "abcdefghijklmnopqrstuvwxyz0123456789-_.";
		for (int i = 0; i < new_id.length(); i++) {
			char ch = new_id.charAt(i);
			if (myFilter.contains(ch + "")) {
				answer += ch;
			}
		}
//        answer = new_id.replaceAll("[^0-9a-z-_.]", "");
		// 3단계
		while (answer.contains("..")) {
			answer = answer.replace("..", ".");
		}
		// 4단계
//		if (answer != "") {
//			if (answer.charAt(0) == '.') {
//				answer = answer.replaceFirst(".", "");
//			}
//			int index = answer.length();
//			if (answer.charAt(index - 1) == '.') {
//				answer = answer.substring(0, index - 1);
//			}
//		}
		// 강사님 코드
		if (answer.startsWith(".")) {
			answer = answer.substring(1);
		}
		if (answer.endsWith(".")) {
			answer = answer.substring(0, answer.length() - 1);
		}
		// 5단계
//		if (answer == "") {		// 문자열은 == 연산자를 사용하지 못하고, eqauls로 비교해야한다
//			answer += "a";
//		}
		// 강사님 코드
		if(answer.equals("")) {
			answer = "a";
		}
		
		
		// 6단계
		answer = answer.length() >= 16 ? answer.substring(0, 15) : answer;
		if (answer.endsWith(".")) {
			answer = answer.substring(0, answer.length()-1);
		}
		// 7단계
//		if (answer.length() <= 2) {
//			for (int i = answer.length(); i <= 3; i++) {
//				char ch = answer.charAt(answer.length() - 1);
//				answer += ch;
//			}
//		}
		// 강사님 코드
		while(answer.length() < 3) {
			answer += answer.charAt(answer.length() - 1);
		}
		
		return answer;
	}
}
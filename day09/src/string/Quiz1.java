package string;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// Luhn 알고리즘

		/*
		 * 카드번호 16자리의 글자를 이용하여 카드 번호의 유효성을 검증하는 알고리즘 우측부터 세어서 홀수번째는 그대로 두고 짝수번째는 두 배로
		 * 만든다 만약 두 배로 만들어진 값이 두 자리수가 되면 각 자릿수를 합한다 이렇게 만들어진 16자리의 정수를 모두 더하여 그 합이 10으로
		 * 나누어 떨어지면 유효한 카드 번호, 그렇지 않으면 유효하지 않은 카드 번호이다
		 *
		 * 문자열로 카드번호를 xxxx-xxxx-xxxx-xxxx 형식으로 전달받아서 유효성을 true/false로 반환하는 함수를 작성하고
		 * 테스트하세요
		 */
		// 2720-1234-5678-1357
		// 4740-2264-1658-2317 (62, false)

		// 1720-1234-5678-1357
		// 2740-2264-1658-2317 (60, true)

		String card;
		Scanner sc = new Scanner(System.in);
		System.out.print("카드 번호를 입력하세요 : ");
		card = sc.next();

		System.out.printf("유효성 검사 결과 : %s", sumcardnum(card));
		sc.close();
	} // end of main

	static boolean sumcardnum(String card) {
		boolean answer = false;
		int sum = 0;
		long cnum = 0;
		
		String cardnum = card.replace("-", "");
		if(cardnum.length() != 16) {	// -를 제외한 카드번호의 길이가 맞지 않으면
			return false;			// 함수를 중단하면서 false를 반환한다
		}
		cnum = Long.parseLong(cardnum);
		
		for (int i = 0; i < cardnum.length(); i++) {
			int num = (int) (cnum % 10);
			if (i % 2 != 0) {
				num *= 2;
				if (num >= 10) {
					num = num / 10 + num % 10;
				}
			}
			sum += num;
			cnum /= 10;
		}
		answer = sum % 10 == 0;
		return answer;
	}
}

package string;

import java.util.Scanner;

public class Quiz1_teacher {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String card;
		
		System.out.print("카드 번호 입력 : ");
		card = sc.next();
		
		boolean b = checkCardNumber(card);
		
		System.out.printf("입력한 카드번호 : %s\n", card);
		System.out.printf("카드 유효성 : %s\n", b);
		
	}	// end of main
	
	static boolean checkCardNumber(String card) {
		boolean answer = false;
		int sum = 0;
		card = card.replace("-", "");
		
		if(card.length() != 16) {	// -를 제외한 카드번호의 길이가 맞지 않으면
			return false;			// 함수를 중단하면서 false를 반환한다
		}
		for(int i = 0; i < card.length(); i++) {
			char ch = card.charAt(i);
			int num = ch - 48;
//			System.out.printf("ch : %c, %d\n", ch, (int)ch);
//			System.out.println(num);
			// 홀수번째는 그대로, 짝수번째는 두배로
			if(i % 2 == 0) {
				num *= 2;
				if(num >= 10) {		// 만약 더한 값이 두자리 수 이상이면(10 이상이면)
					num = num / 10 + num % 10;	// 10의 자리와 1의 자리를 더한다
				}
			}
			sum += num;		// 합계에 누적시킨다
		}
		answer = sum % 10 == 0;		// 그 합이 10으로 나누어 떨어지면 true
		return answer;
	}
}

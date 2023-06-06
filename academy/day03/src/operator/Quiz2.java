package operator;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {

		long cardNumber;
		Scanner sc = new Scanner(System.in);
		String answer = "";

		System.out.print("카드번호 16자리를 입력 : ");
		cardNumber = Long.parseLong(sc.nextLine());

		System.out.println("cardNumber : " + cardNumber);
		// 위 숫자를 4자리씩 분리하여 사이에 "-"를 더하여 다시 출력하세요
		// 코드 작성
		long term, first, second, third, last;

		last = cardNumber % 10000;
		term = cardNumber / 10000;
		
		third = term % 10000;
		term = term / 10000;
		
		second = term % 10000;
		first = term / 10000;

		answer = first + "-" + second + "-" + third + "-" + last;

		System.out.println("answer : " + answer);
		sc.close();
	}
}

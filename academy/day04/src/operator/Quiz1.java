package operator;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// Ex04의 Scanner 형식을 참조하여 다음 조건을 만족하는 코드를 작성하세요
		// 정수를 하나 입력받아서, 홀수와 짝수를 문자열로 출력하는 코드를 작성합니다
		// 단, 0은 짝수로 취급합니다
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		// 삼항 연산자
		String result = num % 2 == 0 ? "짝수" : "홀수";
		System.out.println(num + " : " + result);
		
		// if문
		if (num % 2 == 0 || num == 0) {
			System.out.println(num + " : 짝수");
		}
		else {
			System.out.println(num + " : 홀수");
		}
		
		sc.close();
	}
}
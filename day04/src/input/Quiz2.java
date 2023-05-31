package input;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		// 생년월일을 8자리 정수로 입력받아서
		// 올해연도를 이용하여 나이를 계산하여 출력하기
		// 출생 : yyyy-MM-dd
		// 나이 : x살

		Scanner sc = new Scanner(System.in);

		int currentYear = 2023;
		int birthYear;
		int month;
		int date;
		int age;

		System.out.print("생년월일 8자리를 입력하세요 : ");
		birthYear = Integer.parseInt(sc.nextLine());

		date = birthYear % 100;
		birthYear /= 100;
		month = birthYear % 100;
		birthYear /= 100;

		age = currentYear - birthYear;

		System.out.printf("출생 : %d-%d-%d\n", birthYear, month, date);
		System.out.printf("%d세(만 %d세)", age + 1, age);
		
		sc.close();
	}
}

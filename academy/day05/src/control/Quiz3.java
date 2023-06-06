package control;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		// 서로 다른 두 정수를 입력받아서 큰 수를 출력하세요
		// 만약 같으면 아무 수나 출력해도 됩니다

		Scanner sc = new Scanner(System.in);
		int num1, num2;
		String format = "%d와 %d 중 더 큰 것은 %d입니다.";
		boolean result;

		System.out.print("n1 입력 : ");
		num1 = sc.nextInt();
		System.out.print("n2 입력 : ");
		num2 = sc.nextInt();

		result = num1 >= num2;

		if (result) {
			System.out.printf(format, num1, num2, num1);
		}
		else {
			System.out.printf(format, num1, num2, num2);
		}
		
		sc.close();
	}
}

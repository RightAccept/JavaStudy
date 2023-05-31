package control;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// 나이를 정수로 입력받아서
		// 성인 혹은 미성년자를 판별하여 출력하는 코드를 작성하세요
		// 삼항 연산자를 사용하지 않고, if를 이용하여 처리하세요
		// (20세 이상은 성인, 아니면 미성년자)
		
		Scanner sc = new Scanner(System.in);
		// 아래로 코드 작성
		int age;
		
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		
		if (age >= 20) {
			System.out.printf("%d세는 %s입니다.", age, "성인");
		}
		else {
			System.out.printf("%d세는 %s입니다.", age, "미성년자");
		}
		
		sc.close();
	}
}

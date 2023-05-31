package loop;

import java.util.Random;
import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		// 랜덤을 활용한 업다운 게임을 작성하세요

		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int num = ran.nextInt(100) + 1;
		int answer = 0;
		int cnt = 1;

		System.out.println("1~100 사이의 숫자를 맞춰보세요 ");

		while (answer != num) {
			System.out.printf("%d번째 시도 : ", cnt);
			answer = sc.nextInt();
			
			if (answer > num) {
				System.out.println("다운");
			}
			else {
				System.out.println("업");
			}
			cnt++;
		}
		System.out.printf("축하합니다! %d번만에 맞히셨네요!", cnt);
		sc.close();
	}
}

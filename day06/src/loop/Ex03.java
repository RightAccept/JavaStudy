package loop;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// 횟수가 일정하지 않거나, 횟수를 가늠하기 어려운 반복
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int num = ran.nextInt(6) + 1;
		int answer;
		int cnt = 0;
		
		System.out.print("1에서 6사이 랜덤값을 맞춰보세요 : ");
		answer = sc.nextInt();
		cnt++;
		
		while(answer != num) {
			System.out.print("틀렸습니다. 다시 시도 :");
			answer = sc.nextInt();
			cnt++;
		}
		
		System.out.println(cnt + "번 만에 정답을 맞췄습니다~");
		sc.close();
	}
}

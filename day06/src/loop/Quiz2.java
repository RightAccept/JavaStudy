package loop;

public class Quiz2 {
	public static void main(String[] args) {
		// 1부터 100사이의 정수를 반복하여
		// 홀수의 합과 짝수의 합을 각각 구하여 출력하세요

		int num = 100;
		int odd = 0, even = 0;

		for (int i = 1; i <= num; i++) {
			if(i % 2 == 0) {
				even += i;
			}
			else {
				odd += i;
			}
		}
		System.out.printf("홀수의 합 : %d\n", odd);
		System.out.printf("짝수의 합 : %d\n", even);
	}
}

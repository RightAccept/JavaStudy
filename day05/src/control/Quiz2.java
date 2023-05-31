package control;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 지하철 1구간 당 평균 이동시간이 4분이라고 가정한다
		 * 이동한 구간 수를 입력받아서, 걸린 시간을 출력하세요
		 * 단, 시간이 60분 이상이면
		 * 시간과 분을 구분하여 출력하고 시간이 60분 미만이면 분만 출력하세요
		 */
		Scanner sc = new Scanner(System.in);
		int move, time, hour, min;

		System.out.print("이동한 구간 수 입력 : ");
		move = sc.nextInt();
		
		time = move * 4;

		if (time >= 60) {
			hour = time / 60;
			min = time % 60;
			System.out.printf("%d구간 이동하는데 %d시간 %d분 소요", move, hour, min);
		}
		else {
			System.out.printf("%d구간 이동하는데 %d분 소요",move, time);
		}

		sc.close();
	}
}

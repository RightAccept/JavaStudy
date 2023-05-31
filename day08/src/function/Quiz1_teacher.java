package function;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Quiz1_teacher {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int[] arr = new int[3];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(15) + 1;
		}

		System.out.println(Arrays.toString(arr));

		// 3대의 엘리베이터가 있다
		// 사용자에게 현재 층수를 입력받아서 가장 가까운 엘리베이터가 움직이도록 출력하세요
		// 처음부터 순서대로, 엘리베이터의 이름을 A, B, C라고 하면
		// "%s 엘리베이터가 이동합니다" 라고 출력해야 합니다
		int currentFloor;

		System.out.print("현재 층 입력 : ");
		currentFloor = sc.nextInt();

		int min = 14;
		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			int diff = getAbsolute(arr[i] - currentFloor);
			if (min > diff) {
				min = diff;
				index = i;
			}
			System.out.print(diff + " ");
		}
		System.out.println();
		System.out.println((char) (index + 'A') + "엘리베이터가 이동합니다.");
		// 'A'의 아스키코드를 모르더라도, A + 0 = A, A + 1 = B, A + 2 = C 라는 것만 알면 간단하게 문자 출력이 가능하다

		char test = getNearElebatorName(arr, currentFloor);
		System.out.println("test : " + test);

		sc.close();
	} // end of main

	static char getNearElebatorName(int[] arr, int currentFloor) {
		char ele = 'A';
		int index = 0;
		int min = 14;
		// 1) 현재층과 각 엘리베이터의 차이 구하기
		for (int i = 0; i < arr.length; i++) {
			int diff = arr[i] - currentFloor;
			// 2) 차이에 절대값 처리하기(거리)
			if (diff < 0) {
				diff = -diff;
			}
			// 3) 거리 중 최소값을 찾아서 index 구하기
			if (min > diff) {
				min = diff;
				index = i;
			}
		}
		// 4) index를 ele에 더하고 반환하기
		ele += index;

		return ele;
	}

	static int getAbsolute(int num) {
		return num > 0 ? num : -num;
	}
}

package function;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Quiz1 {
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
		int floor;
		String ele;
		System.out.print("현재 층 수 입력 : ");
		floor = sc.nextInt();

		ele = closeele(floor, arr);

		System.out.printf("%s 엘리베이터가 이동합니다", ele);
		sc.close();
	} // end of main

	static String closeele(int floor, int[] arr) {
		String ch = "";
		int index = 0;
		int[] tmp = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int num = arr[i] - floor;
			if (num < 0) {
				num = -num;
			}
			tmp[i] = num;
		}

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < tmp.length; i++) {
			if (min > tmp[i]) {
				min = tmp[i];
				index = i;
			}
		}

		switch (index) {
		case 0:
			ch = "A";
			break;
		case 1:
			ch = "B";
			break;
		case 2:
			ch = "C";
			break;
		}

		return ch;

		// HashMap을 사용한 방법
//		HashMap<Integer, String> map = new HashMap<Integer, String>();
//		map.put(0, "A");
//		map.put(1, "B");
//		map.put(2, "C");
//		
//		return map.get(index);
	}
}

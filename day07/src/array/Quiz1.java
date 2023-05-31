package array;

import java.util.Arrays;
import java.util.Random;

public class Quiz1 {
	public static void main(String[] args) {

		Random ran = new Random();
		int size = 10;
		int range = 100;
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(range);
		}
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));

		// 1) arr의 값에서 홀수와 짝수가 각각 몇 개인지 파악하여 출력하세요
		// 2) oddArray와 evenArray를 생성하여 각각 홀수와 짝수를 담아서 출력하세요
		// 3) arr의 총합을 구하여 출력하세요

		// 1
		int oddcnt = 0, evencnt = 0;
		for (int num : arr) {
			if (num % 2 == 0) {
				evencnt++;
			} else {
				oddcnt++;
			}
		}
		System.out.printf("arr의 홀수의 개수 : %d\n", oddcnt);
		System.out.printf("arr의 짝수의 개수 : %d\n", evencnt);

		// 2
		int[] oddArray = new int[oddcnt];
		int[] evenArray = new int[evencnt];
		int evenIndex = 0;
		int oddIndex = 0;
		
		for (int num : arr) {
			if (num % 2 == 0) {
				evenArray[evenIndex] = num;
				evenIndex++;
			}
			else {
				oddArray[oddIndex] = num;
				oddIndex++;
			}
		}
		System.out.println("홀수 배열 출력 : " + Arrays.toString(oddArray));
		System.out.println("짝수 배열 출력 : " + Arrays.toString(evenArray));
		
		// 3
		int arrsum = 0;
		for(int num :arr) {
			arrsum += num;
		}
		System.out.println("arr의 총 합 : " + arrsum);
		
	}
}

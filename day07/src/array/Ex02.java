package array;

public class Ex02 {
	public static void main(String[] args) {
		
		int n1 = 5, n2 = 2, n3 = 4;
		int max;
		
		max = n1;
		if(max < n2) {
			max = n2;
		}
		if(max < n3) {
			max = n3;
		}
		System.out.println("max : " + max);
		
		int[] arr = { 17, 26, 33, 52, 46, 87, 69, 92, 73 };
		max = 0;
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("max : " + max);
		System.out.println();
		 
		// 1) arr의 값 중에서, 홀수이면서 가장 큰 값을 찾아서 출력하세요
		// 2) arr의 값 중에서, 짝수인 값의 합계를 구하여 출력하세요
		// 3) arr의 모든 값의 평균을 구하여 소수점 둘째자리까지 출력하세요
		
		// 1
		int oddmax = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0 && oddmax < arr[i]) {
				oddmax = arr[i];
			}
		}
		System.out.println("oddmax : " + oddmax);
		// 1.ex
		oddmax = 0;
		for(int num : arr) {
			if(num % 2 != 0 && oddmax < num) {
				oddmax = num;
			}
		}
		System.out.println("oddmax : " + oddmax);
		
		// 2
		int evensum = 0;
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] % 2 == 0) {
				evensum += arr[i];
			}
		}
		System.out.println("evensum : " + evensum);
		
		// 2.ex
		evensum = 0;
		for(int num : arr) {
			if(num % 2 == 0) {
				evensum += num;
			}
		}
		System.out.println("evensum : " + evensum);
		
		// 3
		int sum = 0;
		double average = 0.0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		average = (double)sum / arr.length;
		System.out.printf("sum : %d, average : %.2f\n", sum, average);
		
		// 3.ex
		sum = 0;
		average = 0;
		for(int num : arr) {
			sum += num;
		}
		average = sum / (double)arr.length;
		System.out.printf("sum : %d, average : %.2f\n", sum, average);
	}
}

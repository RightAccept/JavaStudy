package function;

public class Ex04 {
	static int getAbsoulte(int num) {
		if (num < 0) {
			num = -num;
		}
		return num;
//		return num > 0 ? num : -num;
	}

	static int getMinValue(int n1, int n2, int n3) {
		int Min = n1;
		if (Min > n2) {
			Min = n2;
		}
		if (Min > n3) {
			Min = n3;
		}
		return Min;
	}

	static int getMinValue(int[] arr) {
		int Min;
		Min = Integer.MAX_VALUE; 	// 정수 범위에서 최대값
		for (int i = 0; i < arr.length; i++) {
			if (Min > arr[i]) {
				Min = arr[i];
			}
		}
		return Min;
	}

	public static void main(String[] args) {
		// 1) 정수를 하나 전달받아서 절대값을 반환하는 함수
		int t1 = getAbsoulte(5 - 7);

		// 2) 세 정수를 전달받아서 최소값을 반환하는 함수
		int t2 = getMinValue(7, 2, 5);

		// 3) 길이가 3인 배열을 전달받아서 최소값을 반환하는 함수
		int[] arr = { 7, 2, 5 };
		int t3 = getMinValue(arr);

		System.out.println("t1 : " + t1);
		System.out.println("t2 : " + t2);
		System.out.println("t3 : " + t3);
	}
}

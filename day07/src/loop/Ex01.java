package loop;

public class Ex01 {
	// for : 일정한 횟수만큼 반복할 때 주로 사용한다
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) { 	// 0, 1, 2, 3, 4
		// 반복 변수 선언 및 초기화; 반복 조건; 반복 변수 증감
			System.out.println("Hello!!");	// 종속문
		}
		System.out.println();

		int cnt = 0;		// 반복 변수 선언 및 초기화
		while (cnt < 5) {	// 반복 조건
			System.out.println("java");		// 종속문
			cnt++;			// 반복 변수 증감
		}
		System.out.println();
	}
}

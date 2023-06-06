package loop;

public class Ex01 {
	public static void main(String[] args) {
		// 반복문 : 조건에 따라 종속문장을 반복하여 실행한다

		int num = 10;

		if (num < 20) {		// 조건이 참이면, 종속문장을 한 번만 실행한다
			num += 1;
			System.out.println("if) num : " + num);
		}

		while (num != 0) {	// 조건이 참이면, 종속문장을 실행하고
			num += 1;
			System.out.println("while) num : " + num);
			
			if(num == 10000) {
				break;
			}
		}	// 다시 조건절로 돌아가서 조건을 체크한다
		System.out.println("프로그램 종료!!");

	}
}

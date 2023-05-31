package function;

public class Quiz2 {
	// 문제 1과 2는 String.format() 사용
	// 1) 정거장 구간 수에 따른 걸린 시간을 문자열로 반환하기
	// (구간당 4분으로 계산하며, 60분을 초과하면 시간과 분으로 구분하여 반환하기)

	// 2) 놀이기구 이용 시간에 따른 요금을 문자열로 반환하기
	// 기본 30분까지는 3천원, 이후 10분당 500원의 추가 요금 발생
	// (천단위 구분기호를 찍어서 처리해야함)

	// 3) 두 정수를 전달받아서, 두 정수 사이의 모든 수의 합을 구하여 반환하기
	// (두 정수의 대소관계는 정해져있지 않음)

	// 1
	static String quiz1(int station) {
		String time = "";
		int num = station * 4;
		if (num >= 60) {
			time = String.format("%d시간 %d분", num / 60, num % 60);
		} else {
			time = String.format("%d분", num);
		}
		return time;
	}

	static String quiz2(int used) {
		String cost = "";
		int money = 3000;
		if (used <= 30) {
			cost = String.format("%,d원", money);
		} else {
			if (used % 10 != 0) {
				money = money + 500 * (((used - 30) / 10) + 1);
			} else {
				money = money + 500 * ((used - 30) / 10);
			}
		}
		cost = String.format("%,d원", money);
		return cost;
	}

	// 강사님 코드
	static String quiz2_techer(int used) {
		String cost = "";
		int money = 3000; // 기본요금 3천원
		if (used > 30) { // 30분을 초과하면
			money += ((used - 21) / 10) * 500; // 기본요금에 추가요금을 더함
		}
		cost = String.format("%,d원", money);
		return cost;
	}

	static int quiz3(int n1, int n2) {
		int sum = 0;
		if (n1 >= n2) {
			for (int i = n1; i >= n2; i--) {
				sum += i;
			}
		} else {
			for (int i = n1; i <= n2; i++) {
				sum += i;
			}
		}
		return sum;
	}

	// 강사님 코드
	static int quiz3_techer(int n1, int n2) {
		int answer = 0;
		// 먼저, 두 수의 대소관계에 따라 새로운 변수에 대입하거나 값을 바꾼다
		if (n1 > n2) {
			int tmp = n1;
			n1 = n2;
			n2 = tmp;
		}
		for (int i = n1; i <= n2; i++) {
			answer += i;
		}
		// 등차수열 사용
		answer = (n1 + n2) * (n2 - n1 + 1) / 2;
		return answer;
	}

	public static void main(String[] args) {
		String s1 = quiz1(12); // 48분
		String s2 = quiz1(16); // 1시간 4분

		String s3 = quiz2(25); // 3,000원
		String s4 = quiz2(40); // 3,500원
		String s5 = quiz2(41); // 4,000원

		int n1 = quiz3(1, 10); // 55
		int n2 = quiz3(10, 1); // 55

		System.out.println("quiz1(12) : " + s1);
		System.out.println("quiz1(16) : " + s2);
		System.out.println("quiz2(25) : " + s3);
		System.out.println("quiz2(40) : " + s4);
		System.out.println("quiz2(41) : " + s5);
		System.out.println("quiz3(1, 10) : " + n1);
		System.out.println("quiz3(10, 1) : " + n2);
	}
}

package loop;

public class Quiz3 {
	public static void main(String[] args) {
		/*
		 * 은행에 돈을 입금한다
		 * 첫날에는 10원, 둘째날에는 20원, 셋째날에는 40원
		 * 이런 식으로 전날의 두배를 준비하여 30일동안 입금한다
		 * 입금이 끝나면 은행에 예금된 총 금액은 얼마인지 계산하여 출력하세요
		 * 출력할 때 printf()의 서식을 활용하여 천단위 구분 콤마를 찍어주세요
		 */
		int day = 1;
		long money = 10;
		long total = 0;

		while(day <= 30) {
			System.out.printf("%d일에 입금한 금액 : %,d원\n", day, money);
			total += money;
			System.out.printf("%d일에 입금된 금액 : %,d원\n", day, total);
			money *= 2;
			System.out.println();
			day ++;
		}
		
//		for (int i = 1; i <= 30; i++) {
//			System.out.printf("%d일에 입금한 금액 : %,d원\n", i, money);
//			total += money;
//			System.out.printf("%d일에 입금된 금액 : %,d원\n", i, total);
//			money *= 2;
//			System.out.println();
//		}
		System.out.println();
		System.out.printf("30일 동안 입금된 금액 : %,d원", total);
	}
}

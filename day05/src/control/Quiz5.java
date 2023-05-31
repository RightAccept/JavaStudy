package control;

import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		/*
		 * 사탕 1개에 500원입니다
		 * 50개 이상 구매하면 전체의 8%를 할인하고
		 * 100개 이상 구매하면 전체의 12%를 할인합니다
		 * 구매 수량을 입력하여 결제할 금액을 계산하여 출력하세요
		 * (단, 각각의 할인율은 중복해서 적용할 수 없습니다)
		 */
		Scanner sc = new Scanner(System.in);
		int candy = 500, count, price;
		
		System.out.print("구매할 사탕 개수 : ");
		count = sc.nextInt();
		
		price = candy * count;
		
		if(count >= 100) {
			price *= 0.88;
		}
		else if(count >= 50) {
			price *= 0.92;
		}
		
		System.out.printf("구매한 사탕 개수 : %d개, 금액 : %,d원", count, price);
		
		sc.close();
	}
}

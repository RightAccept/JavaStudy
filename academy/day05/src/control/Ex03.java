package control;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;

		System.out.print("정수 입력 : ");
		num = sc.nextInt();

		if (num > 0) {
			System.out.println("양의 정수");
		} 
		else if (num < 0) {
			System.out.println("음의 정수");
		} 
		else {
			System.out.println("Zero");
		}

		sc.close();
	}
}

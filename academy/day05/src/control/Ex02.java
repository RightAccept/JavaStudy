package control;

import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {

		Random ran = new Random();
		int num;

		num = ran.nextInt() + 1;
		num %= 6;
		num += 1;

		if (num == 0) {
			System.out.println(num + " : 양의 정수");
		}
		// if (num != 0) {
		else {
			System.out.println(num + " : 음의 정수");
		}
	}
}

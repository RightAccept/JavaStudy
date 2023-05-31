package nestedLoop;

public class Ex05 {
	public static void main(String[] args) {

		int num = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%2d ", num++);
			}
			System.out.println();
		}
		System.out.println();

		num = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%2d ", num);
				num += 5;
			}
			System.out.println();
			num -= 24;
		}
		System.out.println();

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				int num2 = i + 1 + j * 5;
				System.out.printf("%2d ", num2);
			}
			System.out.println();
		}
	}
}

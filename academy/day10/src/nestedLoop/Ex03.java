package nestedLoop;

public class Ex03 {
	static void showPosition() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("[%d, %d]",i, j);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		showPosition();
		
		for(int i = 0; i < 5; i++) {		// 5줄
			for(int j = 0; j < 5; j++) {	// 5칸
				boolean flag = (i == j) || (i + j == 4);
				System.out.print(flag ? "* " : "  ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(int i = 0; i < 5; i++) {		// 5줄
			for(int j = 0; j < 5; j++) {	// 5칸
				boolean flag = (i == 2) || (j == 2);
				System.out.print(flag ? "* " : "  ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 0; i < 5; i++) {		// 5줄
			for(int j = 0; j < 5; j++) {	// 5칸
				boolean flag = (i == 0) || (j == 0) || (i == 4) || (j == 4);
				System.out.print(flag ? "* " : "  ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(int i = 0; i < 5; i++) {		// 5줄
			for(int j = 0; j < 5; j++) {	// 5칸
				boolean flag = i >= j;
				System.out.print(flag ? "* " : "  ");
			}
			System.out.println();
		}
		System.out.println();
	}
}

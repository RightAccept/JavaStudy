package nestedArray;

public class Ex03 {

	static void show(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		show(arr);

		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
			}
		}
		show(arr);
		
		num = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(i % 2 == 0) {
					arr[i][j] = num++;
				}
				else {							// j : 0, 1, 2, 3, 4
					arr[i][4 - j] = num++;		// x : 4, 3, 2, 1, 0
				}
			}
		}
		show(arr);
		
		num = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(i % 2 == 0) {
					arr[j][i] = num++;
				}
				else {
					arr[4-j][i] = num++;
					
				}
			}
		}
		show(arr);
		
		arr = new int[5][5];
		num = 1;
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i % 2 == 0) arr[j][i] = num++;
				else		   arr[4-j][i] = num++;
			}
		}
		
		show(arr);
	}
}

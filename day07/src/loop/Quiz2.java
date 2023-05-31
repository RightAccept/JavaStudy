package loop;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
	
		// 사용자에게 1 ~ 100 사이 정수를 입력받아서
		// 전체 길이에서 입력한 수치 이전은 #을 출력하고
		// 이후는 공백을 출력한다
		// 단, 항상 가운데에는 입력한 수치를 %형태로 출력해야 한다

		// [##########           20%                     ]
		// [#################### 50%                     ]
		// [#################### 67% ########            ]
		// [#################### 67% ##########          ]
		
		Scanner sc = new Scanner(System.in);
		int num;
		double per;

		System.out.print("% 입력 : ");
		num = sc.nextInt();

		per = num / 100.0;
 
		for (int i = 0; i < 50; i++) {
			if (i == 50 * 0.5) {
				System.out.printf(" %d %% ", num);
			}
			else if (i < 50 * per) {
				System.out.print("#");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();

		System.out.println("끝");
		sc.close();
	}
}
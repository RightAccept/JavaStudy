package input;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 이름(문자열), 나이(정수), 키(실수, cm), 몸무게(실수, kg)를 입력받습니다
		// 입력받은 값에서 체질량지수(BMI)를 구합니다

		// bmi = 몸무게(kg) / 키(m) * 키(m)
		// ~ 18.5 저체중
		// 18.5 ~ 23 정상
		// 23 ~ 25 과체중
		// 25 ~ 비만

		// 이름과 나이, BMI지수를 화면에 출력합니다
		// 단, bmi지수는 소수점 이하 둘째자리까지 출력하면 됩니다
		// 아래로 코드 작성

		String name;
		int age;
		double height, weight, bmi;
		String bmiResult;

		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		age = Integer.parseInt(sc.nextLine());
		System.out.print("키를 입력하세요 : ");
		height = Double.parseDouble(sc.nextLine());
		System.out.print("몸무게를 입력하세요 : ");
		weight = Double.parseDouble(sc.nextLine());

		bmi = weight / ((height / 100) * (height / 100));
		
		if(bmi > 25) bmiResult = "비만";
		else if (bmi > 23) bmiResult = "과체중";
		else if (bmi > 18.5) bmiResult = "정상";
		else bmiResult = "저체중";
		
		System.out.printf("%s(%d)님\n", name, age, bmi);
		System.out.printf("키 : %.1fcm, 몸무게 : %.1fkg\n", height, weight);
		System.out.printf("bmi 지수 : %.2f\n",bmi);
		System.out.printf("%s입니다.\n",bmiResult);

		sc.close();
	}
}

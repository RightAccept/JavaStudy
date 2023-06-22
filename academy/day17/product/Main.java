package product;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Handler handler = new Handler();
		Product tmp = null; // handler에 Product 객체를 전달하기 위해 임시 객체를 생성하기 위한 용도
		Product[] arr = null;
		int menu;
		int row;
		String name;
		Scanner sc = new Scanner(System.in);

		// 더미 데이터 추가 코드
		handler.insert(new Food("월드콘", 2000, "2023-12-08"));
		handler.insert(new Food("콘칩", 1500, "2024012-08"));
		handler.insert(new IndustrialProduct("KF94 마스크(검정)", 1500, "Korea"));
		handler.insert(new IndustrialProduct("KF94 마스크(흰색)", 1500, "Korea"));
		handler.insert(new IndustrialProduct("에너자이저 건전지 AA x6", 4800, "China"));

		while (true) {
			System.out.println("1. 전체 목록");
			System.out.println("2. 추가");
			System.out.println("3. 검색");
			System.out.println("4. 삭제");
			System.out.println("5. 정렬");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1: // 전체 목록(Handler에서 배열을 받아와서 반복문으로 출력)
				arr = handler.selectAll();
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] != null) {
						System.out.println((i + 1) + " : " + arr[i]);
					}
				}
				break;
				
			case 2: // 추가(입력받은 데이터를 객체화해서 Handler에게 전달)
				System.out.println("상품유형을 선택하세요");
				System.out.print("1. 식품, 2. 공산품 : ");
				menu = Integer.parseInt(sc.nextLine());
				if (menu == 1)
					tmp = makeFood(sc);
				else if (menu == 2)
					tmp = makeIndustProduct(sc);
				else
					tmp = null;
				row = handler.insert(tmp);
				System.out.println(row != 0 ? "추가 성공" : "추가 실패");
				break;
				
			case 3: // 검색(입력받은 검색어를 전달하여 조건에 맞는 배열을 받아오기)
				System.out.print("검색할 제품명 : ");
				name = sc.nextLine();
				arr = handler.search(name);
				for (int i = 0; i < arr.length; i++) {
					Product p = arr[i];
					if (p != null) {
						System.out.println(p);
					}
				}
				break;
				
			case 4: // 삭제(입력받은 이름으로 일치하는 항목을 삭제하기)
				System.out.print("삭제할 제품명 : ");
				name = sc.nextLine();
				row = handler.delete(name);
				System.out.println(row != 0 ? "삭제 성공" : "삭제 실패");
				break;
				
			case 5: // 정렬(상품 이름 순으로 정렬하기)
				System.out.print("정렬 방법 1~4 입력 : ");
				menu = Integer.parseInt(sc.nextLine());
				arr = handler.sort(menu - 1);
				for (int i = 0; i<arr.length; i++) {
					if(arr[i] != null) {
						System.out.println(i+1 + " : " + arr[i]);
					}
				}
				break;
				
			case 0: // 종료
				sc.close();
				System.out.println("프로그램 종료");
				return; // main함수의 종료
				
			default:
				System.err.println("메뉴를 잘못 선택했습니다");
			}
			System.out.println();
		}
	}

	private static Product makeIndustProduct(Scanner sc) {
		String name;
		int price;
		String madeIn;

		System.out.print("제품명 : ");
		name = sc.nextLine();
		System.out.print("가격 : ");
		price = Integer.parseInt(sc.nextLine());
		System.out.print("제조국 : ");
		madeIn = sc.nextLine();

		IndustrialProduct p = new IndustrialProduct(name, price, madeIn);
		return p;
	}

	private static Product makeFood(Scanner sc) {
		String name;
		int price;
		String expireDate;

		System.out.print("제품명 : ");
		name = sc.nextLine();
		System.out.print("가격 : ");
		price = Integer.parseInt(sc.nextLine());
		System.out.print("유통기한 : ");
		expireDate = sc.nextLine();

		Food food = new Food(name, price, expireDate);
		return food;
	}
}

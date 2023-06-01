package book;

import java.util.Scanner;

/*
 * yes24에서 10개의 도서를 골라서 Handler 클래스를 통해 Book 클래스를 관리하세요
 * 전체목록, 추가, 검색(검색어를 포함하는 경우), 삭제의 기능을 포함해야 합니다.
 */

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu; // switch문을 위한 변수
		String keyword; // 검색 결과를 받을 변수
		int status; // 추가, 삭제 여부를 확인할 변수
		Book[] arr; // 목록과 검색 결과를 받아올 Book 배열
		Book tmp; // Book 객체를 handler에 넣어주기 위한 임시 객체
		String name, writer, date; // Book 객체 생성용 임시 제목, 저자, 출판일 변수
		double grade; // Book 객체 생성용 임시 평점 변수
		int price; // Book 객체 생성용 임시 가격 변수
		Handler handler = new Handler(); // Handler 객체 생성
		// 직접 입력하기에는 너무 길어서 테스트용 객체 생성
		Book bo1 = new Book("세상의 마지막 기차역", "무라세 다케시", "2022년 05월", 9.5, 12600);
		Book bo2 = new Book("모성", "미나토 가나에", "2023년 06월", 9.5, 15120);
		Book bo3 = new Book("요괴어사", "설민석", "2023년 04월", 10.0, 16200);
		Book bo4 = new Book("달러구트 꿈 백화점", "이미예", "2020년 07월", 9.2, 12420);

		while (true) {
			System.out.println("메뉴 선택");
			System.out.println("1. 전체 목록");
			System.out.println("2. 도서 추가");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 삭제");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1: // 전체 목록
				arr = handler.getArray();	// handler의 배열에 저장되있는 정보를 .getArray() 메서드를 사용해 받아온다
				for (int i = 0; i < arr.length; i++) {	// 받아온 배열의 길이만큼 반복
					if (arr[i] != null) {	// 받아온 배열의 i번째가 null이 아니면
						arr[i].show();	// 출력한다
					}
				}
				break;

			case 2: // 도서 추가
//				System.out.print("도서 제목 : ");
//				name = sc.nextLine();	// 제목을 받아온다
//				System.out.print("저자 제목 : ");
//				writer = sc.nextLine();	// 저자를 받아온다
//				System.out.print("출판일 제목 : ");
//				date = sc.nextLine();	// 출판일을 받아온다
//				System.out.print("평점 입력 : ");
//				grade = Double.parseDouble(sc.nextLine());	// 평점을 받아온다
//				System.out.println("가격 입력 : ");
//				price = Integer.parseInt(sc.nextLine());	// 가격을 받아온다
//				
//				tmp = new Book(name, writer, date, grade, price);	// 받아온 정보를 이용하여 book객체 tmp 생성
//				status = handler.add(tmp);	// handler 클래스의 add 메서드를 사용하여 tmp객체를 handler에 넣고, 결과를 받아온다
				status = handler.add(bo1);
				status = handler.add(bo2);
				status = handler.add(bo3);
				status = handler.add(bo4);
				System.out.println(status != 0 ? "추가 성공" : "추가 실패");
				break;

			case 3: // 도서 검색
				System.out.println("검색 기준 선택");
				System.out.println("1. 제목, 저자");
				System.out.println("2. 평점");
				System.out.println("3. 가격");
				System.out.print("기준 선택 >>> ");
				menu = Integer.parseInt(sc.nextLine());
				if (menu == 1) {
					System.out.print("검색할 내용 : ");
					keyword = sc.nextLine();
					arr = handler.search(keyword);
					for (int i = 0; i < arr.length; i++) {
						arr[i].show();
					}
					break;
				}
				if (menu == 2) {
					System.out.print("입력한 평점 이상 검색 : ");
					grade = Double.parseDouble(sc.nextLine());
					arr = handler.search(grade);
					for (int i = 0; i < arr.length; i++) {
						arr[i].show();
					}
					break;
				}
				if (menu == 3) {
					System.out.print("가격 입력 : ");
					price = Integer.parseInt(sc.nextLine());
					System.out.println("입력 가격");
					System.out.print("이상 : 1, 이하 : 2 >>> ");
					menu = Integer.parseInt(sc.nextLine());
					arr = handler.search(price, menu);
					for (int i = 0; i < arr.length; i++) {
						arr[i].show();
					}
					break;
				}
				

			case 4: // 도서 삭제
				System.out.println("삭제 기준 선택");
				System.out.println("1. 제목");
				System.out.println("2. 평점");
				System.out.print("기준 선택 >>> ");
				menu = Integer.parseInt(sc.nextLine());
				if (menu == 1) {
					System.out.print("삭제할 도서 제목 : ");
					keyword = sc.nextLine();
					status = handler.delete(keyword);
					System.out.println(status != 0 ? "삭제 성공" : "삭제 실패");
					break;
				}
				if (menu == 2) {
					System.out.print("입력한 평점 이하 삭제 : ");
					grade = Double.parseDouble(sc.nextLine());
					status = handler.delete(grade);
					System.out.println(status != 0 ? "삭제 성공" : "삭제 실패");
					break;
				}

			case 0: // 종료
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				return;

			default: // 다른 숫자
				System.out.println("잘못된 메뉴 선택입니다.");
			} // end of switch
			System.out.println();
		} // end of while
	} // end of main
} // end of class

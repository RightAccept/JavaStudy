package student;

import java.util.Scanner;

// 사용자의 입력을 받아서 목록/추가/삭제/검색 기능을 수행한다

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // 키보드 입력
		Handler handler = new Handler(); // 데이터 관리 및 기능 수행
		int menu; // 사용자가 입력한 메뉴 번호
		Student tmp = null; // 관리에 필요한 학생 임시 변수
		String keyword; // 검색어
		String name; // 생성 시 필요한 이름
		int kor, eng, math; // 생성 시 필요한 과목 점수
		Student[] arr = null;
		int row; // 추가 및 삭제의 결과를 받기 위한 변수

		while (true) {
			System.out.println("1. 전체목록");
			System.out.println("2. 추가");
			System.out.println("3. 검색");
			System.out.println("4. 상세 검색");
			System.out.println("5. 삭제");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1: // 전체목록
				arr = handler.getArray();
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] != null) {
						arr[i].show();
					}
				}
				break; // break switch 1

			case 2: // 추가
				System.out.print("이름 입력 : ");
				name = sc.nextLine();

				System.out.print("국어 점수 입력 : ");
				kor = Integer.parseInt(sc.nextLine());

				System.out.print("영어 점수 입력 : ");
				eng = Integer.parseInt(sc.nextLine());

				System.out.print("수학 점수 입력 : ");
				math = Integer.parseInt(sc.nextLine());
				
				while(kor > 100 || kor < 0) {
					System.out.print("국어 점수를 다시 입력해 주세요 : ");
					kor = Integer.parseInt(sc.nextLine());
				}
				while(eng > 100 || eng < 0) {
					System.out.print("영어 점수를 다시 입력해 주세요 : ");
					eng = Integer.parseInt(sc.nextLine());
				}
				while(math > 100 || math < 0) {
					System.out.print("수학 점수를 다시 입력해 주세요 : ");
					math = Integer.parseInt(sc.nextLine());
				}

				tmp = new Student(name, kor, eng, math);
				row = handler.add(tmp);
				System.out.println(row != 0 ? "추가 성공" : "추가 실패");
				break;

			case 3: // 검색
				System.out.print("이름으로 검색 : ");
				keyword = sc.nextLine();

				arr = handler.search(keyword);
				for (int i = 0; i < arr.length; i++) {
					arr[i].show();
				}
				break;

			case 4: // 상세 검색
				System.out.print("이름으로 상세 검색 : ");
				keyword = sc.nextLine();

				handler.searchdetail(keyword);
				break;

			case 5: // 삭제
				System.out.print("삭제할 학생 입력 : ");
				name = sc.nextLine();

				row = handler.delete(name);
				System.out.println(row != 0 ? "삭제 성공" : "삭제 실패");
				break;

			case 0: // 종료
				System.out.println("프로그램 종료");
				sc.close();
				return;
			}
			System.out.println();
		} // end of while
	} // end of main
} // end of class
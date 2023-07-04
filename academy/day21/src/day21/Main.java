package day21;

import java.util.List;
import java.util.Scanner;

// 저장, 전체목록, 추가, 검색, 삭제
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Handler handler = new Handler();
		handler.load(); // 특정 파일이름의 데이터를 리스트에 불러오기
//		List<PhoneBookInfo> list = handler.select();
		List<PhoneBookInfo> list;
		int menu = -1;
		PhoneBookInfo tmp;
		int row;
		String search;

		while (true) {
			System.out.println("0. 저장");
			System.out.println("1. 전체목록");
			System.out.println("2. 추가");
			System.out.println("3. 검색");
			System.out.println("4. 삭제");
			System.out.println("9. 종료");
			System.out.print("선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 0: // 저장(추가한 리스트의 내용을 파일에 넣기)
				row = handler.save();
				System.out.println(row == 1 ? "저장 성공" : "저장 실패");
				System.out.println();
				break;
			case 1: // 전체목록
				list = handler.select();
				for (PhoneBookInfo info : list) {
					System.out.println(info);
				}
				System.out.println();
				break;
			case 2: // 추가(핸들러의 리스트에 내용 넣기)
				tmp = create(sc);
				row = handler.append(tmp);
				System.out.println(row == 1 ? "추가 성공" : "추가 실패");
				System.out.println();
				break;
			case 3: // 검색
				System.out.print("검색할 이름을 입력하세요 : ");
				search = sc.nextLine();
				tmp = handler.search(search);
				if (tmp != null) {
					System.out.println(tmp);
				} else {
					System.out.println("저장되지 않은 사람입니다");
				}
				System.out.println();
				break;
			case 4: // 삭제
				System.out.print("삭제할 이름을 입력하세요 : ");
				search = sc.nextLine();
				row = handler.delete(search);
				System.out.println(row == 1 ? "삭제 성공" : "삭제 실패");
				System.out.println();
				break;
			case 9: // 종료
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				return;
			default:
				System.err.println("잘못된 입력입니다.");
			}
		}
	}

	private static PhoneBookInfo create(Scanner sc) {
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("전화번호를 입력하세요 : ");
		String pnum = sc.nextLine();

		return new PhoneBookInfo(name, age, pnum);
	}
}

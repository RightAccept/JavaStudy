package book;

/*
 * 우선적으로 생성할 함수는 전체목록, 추가, 검색(검색어를 포함하는 경우), 삭제
 */

public class Handler {
	// book 객체를 담을 Book 배열 생성. 배열의 크기는 10
	private Book[] arr = new Book[10];

	public int add(Book book) { // 추가
		int status = 0; // 추가 성공 여부를 확인할 int 변수
		for (int i = 0; i < arr.length; i++) { // 반복 횟수 지정
			if (arr[i] == null) { // 넣을 자리 탐색, 덮어쓰지 않도록 현재 자리가 null일 때
				arr[i] = book; // 현재 자리에 book을 넣어라
				status = 1; // 성공했다는 뜻에서 status에 1을 넣어라
				break; // for문 빠져나가기
			}
		}
		return status; // status를 반환하면서 함수를 종료해라. 성공했으면 1, 실패했으면 0. 여기서 실패는 빈 자리가 없을 때
	}

	public Book[] getArray() { // 목록
		return arr;
	}

	public int delete(String keyword) { // (이름 기준)삭제
		int status = 0; // 삭제 성공 여부를 확인할 int 변수
		for (int i = 0; i < arr.length; i++) { // arr의 길이만큼 반복을 돌리면서
			if (arr[i] != null && arr[i].getName().equals(keyword)) {
				// arr[i]가 null이 아닐 때 arr[i]에서 이름을 받아와서 keyword와 비교해라
				// null이 아닐 때를 추가하지 않으면, null에서 이름을 받아오려고 하기 때문에 에러뜸
				arr[i] = null; // 비교해서 이름이 같다면, 그 자리를 비워라
				status = 1; // 성공했다는 의미로 status에 1을 넣어라
//					break;	// 반복을 빠져나간다. 주석해 놓은 이유는 같은 이름의 책이 있을 때 하나만 지우지 않고 다 지우기 위해서
			}
		}
		return status; // 성공여부 반환
	}

	public int delete(double keyword) { // (평점 기준)삭제
		int status = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null && arr[i].getGrade() <= keyword) {
				// arr[i]가 null이 아닐 때, arr[i]의 grade가 keyword 이하면
				arr[i] = null; // 그 자리를 비워라
				status = 1;
			}
		}
		return status;
	}

	public Book[] search(String keyword) { // (이름 혹은 저자로)검색
		Book[] result = null; // 검색 결과를 담을 Book 배열 생성
		int count = 0; // result 배열의 길이를 지정할 count 변수

		for (int i = 0; i < arr.length; i++) { // arr의 전체 길이에서
			if (arr[i] != null && (arr[i].getName().equals(keyword) || arr[i].getWriter().equals(keyword))) {
				// arr[i]가 null이 아닐 때, 이름이 일치하거나 저자가 일치하는 것을 발견하면
				count++;
				// count를 증가시켜라. 아직 result 변수가 참조하는 배열이 없기 때문에, 배열 생성하기 위해서 count만 증가
			}
		}
		result = new Book[count]; // 위의 for문에서 일치한 개수만큼 result 배열 생성
		count = 0; // 배열을 생성했으면 result의 인덱스를 지정하기 위해 count를 초기화한다.
		for (int i = 0; i < arr.length; i++) { // arr의 길이만큼 반복하면서
			if (arr[i] != null && (arr[i].getName().equals(keyword) || arr[i].getWriter().equals(keyword))) {
				// arr[i]가 null이 아니면서, 이름이 일치하거나 저자가 일차하는 것을 발견하면
				result[count++] = arr[i]; // result의 count초기값 0에 arr[i]의 값을 넣고, count를 증가시켜라
//				result[i] = arr[i];	// 생성한 result배열의 [i]번째에 넣어라 // 잘못 생각함. i번째에 넣어라로 하면 outofbound뜰거임
			}
		}
		return result; // 값을 넣은 배열 result를 반환해라
	}

	public Book[] search(double keyword) { // (평점으로)검색
		Book[] result = null; // 검색 결과를 저장할 Book 배열. 현재 참조 x
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null && arr[i].getGrade() >= keyword) {
				// arr[i]가 null이 아닐 때, arr[i]의 평점이 keyword 이상이면
				count++; // result 배열을 생성할 인덱스를 증가
			}
		}
		result = new Book[count];
		count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null && arr[i].getGrade() >= keyword) {
				result[count++] = arr[i];
			}
		}
		return result;
	}

	public Book[] search(double keyword, int menu) { // (가격 기준, 이상 혹은 이하)검색
		Book[] result = null;
		int count = 0;
		boolean flag = false;
		switch (menu) {
		case 1:
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != null && arr[i].getPrice() >= keyword) {
					count++;
					flag = true;
				}
			}
			break;
		case 2:
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != null && arr[i].getPrice() <= keyword) {
					count++;
				}
			}
			break;
		}
		result = new Book[count];
		count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (flag) {
				if (arr[i] != null && arr[i].getPrice() >= keyword) {
					result[count++] = arr[i];
				}
			} else {
				if (arr[i] != null && arr[i].getPrice() <= keyword) {
					result[count++] = arr[i];
				}
			}
		}
		return result;
	}
}

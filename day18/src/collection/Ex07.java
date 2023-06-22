package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		Random ran = new Random();
		HashSet<Integer> set = new HashSet<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();

		// 1 ~ 45 사이의 중복없는 숫자 6개를 뽑아서 오름차순으로 정렬하여 한 줄에 출력하세요
		while (set.size() != 6) {
			int num = ran.nextInt(45) + 1;
			set.add(num);
		}
		
		// 향상된 for문 사용
//		for (int num : set) {
//			list.add(num);
//		}
		
		// forEach 메서드 사용
//		set.forEach(num -> list.add(num));
		
		// 생성자 매개변수에 전달하기
		// 컬렉션은 제네릭 타입이 같다면, 생성자 매개변수로 넣어줄 수 있다
		list = new ArrayList<Integer>(set);
		
		list.sort(null);
		System.out.println(list);
	}
}

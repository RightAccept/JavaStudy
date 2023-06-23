package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Quiz1 {
	public static void main(String[] args) throws ParseException {
		// 매월 2주, 4주 일요일은 대형마트 휴무일입니다
		// 2023년 대형마트 휴무일은 총 며칠인지 계산하여 출력하세요

		// 각 휴무 날짜를 반복문을 이용하여 출력해보세요
		// 서식은 자유롭게 작성하되, 연월일과 요일은 반드시 포함되어야 합니다
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd E");
		int count = 0;	// 며칠 쉬는지 카운트
		int tmp = 1;	// 달이 바뀌는 것을 확인할 임시 변수
		int sun = 0;	// 달에 일요일이 몇 번 나오는지 확인할 변수
		String begin = "2023-01-01";
		String end = "2023-12-31";

		Date d1 = sdf.parse(begin);
		Date d2 = sdf.parse(end);

		for (long i = d1.getTime(); i <= d2.getTime(); i += 1000 * 60 * 60 * 24) {
			Date t = new Date(i);
			String s = sdf2.format(t);
			int month = Integer.parseInt(s.substring(5, 7));	// 월을 저장

			if (tmp != month) {	// 만약 달이 바뀌면
				tmp = month;	// 바뀐 달을 저장하고
				sun = 0;		// 일요일 개수 초기화
				System.out.println();
			}
			if (s.contains("일")) {	// 현재 확인 중인 날짜에 "일"이 포함되어 있다면
				sun++;				// 일요일 개수를 증가하고
				if (sun % 2 == 0) {	// 만약 일요일 개수가 짝수라면
					System.out.println(s + " " + sun);	// 해당 날짜 출력
					count++;		// 휴무일 개수 증가
				}
			}
		}
		System.out.println();
		System.out.printf("대형마트 총 휴무일은 %d일", count);
	}
}

package book;

/*
 * 도서 관리 프로그램에서 다룰 도서를 나타내는 클래스
 * 도서 제목	(문자열)
 * 저자		(문자열)
 * 출판일자	(문자열)
 * 평점		(실수, 소수점 첫째자리까지)
 * 가격		(정수, 출력 시 천단위 구분 기호를 포함)
 */

public class Book {
	private String name;	// 도서 제목
	private String writer;	// 저자
	private String date;	// 출판일자
	private double grade;	// 평점
	private int price;		// 가격
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public Book(String name, String writer, String date, double grade, int price){
		this.name = name;
		this.writer = writer;
		this.date = date;
		this.grade = grade;
		this.price = price;
	}
	
	public void show() {
		System.out.printf("제목 : %s\n", name);
		System.out.printf("저자 : %s, 출판일자 : %s\n", writer, date);
		System.out.printf("평점 : %.1f점, 가격 : %,d원\n", grade, price);
		System.out.println();
	}
}

package day17;

abstract class Student{		// 공통 속성과 기능을 묶어서 저장한 클래스(슈퍼클래스)
	private String name;
	private int sum;
	private double avg;
	
	public Student(String name, int... scores) {	// int... <- 가변 배열, 매개변수로 오는 변수의 개수가 호출마다 다를 때
		this.name = name;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		avg = (double)sum / scores.length;
	}
	
	// 모든 학생 객체는 출력 시 자신의 정보를 문자열로 변환해야 한다
	public abstract String toString();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
}

class HistoryStudent extends Student {
	private int kor, eng, mat, his;	// 서브클래스의 멤버필드
	
	public HistoryStudent(String name, int kor, int eng, int mat, int his) {
		super(name, kor, eng, mat, his);
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.his = his;
	}
	
	@Override
	public String toString() {
		String format = "%s] 국어 %3d, 영어 %3d, 수학 %3d, 역사 %3d (%3d / %.2f)\n";
		Object[] args = { getName(), kor, eng, mat, his, getSum(), getAvg() };
		return String.format(format, args);
	}
}

class ComputerScienceStudent extends Student {
	private int kor, eng, mat, clang, java;

	public ComputerScienceStudent(String name, int kor, int eng, int mat, int clang, int java) {
		super(name, kor, eng, mat, clang, java);
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.clang = clang;
		this.java = java;
	}
	
	@Override
	public String toString() {
		String format = "%s] 국어 %3d, 영어 %3d, 수학 %3d, C언어 %3d, 자바 %3d (%3d / %.2f)\n";
		Object[] args = { getName(), kor, eng, mat, clang, java, getSum(), getAvg() };
		return String.format(format, args);
	}
	
}

public class Ex02 {
	public static void main(String[] args) {
		HistoryStudent ob1 = new HistoryStudent("홍길동", 84, 94, 27, 86);
		System.out.println(ob1);
		
		ComputerScienceStudent ob2 = new ComputerScienceStudent("짱구", 85, 100, 87, 99, 96);
		System.out.println(ob2);
		
		Student[] arr = { ob1, ob2 };
		
		for(Student s : arr) {
			System.out.println(s);
		}
	}
}

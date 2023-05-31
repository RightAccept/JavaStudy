package oop;

class Human {
	// 멤버 필드 : 객체가 가지는 내부 변수
	// 사람의 이름(문자열)과 나이(정수), 키와 체중(실수)를 변수로 선언하세요
	String name;
	int age;
	double height;
	double weight;
	
	// 멤버 메서드 : 객체가 호출할 수 있는 내부 함수
	// 1) (문자열, 정수, 실수, 실수)를 전달받아서 멤버필드에 저장하는 함수
	void setData(String name, int age, double height, double weight) {
		this.name = name;	// 지역변수와 멤버필드의 이름이 같으면
		this.age = age;		// this를 이용하여 구분할 수 있다
		this.height = height;	// this는 클래스에 의해 생성된 객체 자신을 가리키는 변수
		this.weight = weight;
	}
	
	// 2) 저장된 값을 한 줄씩 출력하고 마지막에 한 줄 띄우는 함수
	void show() {
		System.out.printf("이름 : %s, 나이 : %d살, 키 : %.1fcm, 몸무게 : %.1fkg", name, age, height, weight);
		System.out.println();
	}
	
	// 3) 객체를 생성하면서 값을 할당하는 생성자를 작성한다
	// 생성자는 클래스의 이름과 같으며 반환형을 지정하지 않는 특수한 함수이다
	// 생성자를 작성하지 않으면, 컴파일시에 기본 생성자를 자동으로 만들어준다
	// 생성자를 작성했다면, 자동으로 생성자를 만들어주지 않는다
	Human (String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// 직접 생성자를 작성했다면 기본 생성자가 자동작성되지 않기 때문에
	// 별도로 작성해주어야 한다
	Human() {}
}

public class Ex05 {
//	public static void main(String[] args) {
//		// 서로 다른 Human 객체 3개를 생성하고, 각각 다른값을 넣어주세요
//		Human person1 = new Human();
//		Human person2 = new Human();
//		Human person3 = new Human();
//		
//		person1.setData("홍길동", 25, 180.5, 78.2);
//		person2.setData("아이유", 30, 161.8, 40.2);
//		person3.setData("김진우", 29, 170.2, 64);
//		// 배열로 묶어서 구성하세요
//		Human[] arr = { person1, person2, person3 };
//		// 반복문을 이용하여 여러 명의 데이터를 출력하세요
//		for(int i = 0; i < arr.length; i++) {
//			arr[i].show();
//		}
//	}
	public static void main(String[] args) {
		Human ob1 = new Human();	// 먼저 생성하고
		ob1.name = "이지은";			// 각각의 멤버 필드에
		ob1.age = 31;				// 맞는 값을 순서대로 대입한다
		ob1.height = 164.9;
		ob1.weight = 49.2;
		
		Human ob2 = new Human();	// 객체 생성하고
		ob2.setData("홍길동", 25, 180.5, 78.2);	// 한번에 4개의 값을 세팅한다
		
		// 객체 생성과 동시에 값을 지정한다
		Human ob3 = new Human("김진우", 29, 170.2, 64);
		
		Human[] arr = { ob1, ob2, ob3 };
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].show();
		}
	}
}

package phone_teacher;

public class Main_teacher {
	public static void main(String[] args) {
		Phone_teacher p1 = new Phone_teacher("김도기");
		Phone_teacher p2 = new Phone_teacher("천지훈");
		
		p2.sendMessage(p1, "저기요 동전 좀 빌릴 수 있을까요?");
		
		p1.sendMessage(p2, "근데 혹시 누구시죠?");
	}
}

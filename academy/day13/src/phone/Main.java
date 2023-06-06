package phone;

/*
 * 휴대폰 클래스를 생성하여 문자메세지를 주고받으세요
 * 스캐너를 통해 문자를 입력하고, A에서 B로 전송하고, B에서 착신 후 답장을 보내세요.
 * 보낸 사람이 누구인지 확인할 수 있어야하고, 받는 사람이 누구인지 확인할 수 있어야합니다.
 */

public class Main {
	public static void main(String[] args) {
		Phone ob1 = new Phone();
		Phone ob2 = new Phone("홍길동", "01012345678");
		
		ob1.makePhone("김지훈", "01098765432");
		
		ob1.send(ob2);
		
		ob2.showmsg(ob1);
		
//		ob2.deletemsg(ob1);
	}
}

package phone;

import java.util.Scanner;

public class Phone {
	private String number;	// 휴대폰 번호
	private String user;	// 사용자 이름
	private String[] msgbox;	// 전송받은 메세지를 저장할 배열
	private int boxindex = 0;	// msgbox용 인덱스

	Phone() {
		System.out.println("휴대폰을 등록해주세요");
	}

	Phone(String user, String number) {
		this.user = user;
		this.number = number;
		System.out.printf("%s님 %s로 개통되셨습니다\n", user, number);
	}

	void makePhone(String name, String number) {
		this.user = name;
		this.number = number;
		System.out.printf("%s님 %s로 개통되셨습니다\n", name, number);
	}

	void send(Phone recipient) {
		Scanner sc = new Scanner(System.in);
		String msg = "";
		while (true) {	// 무한 반복으로 돌리고
			System.out.printf("메세지를 입력하세요 : ");
			msg = sc.nextLine();
			if(msg.isEmpty()) {	// 메세지를 입력하지 않고 엔터를 누르면 전송 종료
				sc.close();
				System.out.println();
				break;
			}
			System.out.printf("%s(%s)에게 발신 : %s\n", recipient.user, recipient.number, msg);
			System.out.println();
			recipient.recive(this, msg);
		}
	}

	void recive(Phone sender, String msg) {
		System.out.println("메시지 도착");
		System.out.printf("%s(%s)\n", sender.user, sender.number, msg);
		System.out.printf("%s\n", msg);
		this.boxindex++;	// msgbox를 생성하기 위한 index용 정수
		String[] tmp = new String[boxindex];
		for (int i = 0; i < boxindex - 1; i++) {
			tmp[i] = msgbox[i];
		}
		this.msgbox = new String[boxindex];
		msgbox = tmp;
		this.msgbox[boxindex - 1] = msg;

	}

	void showmsg(Phone other) {
		System.out.printf("%s(%s)\n", other.user, other.number);
		for (int i = boxindex - 1; i >= 0; i--) {
			System.out.printf("%d : %s\n", i + 1, msgbox[i]);
		}
		System.out.println();
	}

//	void deletemsg(Phone other) {
//		showmsg(other);
//		Scanner sc = new Scanner(System.in);
//		int delete;
//		System.out.print("삭제할 메세지를 선택하세요 : ");
//		delete = Integer.parseInt(sc.nextLine());
//		boxindex--;
//		String[] tmp = new String[boxindex];
//		for (int i = 0; i < msgbox.length; i++) {
//			if (i == delete) {
//				continue;
//			}
//			tmp[i] = msgbox[i];
//		}
//		this.msgbox = new String[boxindex];
//		msgbox = tmp;
//		sc.close();
//	}
}

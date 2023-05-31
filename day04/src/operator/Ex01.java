package operator;

public class Ex01 {
	public static void main(String[] args) {
		// 논리 연산자 : &&, ||, !
		// boolean 타입의 값을 연산한다
		// && : and, 서로 다른 두 조건이 모두 true이면 true를 나타낸다
		// || : or, 서로 다른 두 조건 중 하나라도 true이면 true를 나타낸다
		// ! : not, 단항 연산자이며 true는 false로 바꾸고, false는 true로 바꾼다
		
		boolean bo1 = true;
		boolean bo2 = false;
		
		System.out.println("bo1 && bo2 : " + (bo1 && bo2));
		System.out.println("bo1 && true : " + (bo1 && true));
		System.out.println("bo1 || bo2 : " + (bo1 || bo2));
		System.out.println("false || bo2 : " + (false || bo2));
		System.out.println();
		
		// 서로 다른 두 조건을 동시에 만족한다면 true
		// 성별이 남성이고, 나이가 20세 이상인 경우에만 true
		String gender1 = "남성";
		String gender2 = "여성";
		int age1 = 25;
		int age2 = 17;
		
		boolean flag1 = gender1.equals("남성") && age1 >= 20;
		boolean flag2 = gender2.equals("남성") && age1 >= 20;
		boolean flag3 = gender1.equals("남성") && age2 >= 20;
		
		System.out.println("flag1 : " + flag1);
		System.out.println("flag2 : " + flag2);
		System.out.println("flag3 : " + flag3);
		System.out.println();
		
		// 서로 다른 두 조건 중 하나라도 만족하면 true
		// 현금이 5천원 이상있거나, 카드를 가지고 있다면 true
		int cash = 1000;
		boolean hasCard = true;
		
		boolean taxi = cash >= 5000 || hasCard == true;
		System.out.println("taxi : " + taxi);
		System.out.println();
		
		// 기존 조건의 반대경우를 나타내고 싶을 때 !를 붙여준다
		System.out.println("!flag1 : " + !flag1);
		System.out.println("!flag2 : " + !flag2);
		System.out.println("!flag3 : " + !flag3);
		System.out.println();
		
		boolean tvPower = false;
		
		System.out.println("tvPower : " + tvPower);
		tvPower = !tvPower;
		
		System.out.println("tvPower : " + tvPower);
		tvPower = !tvPower;
		
		System.out.println("tvPower : " + tvPower);
		tvPower = !tvPower;
		
		System.out.println("tvPower : " + tvPower);
	}
}

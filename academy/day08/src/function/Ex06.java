package function;

public class Ex06 {
	public static void main(String[] args) {
		System.out.println("args.length : " + args.length);
		
		for (int i = 0; i < args.length; i++) {
			System.out.printf("args[%d] : %s\n", i, args[i]);
		}
		System.out.println("끝");
		
		// lower case, upper case
		if(args.length > 0) {
			switch(args[0]) {
			case "/l" : System.out.println("hello world"); break;
			case "/u" : System.out.println("Hello WORLD"); break;
			default : 	System.out.println("Hello world");
			}
		}
		
		
		
	}
}

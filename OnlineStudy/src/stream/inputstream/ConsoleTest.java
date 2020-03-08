package stream.inputstream;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {
		
		//이거는 이클립스랑 연동이 안된다. 직접 콘솔가서 실행해야함 
		//패키지가 있는 클래스는 패키지 풀네임으로 돌려야함 ex) java stream.inputstream.ConsoleTest 

		Console console = System.console();
		
		System.out.println("이름 : ");
		String name = console.readLine();
		System.out.println("비밀번호 : ");
		char[] password = console.readPassword();
		
		System.out.println(name);
		System.out.println(password);
	}

}

package practiceexception;

//문제
//매개변수로 전달된 아이디가 null 이거나 8이하 20자 이상인 경우 예외를 발생시키는 예외 클래스를 직접 만들고 예외를 발생해보세요

public class IDFormatException extends Exception{

	public IDFormatException(String message) {	//Exception에 관해 메시지 받을 용도 
		super(message);
	}
}

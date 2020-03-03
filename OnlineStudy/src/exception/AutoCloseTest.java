package exception;

public class AutoCloseTest {

	public static void main(String[] args) {

		try(AutoCloseObj obj = new AutoCloseObj()){	
			//obj가 생성이 되고 autoclose 기능이 수행된다면 AutoCloseObj의 close()메서드의 내용이 실행이 될것이다. 
			
			throw new Exception();	//밑에 Exception을 강제로 예외를 발생시킴 --> 이떄도 close()가 try에서 호출이 되는지 확인용으로 써봤음  
		}catch(Exception e) {
			System.out.println(e);
			
		}
		
		
		System.out.println("=====변수가 2개일 떄");
		
		AutoCloseObj obj1 = new AutoCloseObj();
		
		try(AutoCloseObj obj2 = obj1) {	//try()안에다가 타입을 선언해서 사용해야만한다. but!!! java 9이후에는 try(obj1)처럼 변수만 써도 된다.
			
		} catch(Exception e) {
			
		}
	}

}

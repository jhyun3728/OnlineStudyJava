package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {	//throws로 미룬 예외처리들은
		FileInputStream fis = new FileInputStream(fileName);												//loadClass() 메서드를 호출하는 곳에 처리해야함 
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) {

		ThrowsException test = new ThrowsException();
		try {		//직접 loadClass()에서 throws로 미룬 예최처리들을 핸들링하기 위해 try/catch를 해준다. 
			test.loadClass("b.txt",  "java.lang.string");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		System.out.println("end");
		//예외처리를 하려는 목적에 맞게 위에서 할지 아니면 호출하는 곳에서 할지 정하면 된다.  //로그를 남기기 좋은쪽에서 하면 된다. 
		
		
		try {
			test.loadClass("a.txt", "java.lang.string");
		} catch (FileNotFoundException | ClassNotFoundException e) {	//어떤 Exception이 되던 한곳에서 처리할때 multi catch 사용 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {		//직접 loadClass()에서 throws로 미룬 예최처리들을 핸들링하기 위해 try/catch를 해준다. 
			test.loadClass("b.txt",  "java.lang.string");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {	//위에서 안걸린 Exception은 여기서 걸리게끔 추가해줄 수 있다. --> default Exception이라고도 함 
								//최상위 Exception이여서 모든 Excepton은 이쪽으로 업캐스팅이 된다.  //절대 다른 Exception보다 먼저 쓰면 안된다. 여기에서 다 걸리게 된다. 
			System.out.println(e);
		}
	}

}

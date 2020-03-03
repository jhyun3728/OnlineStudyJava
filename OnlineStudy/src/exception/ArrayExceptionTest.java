package exception;

public class ArrayExceptionTest {

	public static void main(String[] args) {

		int[] arr = new int[5]; //new 때문에 자동으로 0으로 초기화 된다.
		
		try {
			for(int i = 0; i <= 5; i++) {
				System.out.println(arr[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e); //exception e의 toString()을 보여준다.
			System.out.println("예외처리");
		}
		System.out.println("프로그램 종료");
	}

}

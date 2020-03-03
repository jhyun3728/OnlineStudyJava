package innerclass;

class Outer{
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		
		int num = 100;
		class MyRunnable implements Runnable{	//getRunnalbe() 메서드 안에 클래스를 만들었다 --> 지역 내부 클래스

			@Override
			public void run() {	
								
			//	num += 10;  //MyRunnable을 반환하면 run() 메서드는 언제든지 호출이 가능해진다. but!!, 위에 있는 int i, int num과 같은 지역변수는 사라진다.
			//	i = 200;  //지역 내부 클래스에서 지역변수들은 (내부적으로) 상수(final)가 된다. --> 그래서 변수들을 '참조'는 할 수 있지만 '변경'은 안된다. (유효성이 짧기 때문)
				System.out.println(num);
				System.out.println(i);
				System.out.println(outNum);
				System.out.println(Outer.sNum);
			}
			
		}
		return new MyRunnable();
	}
}

public class LocalInnerClassTest {

	public static void main(String[] args) {

		Outer outer = new Outer();
		Runnable runnable = outer.getRunnable(50);
		
		runnable.run(); 
	}

}

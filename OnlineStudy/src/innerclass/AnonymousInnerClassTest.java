package innerclass;

class Outer2 {	//localInnerClassTest 파일에 Outer 클래스가 있어서 이름이 중복됨 --> 같은 클래스 이름 사용 불가 
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		
		int num = 100;
	//	class MyRunnable implements Runnable{	//클래스 이름(MyRunnable)이 여기 첨에 한번밖에 안쓰인다. --> 필요가 없으니 다른 방법으로 써보자
		return new Runnable(){	//### 익명 내부 클래스 ###
			@Override
			public void run() {	
								
			//	num += 10;  //MyRunnable을 반환하면 run() 메서드는 언제든지 호출이 가능해진다. but!!, 위에 있는 int i, int num과 같은 지역변수는 사라진다.
			//	i = 200;  //지역 내부 클래스에서 지역변수들은 (내부적으로) 상수(final)가 된다. --> 그래서 변수들을 '참조'는 할 수 있지만 '변경'은 안된다. (유효성이 짧기 때문)
				System.out.println(num);
				System.out.println(i);
				System.out.println(outNum);
				System.out.println(Outer.sNum);
			}
			
		};
	//	return new MyRunnable(); //위에 클래스 선언대신 retrun new Runnable() {}; 을 해줘서 필요없어짐  ' ; ' 세미콜론 필수
	}
	
//	Runnable runner = new //여기서//여기서 자동완성 해서 Runnalbe()을 하면 바디에 자동으로 위와 똑같이 익명 내부 클래스가 생성된다. 
	Runnable runner = new Runnable() {	//익명내부 클래스는 바로 인터페이스나 추상클래스의 생성을 바로 할 수 있다.
		
		@Override
		public void run() {
			System.out.println("test");
		}
	};
}

public class AnonymousInnerClassTest {

	public static void main(String[] args) {

		Outer2 outer = new Outer2();
		
		outer.runner.run(); //runner  익명 내부 클래스의 run()	////익명내부 클래스는 바로 인터페이스나 추상클래스의 생성을 바로 할 수 있다.
		
		Runnable runnable = outer.getRunnable(50);
		
		runnable.run(); 
	}

}

package innerclass;

class OutClass{	//외부 클래스 
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass(); //주로 아웃클래스 컨스트럭터에서 생성 많이 한다.
	}
	
	class InClass{	//내부 클래스 //static 등등 아무거도 붙은게 없기 때문에 익명 내부 클래스임
		int iNum = 100;
	//	static int sInNum = 200;  //sInNum 오류. static 키워드는 생성과 상관없이 이용할 수 있다. 그래서 InClass를 static 클래스로 바꿔줘야함 
		
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
		}
	}
	
	public void usingIneer() {
		inClass.inTest();
	}
	
	static class InStaticClass{
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println(inNum);
			System.out.println(sInNum);
			System.out.println(sNum);
		}
								//일반 메서크 안에는 static 메서드를 생성 못하지만
		static void sTest() {	//static 클래스에는 static 메서드, static 변수 생성 가능 
		//	System.out.println(inNum);	//inNum은 InStaticClass가 생성된 이후에 쓸 수 있으므로 Static 메서드에서는 사용 못한다.
										//static 메서드는 인스턴스 생성없이 클래스의 이름(클래스이름. )으로만으로도 생성 가능하므로 일반 변수는 오지 못한다.
			System.out.println(sInNum);
			System.out.println(sNum);
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();	//InClass를 OutClass의 컨스턱터에 선언해서 OutClass를 생성하면서 내부적으로 InClass도 같이 생성 된다.
		outClass.usingIneer();
		
		OutClass.InClass myInClass = outClass.new InClass();  //OutClass.InClass를 하면 바로 엑세스 할 수 있다
		myInClass.inTest();									//또한 바깥(main 등 다른 클래스)에서 직접 생성 가능 ex) = outClass.new InClass();  (잘 안씀)
															//이렇게 밖에서 선언할 꺼면 바깥에 정의하는게 맞으므로 잘 안쓴다. 
															//but, class InClass를 private으로 설정하면 밖에서 생성 못함
															//정말 클래스 내부에서만 쓰겠다하면 private으로 만드는게 낫다. (위에 방식은 문법적으로 가능한거만 알자)
		System.out.println();
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass(); //static 클래스 바로 생성하는 방법
		sInClass.inTest(); //static 클래스의 일반 메서드 생성방법 --> static 클래스 생성 후 일반 메서드 호출
		OutClass.InStaticClass.sTest();   //static 클래스 내부에 static 메서드 호출 방법 --> 그냥 클래스 이름으로 호출
	}

}

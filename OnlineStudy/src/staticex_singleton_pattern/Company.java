package staticex_singleton_pattern;

public class Company {

	private static Company instance = new Company(); //밑에 private Company() 메서드를 이용할 수 있도록 자기자신을 타입으로 하는 내부변수를 선언해준다.
	
	private Company() {}	//기본 디폴트 인스턴스
	
	public static Company getInstance() { //instance 변수를 외부에서 가져다 쓸 수 있게끔 static으로 선언해준다
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}

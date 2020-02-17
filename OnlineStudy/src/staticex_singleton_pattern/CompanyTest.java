package staticex_singleton_pattern;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {

		//Company company = new Company(); //오류O -> Company 클래스 파일에서 Company() 메서드가 private이여서
		Company company1 = Company.getInstance();
		
		Company company2 = Company.getInstance();
		
		System.out.println(company1);
		System.out.println(company2);	//static이여서 같은 메모리를 공유 -> 동일한 메모리값이 나온다
										//싱글톤 패턴 예제 //유일한 객체인 예제
										//싱글톤 패턴은 왠만하면 이 포멧
		
		Calendar calendar = Calendar.getInstance(); //싱글톤 패턴으로 구성된 기본 객체
	}

}

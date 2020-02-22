package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		
//		Customer customerLee = new Customer();
//		customerLee.setCustomerName("이순신");
//		customerLee.setCustomerID(10010);
//		customerLee.bonusPoint = 1000;
//		System.out.println(customerLee.showCustomerInfo());
		
		
		//VIPCustomer가 Customer를 상속받고 있으므로 VIPCustomer를 생성하면 Customer가 먼저 생성되고 VIPCustomer가 생성된다. //=> 하위 클래스가 생성 될 때 상위 클래스가 먼저 생성 됨
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12347);	//위의 Customer 객체를 생성해주지 않아도 Customer의 기능을 다 이용할 수 있다.
		Customer customerYun = new VIPCustomer(10030, "윤재현", 12348); //VIPCustomer인 동시에 Customer를 상속받아 내포하고 있으므로 Customer로 해도 오류가 안남 --> 업캐스팅
		
		/*
		**상위 클래스로의 묵시적 형 변환(업캐스팅)
		 -상위 클래스 형으로 변수를 선언하고 하위 클래스 인스턴스를 생성 할 수 있음
		 -하위 클래스는 상위 클래스의 타입을 내포하고 있으므로 상위 클래스로 묵시적 형변환이 가능 함
		 -상속관계에서 모든 하위 클래스는 상위클래스로 묵시적 형 변환이 됨
		 -그 역은 성립하지 않음
		 
		 ex) 
		 선언된 클래스형          생성된 인스턴스의 클래스형
		 (상위 클래스형)	    (하위 클래스형)
		 Customer vc = new VIPCustomer();
		 */
		
//		customerKim.setCustomerName("김유신");
//		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
	}
}
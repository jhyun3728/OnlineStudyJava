package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
	
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
		
		
		
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345);
		customerKim.bonusPoint = 10000;
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		
		System.out.println(customerLee.showCustomerInfo() + "지불금액은 " + priceLee + "원 입니다.");
		
		System.out.println(customerKim.showCustomerInfo() + "지불금액은 " + priceKim + "원 입니다.");
		
		Customer customerNo = new VIPCustomer(10030, "나몰라", 12346);
		customerNo.bonusPoint = 10000;
		System.out.println(customerNo.showCustomerInfo() + "지불금액은 " + customerNo.calcPrice(10000) + "원 입니다.");
		//가상 메서드 : 메서드의 이름과 메서드 주소를 가진 가상 메서드 테이블에서 호출된 메서드의 주소를 참조함   //메서드의 이름은 주소
		//Customer vd = new VIPCustomer(); 일때
		//vc.calcPrice();  ---calcPrice() 재정의 X---> Customer 클래스의 calcPrice()
		//                 ---calcPrice() 재정의 O---> VIPCustomer 클래스의 재정의한 calcPrice()   //인스턴스(new VIPCustomer();)의 메서드가 호출
	}

}

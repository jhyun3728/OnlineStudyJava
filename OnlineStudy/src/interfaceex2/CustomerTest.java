package interfaceex2;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		customer.sayHello();
		
		Buy buyer = customer;	//Buy 타입이여서 Buy에 있는 메서드들만 사용가능 buy(), order()
		buyer.buy();
		buyer.order(); //다형성 / 이때 호출되는 order는 인스턴스의 order() 이다 
		
		Sell seller = customer;	//Sell 타입이여서 Sell에 있는 메서드들만 사용가능 buy(), order()
		seller.sell();
		seller.order();
		
		//결과 보면 다 Customer의 것들이 출력됨 
		//결론 : 모두 구현된 인스턴스 것이 보인다. 
		
		
		//다운캐스팅도 가능
		//if (seller instaceof Customer) {}   뭐 대충 이런식으로 
	}

}

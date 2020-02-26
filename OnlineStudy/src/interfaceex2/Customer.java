package interfaceex2;

public class Customer implements Buy, Sell{  //sell과 buy만 구현하면 class 이름(Customer)에 빨간줄 뜸 
											//이유 : Buy, Sell 클래스에 있는 order() 메서드가 중복됐는데 둘 중 어떤걸 쓸건지 정하라고 오류가 뜸 
													//직접 정의해도 되고 정의해주는대로 써도 된다.
	@Override
	public void sell() {
		System.out.println("customer sell");
	}

	@Override
	public void buy() {
		System.out.println("customer buy");
	}
/*
	@Override
	public void order() {
		// TODO Auto-generated method stub
		Buy.super.order();
	}
*/
/*
	@Override
	public void order() {
		// TODO Auto-generated method stub
		Sell.super.order();
	}
*/
	//프로그램이 정의해준 둘 중 하나 사용하고 싶은걸로 사용하거나 
	
	//직접 정의해도 된다.
	@Override
	public void order() {
		System.out.println("customer order");
	}
	
	public void sayHello() {
		System.out.println("Hello");
	}
}

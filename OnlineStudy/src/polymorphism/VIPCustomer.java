package polymorphism;

public class VIPCustomer extends Customer{ 
//getter, setter 일일이 또 다 만들지말고 겹치는게 많으니까 Customer 클래스를 상속받자
	
	double salesRatio;
	private int agentID;
	
//	public VIPCustomer() {
		
		//protected 예약어 : 외부 클래스에는 private으로 하위 클래스에서 public의 기능을 구현한 키워
		//상위 클래스에 protected로 선언된 변수나 메서드는 다른 외부 클래스에서는 사용할 수 없지만 하위 클래스에서는 사용 가능
		
		/*
		 * 						|  외부 클래스	|  하위 클래스	|  동일 패키지	|  내부 클래스	|
		 * 	public				|  	  O		|  	  O		|  	  O		|  	  O		|
		 * 	protected			|  	  X		|  	  O		|  	  O		|  	  O		|
		 * 	선언되지 않음(default)	|  	  X		|  	  X		|  	  O		|  	  O		|
		 * 	private				|  	  X		|  	  X		|  	  X		|  	  O		|
		 *
		 * 
		 * 
		 	**하위 클래스가 생성되는 과정**
			-하위 클래스가 생성 될 때 상위 클래스가 먼저 생성됨

			-상위 클래스의 생성자가 호출되고 하위 클래스의 생성자가 호출 됨
			-하위 클래스의 생성자에서는 무조건 상위 클래스의 생성자가 호출되어야함

			-하위 클래스에서 상위 클래스의 생성자를 호출하는 코드가 없는 경우 컴파일러는 상위 클래스 기본 생성자를 호출하기 위한 super()를 추가함

			-super()로 호출되는 생성자는 상위 클래스의 기본 생성자임

			-만약 상위 클래스의 기본생성자가 없는 경우 (매개변수가 있는 생성자만 존재 하는 경우)
				하위 클래스는 명시적으로 상위 클래스의 생성자를 호출해야 함
				
				
			**상속에서의 메모리 상태**
			상위 클래스의 인스턴스가 먼저 생성이 되고,
			하위 클래스의 인스턴스가 생성 됨

			<힙 메모리>
 			customerID		(1)
 			customerName	(1)
 			customerGrade	(1)	   (1) --> Customer() 생성자 호출
 			bonusPoint		(1)	            -> Customer 클래스의 멤버 변수가 메모리에 생성됨
 			bonusRatio		(1)
 			agentID			(2)    (2) --> VIPCustomer() 생성자 호출
 			salesRatio		(2)	            -> VIPCustomer 클래스의 멤버 변수가 메모리에 생성됨
		 * 
		 */
		
//		super(0, null); //그냥 super();하면 에러 //상위 클래스(Customer)에서 디폴트 생성자(public Customer(){})가 없고 매개변수가 있는 Customer 생성자가 있어서 
												//하위 클래스인 VIPCustomer에 super(매개변수)를 명시해줘야함
												//디폴트 또는 매개변수 있는 생성자 모두 없으면 프로그램이 알아서 디폴트 생성자를 만들고 시작하기때문에 명시 안해줘도 됨
//		customerGrade = "VIP";	//상속을 받았더라도 customerGrade가 private으로 되어있으면 이용불가 //상속받는 클래스에서 사용가능하게 protected를 사용
//		bonusRatio = 0.05;
//		salesRatio = 0.1;
//	}
	
	
	
	//기본 생성자를 없애면 상위클래스 매개변수에 맞는 하위 클래스의 생성자를 추천해줌 //클릭하면 밑에처럼 만들어줌
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);

		customerGrade = "VIP";	//상속을 받았더라도 customerGrade가 private으로 되어있으면 이용불가 //상속받는 클래스에서 사용가능하게 protected를 사용
		bonusRatio = 0.05;
		salesRatio = 0.1; //Customer 클래스에 calPrice에는 salesRatio가 없다. VIPCustomer에 맞게 오버라이딩해주자 
		this.agentID = agentID;
	}

	//우클릭 -> source -> override
	@Override   //애노테이션 //컴파일러한테 이 메서드가 오버라이딩된 메서드라고 알려주는 역할 //지워도 되는데 컴파일 오류를 막아주므로 냅두자
	public int calcPrice(int price) {   //다른 매개변수를 쓰면 애노테이션을 지우던지 제대로 된 매개변수를 사용해야지 오류가 안남
		bonusPoint += price*bonusRatio;
		return price - (int)(price*salesRatio);
	}
	
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " 담당 상담원 번호는 " + agentID + "입니다.";
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	
}

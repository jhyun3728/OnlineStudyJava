package inheritance;

public class VIPCustomer extends Customer{ //getter, setter 일일이 또 다 만들지말고 겹치는게 많으니까 Customer 클래스를 상속받자
	
	double salesRatio;
	private int agentID;
	
	public VIPCustomer() {
		
		//protected 예약어 : 외부 클래스에는 private으로 하위 클래스에서 public의 기능을 구현한 키워
		//상위 클래스에 protected로 선언된 변수나 메서드는 다른 외부 클래스에서는 사용할 수 없지만 하위 클래스에서는 사용 가능
		
		/*
		 * 						|  외부 클래스	|  하위 클래스	|  동일 패키지	|  내부 클래스	|
		 * 	public				|  	  O		|  	  O		|  	  O		|  	  O		|
		 * 	protected			|  	  X		|  	  O		|  	  O		|  	  O		|
		 * 	선언되지 않음(default)	|  	  X		|  	  X		|  	  O		|  	  O		|
		 * 	private				|  	  X		|  	  X		|  	  X		|  	  O		|
		 */
		
		
		customerGrade = "VIP";	//상속을 받았더라도 customerGrade가 private으로 되어있으면 이용불가 //상속받는 클래스에서 사용가능하게 protected를 사용
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
}

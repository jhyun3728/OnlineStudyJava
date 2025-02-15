package polymorphism;

public class Customer {

	protected int customerID;  //private를 사용하면 다른 클래스에서 상속받아도 사용 못함. //상속받는 클래스에게 이용권한 주도록 private 말고 protected 사용
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	/*
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	*/
	
	public Customer(int customerID, String customerName) {	//매개변수가 없는 디폴트 컨스럭터 생성자(위의 public Customer() {})가 없으면 하위 클래스에서 super(매개변수)로 명시해줘야함
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}

	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 적립된 보너스 포인트는 " + bonusPoint + "점 입니다.";
	}
	
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
}

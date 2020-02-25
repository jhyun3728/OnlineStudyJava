package practiceinheritance;

public class GoldCustomer extends Customer{

	double salesRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
//		this.customerID = customerID;		//이미 상속받았기 때문에 사용할 필요 없음.
//		this.customerName = customerName;
		
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		salesRatio = 0.1;
	}

	@Override
	public int calcPrice(int price) {

		bonusPoint += price*bonusRatio;
		return (int)(price - (price*salesRatio));
	}
	
	
}

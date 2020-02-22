package practiceinheritance;

public class VIPCustomer extends Customer{

	double salesRatio;
	int agentID;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		
		super(customerID, customerName);
		this.agentID = agentID;
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.15;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price - (int)(price*salesRatio);
	}
	
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "담당 전문 상담원 번호는 " + getAgentID() + "입니다.";
	}
	
	public int getAgentID() {
		return this.agentID;
	}
}

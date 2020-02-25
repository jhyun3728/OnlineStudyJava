package practiceinheritance;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> arrayList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(1001, "Lee");
		Customer customerKim = new GoldCustomer(1002, "Kim");
		Customer customerSon = new GoldCustomer(1003, "Son");
		Customer customerYun = new VIPCustomer(1004, "Yun", 999);
		Customer customerPark = new VIPCustomer(1005, "Park", 111);
		
		arrayList.add(customerLee);
		arrayList.add(customerKim);
		arrayList.add(customerSon);
		arrayList.add(customerYun);
		arrayList.add(customerPark);
		
		System.out.println("===== 고객 정보 출력 =====");
		
		for( Customer a : arrayList) {
			System.out.println(a.showCustomerInfo());
		}
		
		System.out.println();
		System.out.println("===== 할인율과 보너스 포인트 계산 =====");
		
		int price = 10000;
		for(Customer a : arrayList) {
			int cost = a.calcPrice(price);
			System.out.println(a.getCustomerName() + " 님이 " + cost + "원 지불하셨습니다.");
			System.out.println(a.getCustomerName() + " 님의 현재 보너스 포인트는 " + a.getBonusPoint() + "점 입니다.");
		}
		
	}

}

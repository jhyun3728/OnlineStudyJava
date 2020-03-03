package priacticestream;

import java.util.ArrayList;
import java.util.List;

public class TravelCustomerTest {

	public static void main(String[] args) {

		TravelCustomer Lee = new TravelCustomer("Lee", 40, 100);
		TravelCustomer Kim = new TravelCustomer("Kim", 20, 100);
		TravelCustomer Yun = new TravelCustomer("Yun", 13, 100);
		
		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
		customerList.add(Lee);
		customerList.add(Kim);
		customerList.add(Yun);
		
		System.out.println(customerList);
		
		int total = customerList.stream().mapToInt(c -> c.getCost()).sum();
		System.out.println(total);
		
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
	}

}
package classpartpractice;

public class OrderTest {

	public static void main(String[] args) {
		Order order1 = new Order();
		
		order1.num = "2019072110001";
		order1.ID = "abc123";
		order1.year = 2019;
		order1.month = 7;
		order1.date = 21;
		order1.name = "홍길동";
		order1.prodNum = "PD0345-12";
		order1.address = "서울시 영등포구 여의도동 20번지";
		
		order1.showOrderInfo();
		
	}

}

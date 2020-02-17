package practiceclasspart;

public class Order {
	
	String num;
	String ID;
	int year, month, date;
	String name;
	String prodNum;
	String address;
	
	public void showOrderInfo() {
		System.out.println("주문 번호 : " + num);
		System.out.println("주문자 아이디 : " + ID);
		System.out.println("주문 날짜 : " + year + "년 " + month + "월 " + date + "일");
		System.out.println("주문자 이름 : " + name);
		System.out.println("주문 상품 번호 : " + prodNum);
		System.out.println("배송 주소 : " + address);
	}

}

package practicestatic_singlepattern;

public class CardCompanyTest {

	public static void main(String[] args) {

		CardCompany company = CardCompany.getInstance();
		
		Card myCard = company.createCard();
		Card yourCard = company.createCard();
		
		System.out.println(myCard.getCardNumber());
		System.out.println(yourCard.getCardNumber());
		
		myCard.setCardNumber(930623);
		
		System.out.println(myCard.getCardNumber());
		System.out.println(yourCard.getCardNumber());
	}

}

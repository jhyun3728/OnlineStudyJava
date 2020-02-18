package practicestatic_singlepattern;

public class Card {
	
	private static int serialNum = 10000;
	private int cardNumber;
	
	Card() {
		serialNum++;
		cardNumber = serialNum;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	
}

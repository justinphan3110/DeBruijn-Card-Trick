
public class Card {
	private String name;
	private cardSuit suit;
	private cardColor color;
	private String binaryNum;
	
	protected enum cardColor{
		RED,
		BLACK,
	}
	
	protected enum cardSuit{
		SPADES,
		CLUBS,
		DIAMONDS,
		HEARTS
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setSuit(int suitNum) {
		switch(suitNum) {
		case 1:
			this.suit = cardSuit.SPADES;
			break;
		case 2:
			this.suit = cardSuit.CLUBS;
			break;
		case 3 :
			this.suit = cardSuit.DIAMONDS;
			break;
		case 4:
			this.suit = cardSuit.HEARTS;
			break;
		default:
			break;
		}
		if(suit.equals(cardSuit.SPADES) || suit.equals(cardSuit.CLUBS)) {
			this.color = cardColor.BLACK;
			binaryNum = "0";
		} else {
			this.color = cardColor.RED;
			binaryNum = "1";
		}
	}
	
	public String getSuit() {
		return this.suit.toString();
	}
	public cardColor getcolor() {
		return color;
	}
	
	public String toString() {
		return this.getName() + "(" + this.getSuit() + ")";
	}
	
	public String getBinary() {
		return binaryNum;
	}
	
	
	
	public Card(String name) {
		this.name = name;
		this.suit = suit;
		
	}
}

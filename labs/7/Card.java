
public class Card {
	String cardNum;
	String suit;
	Card(String suit,String cardNum){
		this.cardNum = cardNum;
		this.suit = suit;
	}
	public String getValue(Card card){
		return card.suit+" "+card.cardNum;
	}
	public String getSuit(Card s){
	  return s.suit;
	}
	public String getCardNum(Card c){
	  return c.cardNum;
	}
	public String printCard(Card card){
		return card.suit+" "+card.cardNum;
	}
}


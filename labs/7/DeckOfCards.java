import java.util.Scanner;
public class DeckOfCards {
    private static Card[] cards = new Card[52];
    String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
    DeckOfCards(){
      int index = 0;
      for (int suit = 0; suit <=3; suit++) {
        for (int rank = 0; rank < 13; rank++) {
          cards[index] = new Card(suits[suit],ranks[rank]);
          //System.out.println(cards[index].getValue(cards[index]));
          System.out.println(index);
          index++;
        }
      }
    }
    public static void printDeck() {
       
      for (int i = 0; i < cards.length-1; i++) {
           System.out.println(cards[i].getValue(cards[i]));
      }
    }
    public static String fetchNum(int num){
        
     return  cards[num].getCardNum(cards[num]);
    }
    public static String fetchCard(int st){
     return  cards[st].getSuit(cards[st]);
    }
    public static void main(String[] args){
      DeckOfCards deck = new DeckOfCards();
      deck.printDeck();
      Scanner input = new Scanner(System.in);
      System.out.println("Pick a suit number from deck");
      int num2 = input.nextInt();
      deck.fetchCard(num2*10);
      System.out.println("Pick a number from deck");
      int num = input.nextInt();
      deck.fetchNum(num-1);
      System.out.println("Your card was:"+deck.fetchNum(num-1)+" of "+deck.fetchCard(num2*10));
    }
}
	

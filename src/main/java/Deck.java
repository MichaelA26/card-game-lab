import java.util.ArrayList;
import java.util.Collections;

public class Deck {

        private ArrayList<Card> deck;

    public Deck() {
            this.deck = new ArrayList<>();
        }

        public int cardCount () {
            return this.deck.size();
        }

        public void addCard (Card card){
            this.deck.add(card);
        }

        public void newDeck () {
            for (SuitType eachsuit : SuitType.values()) {
                for (RankType eachrank : RankType.values()) {
                    Card card = new Card(eachsuit, eachrank);
                    deck.add(card);
                }
            }
            Collections.shuffle(deck);
        }

    public void dealCard() {
        deck.remove(0);
    }
}

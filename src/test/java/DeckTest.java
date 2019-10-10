import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck myCards;
    private Card card;

    @Before
    public void before(){
        myCards = new Deck();
        card = new Card(SuitType.DIAMONDS, RankType.FOUR);
    }

    @Test
    public void hasNumberOfCards(){
        assertEquals(0, myCards.cardCount());
    }

    @Test
    public void canAddCardToDeck(){
        myCards.addCard(card);
        assertEquals(1, myCards.cardCount());
    }

    @Test
    public void newDeckHas52Cards(){
        myCards.newDeck();
        assertEquals(52, myCards.cardCount());
    }
}

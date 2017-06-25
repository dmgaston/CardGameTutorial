package test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import game.Card;
import org.junit.jupiter.api.Test;

public class CardTest {
    public Card card = new Card("heart",6);
    @Test
    public void initTest(){

        assertNotNull(card);
    }
    @Test
    public void stringTest(){

        String cardString = card.getCardAsString();
        assertEquals(cardString,"H6");
    }
}

package test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import game.Card;
import org.junit.jupiter.api.Test;

public class CardTest {
    @Test
    public void createTest(){
        Card card = new Card("heart",6);
        assertNotNull(card);
    }
    @Test
    public void stringTest(){
        Card card = new Card("heart",6);
        String cardString = card.getCardAsString();
        assertEquals(cardString,"H6");
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest {
    //test if game compares player and computer choices.
    @Test
    void compareChoicesTest(){
        String player = "paper";
        String computer = "rock";
        String winner = Game.compareChoices(computer, player);
        // assertSame("Player wins!\npaper beats rock" , winner);
    }
}

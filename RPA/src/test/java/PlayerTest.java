import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    //checks if valid input

    @Test
    void validateCorrectInput(){
        //if correct input return input string
        //correct input ==  paper, rock, scissors
        String input = "paper";
        String output = Player.validateInput(input);
        assertEquals("OK",output);
    }

    @Test
    void validateIncorrectInput(){
        //if incorrect input return error string
        //incorrect string == anything not rock, paper, scissors
        String input = "fvsf";
        String output = Player.validateInput(input);
        assertEquals(output, "ERROR");
    }

}

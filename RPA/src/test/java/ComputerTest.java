import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class ComputerTest {

    //Does the computer randomly choose r,p,a?

    public static ArrayList<String> moves = new ArrayList<>();
    private static String computerMove;
    public static void getMoves() {
        moves.add("rock");
        moves.add("paper");
        moves.add("scissors");
    }

    @Test
    void computerChoiceTest(){
        //test if method randomly chooses string
    }
}

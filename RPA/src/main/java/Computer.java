import java.util.ArrayList;
import java.util.Random;

public class Computer {

    public static ArrayList<String> moves = new ArrayList<>();
    private static String computerMove;

    public static void getMoves() {
        moves.add("rock");
        moves.add("paper");
        moves.add("scissors");
    }

    public static String getComputerMove() {
        return computerMove;
    }

    public static void setComputerMove(){
        Random random = new Random();
        computerMove = moves.get(random.nextInt(moves.size()));
    }

}

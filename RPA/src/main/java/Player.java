import java.util.ArrayList;
import java.util.Scanner;

public class Player {

    private static final Scanner sc = new Scanner(System.in);
    public static ArrayList<String> moves = new ArrayList<>();
    private static String playerMove;

    /**
     * Adds moves to list
     */
    public static void getMoves() {
        moves.add("rock");
        moves.add("paper");
        moves.add("scissors");
        moves.add("exit");
        moves.add("quit");
    }

    /**
     * It takes input as a parameter.
     *
     * @return ERROR is input does not match list 
     * of moves else returns OK.
     */
    public static String validateInput(String input) {
        if (moves.isEmpty()){
            getMoves();
        }
        if(!moves.contains(input)){
            return "ERROR";
        }return "OK";
    }

    /**
     * Getter for playerMove.
     */
    public static String getPlayerMove(){
        return playerMove;
    }

    /**
     * Setter for playerMove.
     */
    protected static void setPlayerMove(String input) {
        playerMove = input;
    }


    /**
     * It takes input from user.
     *
     * @return The input from the user to set player move.
     */
    public static String input() {
        System.out.println("\nMake your move: ");
        String input = sc.nextLine();

        while (input.isBlank()) {
            System.out.println("\nInvalid move. Make your move: ");
            input = sc.nextLine();
        }
        return input.strip();
    }
}

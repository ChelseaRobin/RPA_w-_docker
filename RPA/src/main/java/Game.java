import java.util.Scanner;

public class Game {

    private static final Scanner game = new Scanner(System.in);
    private static String computer;
    private static String player;

    public static void setMoves(){
        computer = Computer.getComputerMove();
        player = Player.getPlayerMove();
    }

    public static String compareChoices(String computer, String player) {

        if (player.equals("exit") || player.equals("quit")){
            System.out.println("Thanks for playing! Bye-Bye!");
            System.exit(0);
        }

        if (computer.equals("paper") && player.equals("rock")){
            return String.format("Computer wins!\n" +computer+ " beats " + player);
        }else if (computer.equals("rock") && player.equals("scissors")){
            return String.format("Computer wins!\n" + computer + " beats " + player);
        }else if (computer.equals("scissors") && player.equals("paper")){
            return String.format("Computer wins!\n" + computer + " beats " + player);
        }else if (computer.equals(player)){
            return String.format("It's a tie!\n" + computer + " / " + player);
        }
        else{
            return String.format("Player wins!\n"+ player + " beats " + computer);
        }
    }

    /**
     * It takes input from user.
     *
     * @return The input from the user to set player name.
     */
    public static String enterName() {
        System.out.println("\nPlease enter your name: ");
        String input = game.nextLine();

        while (input.isBlank()) {
            System.out.println("\nYour Name should contain at least one letter.");
            System.out.println("\nPlease enter your name: ");
            input = game.nextLine();
        }
        return input.strip();
    }

    /**
     * It takes input from user.
     *
     * @return The input from the user to set a new game.
     */
    public static String playAgain() {
        System.out.println("\nwould you like to play again? yes/no ");
        String again = game.nextLine();

        while (again.isBlank()) {
            System.out.println("\nPlay again? yes/no ");
            again = game.nextLine();
        }
        return again.strip();
    }

    public static void main(String[] args) {

        System.out.println("\n------->Welcome to Rock, Paper, Scissors game<-------");
        
        String playerName = enterName();

        System.out.println("\nWelcome "+ playerName + "!");

        String playerMove;

        boolean continuePlaying = true;
        int count = 0;

        while (continuePlaying) {

            while (count != 3){
            
                if (Computer.moves.isEmpty()){
                    Computer.getMoves();
                }

                do{
                    playerMove = Player.input();
                }while(Player.validateInput(playerMove).equals("ERROR"));

                count++;

                Player.setPlayerMove(playerMove);

                Computer.setComputerMove();
                setMoves();

                System.out.println("\n" + compareChoices(computer, player));
                System.out.println(count);                    
                
            }

            String anotherGame = playAgain();

            if(anotherGame.equals("no")){
                System.out.println("Thanks for playing! Bye-Bye!");
                continuePlaying = false;
                System.exit(0);
            }else{
                count = 0;
                continue;
            }
        }

    }

}

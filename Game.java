package SeaBattle_new;

import java.util.Scanner;

public class Game {

    private static final int NUMBER_OF_PLAYERS = 2;
    private final Player[] players = new Player[NUMBER_OF_PLAYERS];
    private final Scanner scanner = new Scanner(System.in);

    private Player initializePlayer (int number) {
        int humanReadableNumber = (number + 1);
        while(true) {
            System.out.println("Is player " + humanReadableNumber + " human? (Y/N): ");
            String playerType = scanner.nextLine().trim();
            if (playerType.equalsIgnoreCase("y")) {
                return new HumanPlayer("Player " + humanReadableNumber + " (human)", scanner);
            } else if (playerType.equalsIgnoreCase("n")) {
                return new ComputerPlayer("Player " + humanReadableNumber + " (computer)");
            } else {
                System.out.println("Please answer only Y or N");
            }
        }
    }

    private void setupPlayers() {
        for (int i = 0; i < NUMBER_OF_PLAYERS; i++) {
            players[i] = initializePlayer(i);
        }
        System.out.println(" > it is " + players[0].getName() + " vs. " + players[1].getName());
        //System.out.println(" >> class: " + players[0].getClass().getName()); // returns SeaBattle_new.ComputerPlayer
    }

    private void run() {
        System.out.println("Welcome to the Sea Battle game!");
        setupPlayers();
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.run();

        System.out.println("That's all folks!");
    }
}

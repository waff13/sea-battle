package SeaBattle_new;

import java.util.Scanner;

public class Game {

    private final int NUMBER_OF_PLAYERS = 2;

    Player[] players = new Player[NUMBER_OF_PLAYERS];

    private Player initializePlayer (int number) {
        Scanner scanner = new Scanner(System.in);
        int humanReadableNumber = (number + 1);
        while(true) {
            System.out.println("Is player " + humanReadableNumber + " human? (Y/N): ");
            String playerType = scanner.nextLine().trim();
            if (playerType.equalsIgnoreCase("y")) {
                return new HumanPlayer("Player " + humanReadableNumber + " (human)");
            } else if (playerType.equalsIgnoreCase("n")) {
                return new ComputerPlayer("Player " + humanReadableNumber + " (computer)");
            } else {
                System.out.println("Please answer only Y or N");
            }
        }
    }

    private void run() {
        /*System.out.println("Welcome to the Sea Battle game!");
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= NUMBER_OF_PLAYERS; i++) {
            System.out.println("Is player " + i + " human? (Y/N)");
            String playerType = scanner.nextLine();

            if (playerType.equalsIgnoreCase("y")) {
                HumanPlayer playerX = new HumanPlayer();
                System.out.println(" > human");
                playerX.setName("Player " + i);
            } else if (playerType.equalsIgnoreCase("n")) {
                ComputerPlayer playerY = new ComputerPlayer();
                System.out.println(" > computer");
                playerY.setName("Player " + i + " (computer)");
            }
        }*/

        System.out.println("Welcome to the Sea Battle game!");
        for (int i = 0; i < NUMBER_OF_PLAYERS; i++) {
            players[i] = initializePlayer(i);
        }

        System.out.println(" > it is " + players[0].getName() + " vs. " + players[1].getName());
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.run();

        System.out.println("That's all folks!");
    }
}

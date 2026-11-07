package SeaBattle_new;

import java.util.Scanner;

public class Game {

    private final int NUMBER_OF_PLAYERS = 2;

    Player[] players = new Player[NUMBER_OF_PLAYERS];
    Board[] boards = new Board[NUMBER_OF_PLAYERS];

    private Player initializePlayer (int number) {
        Scanner scanner = new Scanner(System.in);
        int humanReadableNumber = (number + 1);
        while(true) {
            System.out.println("Is player " + humanReadableNumber + " human? (Y/N): ");
            String playerType = scanner.nextLine().trim();
            if (playerType.equalsIgnoreCase("y")) {
                Player humanPlayer = new HumanPlayer();
                humanPlayer.setName("Player " + humanReadableNumber + " (human)");
                humanPlayer.setIsHuman(true);
                return humanPlayer;
            } else if (playerType.equalsIgnoreCase("n")) {
                Player computerPlayer = new ComputerPlayer();
                computerPlayer.setName("Player " + humanReadableNumber + " (computer)");
                computerPlayer.setIsHuman(false);
                return computerPlayer;
            } else {
                System.out.println("Please answer only Y or N");
            }
        }
    }

    private Board initializeBoard (int number) {
        //TODO
        return new Board();
    }

    private void setupPlayers() {
        for (int i = 0; i < NUMBER_OF_PLAYERS; i++) {
            players[i] = initializePlayer(i);
        }
        //System.out.println(" > it is " + players[0].getName() + " vs. " + players[1].getName());
        System.out.println(" > Player 1 is " + (players[0].isHuman() ? "human" : "computer" )
                + " and Player 2 is " + (players[1].isHuman() ? "human" : "computer"));
    }

    private void setupBoard() {
        // copycat of setupPlayers(), could be refactored later
        for (int i = 0; i < NUMBER_OF_PLAYERS; i++) {
            boards[i] = initializeBoard(i);
        }
        System.out.println(" > board is set up");
    }

    private void run() {
        System.out.println("Welcome to the Sea Battle game!");

        setupPlayers();
        setupBoard();
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.run();

        System.out.println("That's all folks!");
    }
}

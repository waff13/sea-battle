package SeaBattle_new;

import java.util.Scanner;

public class HumanPlayer implements Player {

    private final String name;
    private final Scanner scanner;
    private final Board board;

    // reads "B7" from Scanner, validates, re-asks on bad input

    public HumanPlayer (String name, Scanner scanner) {
        this.name = name;
        this.scanner = scanner;
        this.board = new Board();
        //populateBoard(board);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Board getBoard() {
        return board;
    }

    /*public void populateBoard(Board board){
        board.displayBoard();
        System.out.println(" > human : board shown");
    }*/
}

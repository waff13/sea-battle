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
    }

    @Override
    public String getName() {
        return name;
    }
}

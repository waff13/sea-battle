package SeaBattle_new;

public class ComputerPlayer implements Player {

    private final String name;
    private final Board board;

    // picks a random untried cell, or hunts around the last hit

    public ComputerPlayer (String name) {
        this.name = name;
        this.board = new Board();
    }

    @Override
    public String getName() {
        return name;
    }
}

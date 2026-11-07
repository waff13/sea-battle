package SeaBattle_new;

public class ComputerPlayer implements Player {

    private String name;
    private Boolean isHuman;

    // picks a random untried cell, or hunts around the last hit

    /*public ComputerPlayer (String name) {
        this.name = name;
    }*/

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Boolean isHuman() {
        return Boolean.TRUE.equals(isHuman);
    }

    @Override
    public void setIsHuman(Boolean value) {
        this.isHuman = value;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    private Board setupBoard() {

        Board computerBoard = new Board();
        computerBoard.setName("ComputerBoard");

        return computerBoard;
    }
}

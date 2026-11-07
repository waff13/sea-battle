package SeaBattle_new;

public class HumanPlayer implements Player {

    private String name;
    private Boolean isHuman;

    // reads "B7" from Scanner, validates, re-asks on bad input

    /*public HumanPlayer (String name) {
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

        Board humanBoard = new Board();
        humanBoard.setName("HumanBoard");

        return humanBoard;
    }
}

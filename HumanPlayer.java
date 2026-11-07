package SeaBattle_new;

public class HumanPlayer implements Player {

    private String name;

    // reads "B7" from Scanner, validates, re-asks on bad input

    public HumanPlayer (String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

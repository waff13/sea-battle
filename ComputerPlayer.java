package SeaBattle_new;

public class ComputerPlayer implements Player {

    private String name;

    // picks a random untried cell, or hunts around the last hit

    public ComputerPlayer (String name) {
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

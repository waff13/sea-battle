package SeaBattle_new;

public class Board {

    public enum Sea {
        SEA_EMPTY, SEA_MISS,
        SHIP_HEALTHY, SHIP_HIT,
        HIDDEN_CELL
    }

    private static final int SIZE = 10;
    private static final char[] indexLetters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
    private final Sea[][] cells; // actual state of the battlefield

    public Board() {
        this.cells = new Sea[SIZE][SIZE];
        initializeBoard();
    }

    public void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++){
                cells[i][j] = Sea.SEA_EMPTY;
            }
        }
    }

    public void displayBoard(){
        //String indexNumbers = "  1 2 3 4 5 6 7 8 9 10";
        //System.out.println(indexNumbers);

        System.out.print("  ");
        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print(indexLetters[i] + " ");
            for (int j = 0; j < SIZE; j++) {
                Sea tempCell = cells[i][j];
                switch (tempCell) {
                    case SEA_EMPTY:
                        System.out.print(" " + " ");
                    case SEA_MISS:
                        System.out.print("." + " ");
                    case SHIP_HEALTHY:
                        System.out.print("O" + " ");
                    case SHIP_HIT:
                        System.out.print("x" + " ");
                    case HIDDEN_CELL:
                        System.out.print("?" + " ");
                }
            }

            /*for (int j = 0; j < SIZE; j++) {
                if (cells[i][j].equals(Sea.SEA_EMPTY)) {
                    System.out.print(" " + " ");
                } else if (cells[i][j].equals(Sea.SEA_MISS)) {
                    System.out.print("." + " ");
                } else if (cells[i][j].equals(Sea.SHIP_HEALTHY)) {
                    System.out.print("O" + " ");
                } else if (cells[i][j].equals(Sea.SHIP_HIT)) {
                    System.out.print("x" + " ");
                } else if (cells[i][j].equals(Sea.HIDDEN_CELL)){
                    System.out.print("?" + " ");
                }
            }*/
            System.out.println();
        }
    }

}

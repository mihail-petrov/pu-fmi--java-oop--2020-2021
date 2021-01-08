package piece;

import java.awt.*;

public class Pawn {

    private int row;
    private int col;
    private String color;
    private int point;

    public Pawn(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public boolean isMoveValid(int moveRow, int moveCol) {

        int rowCoeficient = Math.abs(moveRow - this.row);
        int colCoeficient = moveCol - this.col;

        return  rowCoeficient == 1 &&
                colCoeficient == 0;
    }

    public boolean isAttackValid(int attackRow, int attackCol) {
        return false;
    }

    public void render(Graphics g) {

        g.setColor(Color.YELLOW);
        g.fillRect(10, 10, 50, 50);
    }
}

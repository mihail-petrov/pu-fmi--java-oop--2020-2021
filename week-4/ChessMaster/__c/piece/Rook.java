package piece;

import java.awt.*;

public class Rook extends Piece {

    public Rook(int row, int col, Color color) {

        this.row = row;
        this.col = col;
        this.color = color;
        this.id = "R";
    }

    public boolean isAttackValid(int row, int col) {
        return false;
    }

    public boolean isMoveValid(int row, int col) {
        return false;
    }
}

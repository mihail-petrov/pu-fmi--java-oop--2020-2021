package piece;

import java.awt.*;

public class Bishop extends Piece {

    public Bishop(int row, int col, Color color) {
        this.row    = row;
        this.col    = col;
        this.color  = color;
        this.id     = "B";
    }

    @Override
    public boolean isMoveValid(int moveRow, int moveCol) {
        return false;
    }

    @Override
    public boolean isAttackValid(int attackRow, int attackCol) {
        return false;
    }
}

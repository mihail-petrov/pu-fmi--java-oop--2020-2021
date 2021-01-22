package piece;

import java.awt.*;

public class King extends Piece {

    public King(int row, int col, Color color) {
        this.row    = row;
        this.col    = col;
        this.color  = color;
        this.id     = "K";
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
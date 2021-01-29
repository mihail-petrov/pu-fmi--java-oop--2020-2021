package piece;

import java.awt.*;

public class Queen extends Piece {

    public Queen(int row, int col, Color color) {
        this.row    = row;
        this.col    = col;
        this.color  = color;
        this.id     = "Q";
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
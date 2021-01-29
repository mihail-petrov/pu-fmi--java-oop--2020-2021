package piece;

import java.awt.*;

public class Knight extends Piece {

    public Knight(int row, int col, Color color) {
        super(row, col, color, "Kn");

//        this.row    = row;
//        this.col    = col;
//        this.color  = color;
//        this.id     = "Kn";
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
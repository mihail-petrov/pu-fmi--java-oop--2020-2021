package piece;

import java.awt.*;

public class Queen extends Piece {

    public Queen(int row, int col, Color color) {
        super(row, col, color, "Q");
    }

    @Override
    public boolean isMoveValid(int moveRow, int moveCol) {
        return true;
    }

    @Override
    public boolean isAttackValid(int attackRow, int attackCol) {
        return this.isMoveValid(attackRow, attackCol);
    }
}
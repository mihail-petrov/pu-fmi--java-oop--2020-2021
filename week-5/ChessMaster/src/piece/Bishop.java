package piece;

import java.awt.*;

public class Bishop extends Piece {

    public Bishop(int row, int col, Color color) {
        super(row, col, color, "B");
    }

    @Override
    public boolean isMoveValid(int moveRow, int moveCol) {

        int rowCoefficient = moveRow - this.row;
        int colCoefficient = moveCol - this.col;

        boolean isDynamicByRow          = rowCoefficient != 0;
        boolean isDynamicByCol          = colCoefficient != 0;
        boolean isDynamicCoefficientSame = rowCoefficient == colCoefficient;

        return  isDynamicByRow &&
                isDynamicByCol &&
                isDynamicCoefficientSame;
    }

    @Override
    public boolean isAttackValid(int attackRow, int attackCol) {
        return this.isMoveValid(attackRow, attackCol);
    }
}

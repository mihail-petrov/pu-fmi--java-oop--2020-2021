package piece;

import java.awt.*;

public class King extends Piece {

    public King(int row, int col, Color color) {
        super(row, col, color, "K");
    }

    @Override
    public boolean isMoveValid(int moveRow, int moveCol) {

        int rowCoefficient = moveRow - this.row;
        int colCoefficient = moveCol - this.col;

        boolean isDynamicByRow          = rowCoefficient == 1;
        boolean isDynamicByCol          = colCoefficient == 1;
        boolean isDynamicByDiagonal     = isDynamicByRow && isDynamicByCol;

        return  isDynamicByRow ||
                isDynamicByCol  ||
                isDynamicByDiagonal;
    }

    @Override
    public boolean isAttackValid(int attackRow, int attackCol) {
        return this.isMoveValid(attackRow, attackCol);
    }
}
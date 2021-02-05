package piece;

import java.awt.*;

public class Rook extends Piece {

    public Rook(int row, int col, Color color) {
        super(row, col, color, "R");
    }

    public boolean isMoveValid(int moveRow, int moveCol) {


        int rowCoefficient = moveRow - this.row;
        int colCoefficient = moveCol - this.col;

        boolean isStaticByRow   = rowCoefficient == 0;
        boolean isStaticByCol   = colCoefficient == 0;
        boolean isDynamicByRow  = rowCoefficient != 0;
        boolean isDynamicByCol  = colCoefficient != 0;

        boolean isMovableByRow  =   isDynamicByRow &&
                isStaticByCol;

        boolean isMovableByCol  =   isStaticByRow &&
                isDynamicByCol;

        return  isMovableByRow ||
                isMovableByCol;
    }

    public boolean isAttackValid(int moveRow, int moveCol) {
        return this.isMoveValid(moveRow, moveCol);
    }
}

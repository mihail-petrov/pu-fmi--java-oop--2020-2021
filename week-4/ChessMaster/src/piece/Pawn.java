package piece;

import game.GameTile;

import java.awt.*;

public class Pawn extends Piece {

    public Pawn(int row, int col, Color color) {
        super(row, col, color, "P");
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
}

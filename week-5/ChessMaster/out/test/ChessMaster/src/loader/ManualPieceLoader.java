package loader;

import game.GameBoard;
import piece.*;

import java.awt.*;

public class ManualPieceLoader {

    public Piece[][] load() {

        Piece[][] pieceCollection = new Piece[GameBoard.TILE_SIDE_COUNT][GameBoard.TILE_SIDE_COUNT];

        // White
        pieceCollection[0][0] = (new Rook(0, 0, Color.YELLOW));
        pieceCollection[0][1] = (new Knight(0, 1, Color.YELLOW));
        pieceCollection[0][2] = (new Bishop(0, 2, Color.YELLOW));
        pieceCollection[0][3] = (new King(0, 3, Color.YELLOW));
        pieceCollection[0][4] = (new Queen(0, 4, Color.YELLOW));
        pieceCollection[0][5] = (new Bishop(0, 5, Color.YELLOW));
        pieceCollection[0][6] = (new Knight(0, 6, Color.YELLOW));
        pieceCollection[0][7] = (new Rook(0, 7, Color.YELLOW));

        pieceCollection[1][0] = (new Pawn(1, 0, Color.YELLOW));
        pieceCollection[1][1] = (new Pawn(1, 1, Color.YELLOW));
        pieceCollection[1][2] = (new Pawn(1, 2, Color.YELLOW));
        pieceCollection[1][3] = (new Pawn(1, 3, Color.YELLOW));
        pieceCollection[1][4] = (new Pawn(1, 4, Color.YELLOW));
        pieceCollection[1][5] = (new Pawn(1, 5, Color.YELLOW));
        pieceCollection[1][6] = (new Pawn(1, 6, Color.YELLOW));
        pieceCollection[1][7] = (new Pawn(1, 7, Color.YELLOW));

        // Black
        pieceCollection[7][0] = (new Rook(7, 0, Color.BLUE));
        pieceCollection[7][1] = (new Knight(7, 1, Color.BLUE));
        pieceCollection[7][2] = (new Bishop(7, 2, Color.BLUE));
        pieceCollection[7][3] = (new King(7, 3, Color.BLUE));
        pieceCollection[7][4] = (new Queen(7, 4, Color.BLUE));
        pieceCollection[7][5] = (new Bishop(7, 5, Color.BLUE));
        pieceCollection[7][6] = (new Knight(7, 6, Color.BLUE));
        pieceCollection[7][7] = (new Rook(7, 7, Color.BLUE));

        pieceCollection[6][0] = (new Pawn(6, 0, Color.BLUE));
        pieceCollection[6][1] = (new Pawn(6, 1, Color.BLUE));
        pieceCollection[6][2] = (new Pawn(6, 2, Color.BLUE));
        pieceCollection[6][3] = (new Pawn(6, 3, Color.BLUE));
        pieceCollection[6][4] = (new Pawn(6, 4, Color.BLUE));
        pieceCollection[6][5] = (new Pawn(6, 5, Color.BLUE));
        pieceCollection[6][6] = (new Pawn(6, 6, Color.BLUE));
        pieceCollection[6][7] = (new Pawn(6, 7, Color.BLUE));

        return pieceCollection;
    }
}

package game;

import piece.*;
import java.awt.*;

public class GameBoard {

    public static final int TILE_SIDE_COUNT = 8;

    private Piece[][] pieceCollection;
    private Piece selectedPiece;

    public GameBoard(Piece[][] pieceCollection) {
        this.pieceCollection = pieceCollection;
    }

    public Piece getSelectedPiece() {
        return selectedPiece;
    }

    public void setSelectedPiece(Piece selectedPiece) {
        this.selectedPiece = selectedPiece;
    }

    public void movePiece(int row, int col, Piece p) {
        // 1. Get the original coordinates of the selected piece
        int initialRow = p.getRow();
        int initialCol = p.getCol();

        // 2. Move the piece to trhe new coordinates
        p.move(row, col);

        // 3. Swap the reference to the selected piece from the original coordinates
        // TODO: Abstraction of piece collection
        this.pieceCollection[p.getRow()][p.getCol()] = this.selectedPiece;
        this.pieceCollection[initialRow][initialCol] = null;

        // 4. Remove reference to selected piece
        // TODO: Abstraction of selected piece access
        this.selectedPiece = null;
    }

    private Color getTileColor(int row, int col) {

        boolean isRowEven  = (row % 2 == 0);
        boolean isRowOdd   = !isRowEven;
        boolean isColEven  = (col % 2 == 0);
        boolean isColOdd   = !isColEven;

        if(isRowEven && isColEven   ) return Color.BLACK;
        if(isRowEven && isColOdd    ) return Color.WHITE;
        if(isRowOdd  && isColEven   ) return Color.WHITE;

        return Color.BLACK;
    }


    public void renderGameTile(Graphics g, int row, int col) {

        Color tileColor = this.getTileColor(row, col);
        GameTile tile = new GameTile(row, col, tileColor);
        tile.render(g);
    }

    public Piece getBoardPiece(int row, int col) {
        return this.pieceCollection[row][col];
    }

    public boolean hasBoardPiece(int row, int col) {
        return this.getBoardPiece(row, col) != null;
    }

    public void renderGamePiece(Graphics g, int row, int col) {

        if(this.hasBoardPiece(row, col)) {

            Piece p = this.getBoardPiece(row, col);
            p.render(g);
        }
    }

    public int getBoardDimentionBasedOnCoordinates(int coordinates) {
        return coordinates / GameTile.TILE_SIZE;
    }
}

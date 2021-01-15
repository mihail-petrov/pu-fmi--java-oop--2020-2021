package game;

import piece.Pawn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameBoard extends JFrame implements MouseListener {

    public static final int TILE_SIDE_COUNT = 8;

    private Object[][] pieceCollection;
    private Object selectedPiece;

    public GameBoard() {

        this.pieceCollection = new Object[TILE_SIDE_COUNT][TILE_SIDE_COUNT];

        // White
        this.pieceCollection[1][0] = (new Pawn(1, 0, Color.YELLOW));
        this.pieceCollection[1][1] = (new Pawn(1, 1, Color.YELLOW));
        this.pieceCollection[1][2] = (new Pawn(1, 2, Color.YELLOW));
        this.pieceCollection[1][3] = (new Pawn(1, 3, Color.YELLOW));
        this.pieceCollection[1][4] = (new Pawn(1, 4, Color.YELLOW));
        this.pieceCollection[1][5] = (new Pawn(1, 5, Color.YELLOW));
        this.pieceCollection[1][6] = (new Pawn(1, 6, Color.YELLOW));
        this.pieceCollection[1][7] = (new Pawn(1, 7, Color.YELLOW));

        // Black
        this.pieceCollection[6][0] = (new Pawn(6, 0, Color.BLUE));
        this.pieceCollection[6][1] = (new Pawn(6, 1, Color.BLUE));
        this.pieceCollection[6][2] = (new Pawn(6, 2, Color.BLUE));
        this.pieceCollection[6][3] = (new Pawn(6, 3, Color.BLUE));
        this.pieceCollection[6][4] = (new Pawn(6, 4, Color.BLUE));
        this.pieceCollection[6][5] = (new Pawn(6, 5, Color.BLUE));
        this.pieceCollection[6][6] = (new Pawn(6, 6, Color.BLUE));
        this.pieceCollection[6][7] = (new Pawn(6, 7, Color.BLUE));

        this.setSize(800, 800);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        int row = this.getBoardDimentionBasedOnCoordinates(e.getY());
        int col = this.getBoardDimentionBasedOnCoordinates(e.getX());

        // check if piece is already selected
        if(this.selectedPiece != null) {

            // TODO: Update pieceCollection array in order to match the new coordinates
            Pawn p = (Pawn)this.selectedPiece;
            p.move(row, col);
            this.selectedPiece = null;
            // this.pieceCollection[row][col]                   = this.selectedPiece
            // this.pieceCollection[pOriginalRow][pOriginalCol] = null;
            this.repaint();
        }
        // * move

        // check if piece is available
        if(this.hasBoardPiece(row, col)) {
            this.selectedPiece = this.getBoardPiece(row, col);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void paint(Graphics g) {

        for(int row = 0; row < 8; row++) {
            for(int col = 0; col < 8; col++) {

                this.renderGameTile(g, row, col);
                this.renderGamePiece(g, row, col);
            }
        }
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


    private void renderGameTile(Graphics g, int row, int col) {

        Color tileColor = this.getTileColor(row, col);
        GameTile tile = new GameTile(row, col, tileColor);
        tile.render(g);
    }

    private Object getBoardPiece(int row, int col) {
        return this.pieceCollection[row][col];
    }

    private boolean hasBoardPiece(int row, int col) {
        return this.getBoardPiece(row, col) != null;
    }

    private void renderGamePiece(Graphics g, int row, int col) {

        if(this.hasBoardPiece(row, col)) {

            Pawn p = (Pawn)this.getBoardPiece(row, col);
            p.render(g);
        }
    }

    private int getBoardDimentionBasedOnCoordinates(int coordinates) {
        return coordinates / GameTile.TILE_SIZE;
    }

}

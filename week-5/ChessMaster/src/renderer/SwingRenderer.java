package renderer;

import game.GameBoard;
import piece.Piece;
import ui.Modal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SwingRenderer extends JFrame implements MouseListener {

    GameBoard gameBoardLogic;

    public SwingRenderer(GameBoard gameBoardLogic) {

        // Reference to game logic
        this.gameBoardLogic = gameBoardLogic;

        // Reference to UI logic
        this.setSize(800, 800);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        int row = this.gameBoardLogic.getBoardDimentionBasedOnCoordinates(e.getY());
        int col = this.gameBoardLogic.getBoardDimentionBasedOnCoordinates(e.getX());

        // check if piece is already selected
        if(this.gameBoardLogic.getSelectedPiece() != null) {

            // TODO: Update pieceCollection array in order to match the new coordinates
            Piece p = this.gameBoardLogic.getSelectedPiece();

            if(p.isMoveValid(row, col)) {

                this.gameBoardLogic.movePiece(row, col, p);
                this.repaint();
                return;
            }
            else {
                // new Modal(this, "Внимание", "Невалиден ход, по дъската");
                Modal.render(this, "Внимание", "Невалиден ход, по дъската");
                return;
            }
        }

        // * move

        // check if piece is available
        if(this.gameBoardLogic.hasBoardPiece(row, col)) {
            this.gameBoardLogic.setSelectedPiece(this.gameBoardLogic.getBoardPiece(row, col));
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

                this.gameBoardLogic.renderGameTile(g, row, col);
                this.gameBoardLogic.renderGamePiece(g, row, col);
            }
        }
    }
}

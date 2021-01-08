package game;

import piece.Pawn;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GameBoard extends JFrame {

    private ArrayList<Object> pieceCollection;

    public GameBoard() {

        this.pieceCollection = new ArrayList<>();

        // White
        this.pieceCollection.add(new Pawn(1, 0));
        this.pieceCollection.add(new Pawn(1, 1));
        this.pieceCollection.add(new Pawn(1, 2));
        this.pieceCollection.add(new Pawn(1, 3));
        this.pieceCollection.add(new Pawn(1, 4));
        this.pieceCollection.add(new Pawn(1, 5));
        this.pieceCollection.add(new Pawn(1, 6));
        this.pieceCollection.add(new Pawn(1, 7));

        // Black
        this.pieceCollection.add(new Pawn(6, 0));
        this.pieceCollection.add(new Pawn(6, 1));
        this.pieceCollection.add(new Pawn(6, 2));
        this.pieceCollection.add(new Pawn(6, 3));
        this.pieceCollection.add(new Pawn(6, 4));
        this.pieceCollection.add(new Pawn(6, 5));
        this.pieceCollection.add(new Pawn(6, 6));
        this.pieceCollection.add(new Pawn(6, 7));

        this.setSize(800, 800);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // JFrame applicationFrame = new JFrame();
        // applicationFrame.setSize(500, 500);
        // applicationFrame.setVisible(true);
        // applicationFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {

        super.paint(g);

        for(int row = 0; row < 8; row++) {
            for(int col = 0; col < 8; col++) {

                GameTile tile = new GameTile(row, col);
                tile.render(g);

                Pawn p1 = new Pawn(row, col);
                p1.render(g);
            }
        }
    }
}

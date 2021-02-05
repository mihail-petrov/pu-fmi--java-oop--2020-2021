package piece;

import game.GameTile;

import java.awt.*;

public abstract class Piece {

    protected int row;
    protected int col;
    protected Color color;
    protected int point;
    protected String id;

    public Piece(int row, int col, Color color, String id) {

        this.row = row;
        this.col = col;
        this.color = color;
        this.id = id;
    }


    public Piece(int row, int col) {
        this(row, col, Color.BLACK, "P");
        //this.row = row;
        //this.col = col;
        this.point = 10;
    }

    public Piece(int row, int col, Color color) {

        this.row = row;
        this.col = col;
        this.color = color;
    }



    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void move(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void render(Graphics g) {

        int x = this.col * GameTile.TILE_SIZE;
        int y = this.row * GameTile.TILE_SIZE;

        g.setColor(this.color);
        g.fillRect(x, y, 50, 50);

        g.setColor(Color.BLACK);
        g.drawString(this.id, x + 25, y + 25);
    }

    public abstract boolean isMoveValid(int moveRow, int moveCol);

    public abstract boolean isAttackValid(int attackRow, int attackCol);

    // extract Move method
    // * diagonal
    // * row (line)
    // * col (line)
    // * single squere

}

package game;

import java.awt.*;

public class GameTile {

    public static final int TILE_SIZE = 100;

    private int row;
    private int col;
    private Color color;

    public GameTile(int row, int col, Color color) {

        this.row        = row;
        this.col        = col;
        this.color      = color;
    }

    public void render(Graphics g) {

        int tileX = this.col * TILE_SIZE;
        int tileY = this.row * TILE_SIZE;

        g.setColor(this.color);
        g.fillRect(tileX, tileY, TILE_SIZE, TILE_SIZE);
    }
}

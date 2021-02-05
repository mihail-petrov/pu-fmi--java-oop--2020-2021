import game.GameBoard;
import loader.ManualPieceLoader;
import renderer.SwingRenderer;

public class Application {

    public static void main(String[] args) {

        ManualPieceLoader loader = new ManualPieceLoader();
        GameBoard gameBoard     = new GameBoard(loader.load());
        SwingRenderer renderer  = new SwingRenderer(gameBoard);
    }
}

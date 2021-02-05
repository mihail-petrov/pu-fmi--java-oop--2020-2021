import game.GameBoard;
import loader.ManualPieceLoader;
import renderer.SwingRenderer;
import test.BishopTest;
import test.RookTest;
import test.Test;
import test.TestRunner;

public class Application {

    public static void main(String[] args) {

        // ManualPieceLoader loader = new ManualPieceLoader();
        // GameBoard gameBoard     = new GameBoard(loader.load());
        // SwingRenderer renderer  = new SwingRenderer(gameBoard);

        TestRunner runner = new TestRunner(new Test[] {
           new RookTest(), new BishopTest()
        });

        runner.execute();

    }
}

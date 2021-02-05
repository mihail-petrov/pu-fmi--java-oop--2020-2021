import org.junit.Assert;
import org.junit.Test;
import piece.Rook;

import java.awt.*;

public class RookTest {

    @Test
    public void testIfRookPieceMoveAccordingToTheMoveRules() {

        // Arrange
        Rook rookPiece = new Rook(7, 0, Color.BLUE);
        // Act
        boolean isMoveValid = rookPiece.isMoveValid(1, 0);

        Assert.assertTrue("Expected value is true", isMoveValid);
    }
}

package test;

import piece.Bishop;

import java.awt.*;

public class BishopTest extends Test {

    private void testIfBishopPieceMoveAccordingToTheMoveRules() {

        // Arange
        Bishop bishopPiece = new Bishop(7, 2, Color.BLACK);

        // Act
        boolean isMoveValid = bishopPiece.isMoveValid(6, 3);

        assertIsTrue(isMoveValid, "Success", "Expected true value");
    }


    @Override
    public void execute() {

    }
}

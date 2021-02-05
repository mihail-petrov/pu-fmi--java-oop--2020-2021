package test;

import piece.Rook;

import java.awt.*;
import java.lang.reflect.Method;

public class RookTest extends Test {

    private void testIfRookPieceMoveAccordingToTheMoveRules() {

        // Arrange
        Rook rookPiece = new Rook(7, 0, Color.BLUE);
        // Act
        boolean isMoveValid = rookPiece.isMoveValid(1, 0);

        // Assert
//        String message = (isMoveValid) ? "Success" : "Expected value is true";
//        System.out.println("* testIfRookPieceMoveAccordingToTheMoveRules");
//        System.out.println(message);

        // Reflection
        System.out.println(RookTest.class.getDeclaredMethods()[1].getName());

        display();
        assertIsTrue(isMoveValid, "Success", "Expected value is true");
    }

    private void testIfRookPieceDoesNoteMOveAccordingToTheMoveRules() {

        // Arrange
        Rook rookPiece = new Rook(7, 0, Color.BLUE);
        // Act
        boolean isMoveValid = rookPiece.isMoveValid(1, 1);

        // Assert
//        System.out.println("* testIfRookPieceDoesNoteMOveAccordingToTheMoveRules");
//        String message = (!isMoveValid) ? "Success" : "Expected value is false";
//        System.out.println(message);

        assertIsFalse(isMoveValid, "Success", "Expected value is false");
    }

    public void execute() {
        testIfRookPieceMoveAccordingToTheMoveRules();
        testIfRookPieceDoesNoteMOveAccordingToTheMoveRules();
    }
}

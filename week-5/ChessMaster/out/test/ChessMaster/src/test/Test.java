package test;

public abstract class Test {

    public void assertIsTrue(boolean expression,
                                String messageOnSuccess,
                                String messageOnFail) {

        String message = (expression) ? messageOnSuccess : messageOnFail;
        // System.out.println("* testIfRookPieceMoveAccordingToTheMoveRules");
        System.out.println(message);
    }


    public void assertIsFalse(boolean expression,
                              String messageOnSuccess,
                              String messageOnFail) {

        String message = (!expression) ? messageOnSuccess : messageOnFail;
        System.out.println(message);
    }

    public void display() {
        // TODO: logic for rendering of method name
    }

    public abstract void execute();
}

package test;

public class TestRunner {

    private Test[] testCollection;

    public TestRunner(Test[] testCollection) {
        this.testCollection = testCollection;
    }

    public void execute() {

        for(int i = 0; i < this.testCollection.length; i++) {
            this.testCollection[i].execute();
        }
    }
}

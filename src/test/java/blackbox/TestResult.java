package blackbox;

public class TestResult {
    public boolean passed;
    public String input;
    public String expect;
    public String got;

    public TestResult(boolean passed, String expect, String got, String input) {
        this.passed = passed;
        this.expect = expect;
        this.input = input;
        this.got = got;
    }
}

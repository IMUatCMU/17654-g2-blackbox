import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestData {

    public String expectResult;
    public int runCount;
    public String input;

    public TestData(Object[] param) {
        this.expectResult = (String)param[0];
        this.runCount = (int)param[1];

        List<String> p = new ArrayList<>();
        for (int i = 2; i < param.length; i++) {
            if (param[i].toString().length() > 0) {
                p.add(param[i].toString());
            }
        }
        this.input = p.stream().map(s -> {
            if (s.equals("Odd")) {
                return "No";
            } else if (s.equals("Even")) {
                return "Yes";
            } else {
                return s;
            }
        }).collect(Collectors.joining(","));
    }

    public String toString() {
        return "[Expect:" + this.expectResult + ", Run:" + this.runCount + "] " + this.input;
    }
}

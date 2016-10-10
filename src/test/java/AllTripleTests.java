import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AllTripleTests {

    private List<TestData> data = new ArrayList<>();

    @Before
    public void setup() {
        System.setSecurityManager(new NoExitSecurityManager());
        for (Object[] each : Helper.allTripleTestParam) {
            data.add(new TestData(each));
        }
    }

    @Test
    public void printAll() {
        data.forEach(testData -> System.out.println(testData.input));
    }

    @Test
    public void testAllTriples() {
        Helper.executeTest(data);
    }
}

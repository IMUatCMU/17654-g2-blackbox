package blackbox;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by davidiamyou on 2016-10-09.
 */
public class AllPairTests {
    private List<TestData> data = new ArrayList<>();

    @Before
    public void setup() {
        System.setSecurityManager(new NoExitSecurityManager());
        for (Object[] each : Helper.allPairTestParam) {
            data.add(new TestData(each));
        }
    }

    @Test
    public void testAllPairs() {
        Helper.executeTest(data);
    }
}

package blackbox;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AllSingleFlattenedTests {

    private List<TestData> data = new ArrayList<>();

    @Before
    public void setup() {
        System.setSecurityManager(new NoExitSecurityManager());
        for (Object[] each : Helper.allSingleTestParam) {
            data.add(new TestData(each));
        }
    }

    @After
    public void clean() {
        data = new ArrayList<>();
        System.setSecurityManager(null);
    }

    @Test
    public void testAllSingles0() {
        TestData d = data.get(0);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllSingles1() {
        TestData d = data.get(1);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllSingles2() {
        TestData d = data.get(2);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllSingles3() {
        TestData d = data.get(3);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllSingles4() {
        TestData d = data.get(4);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllSingles5() {
        TestData d = data.get(5);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllSingles6() {
        TestData d = data.get(6);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllSingles7() {
        TestData d = data.get(7);
        Helper.executeTestWithAssert(d);
    }
}

package blackbox;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AllPairFlattenedTests {

    private List<TestData> data = new ArrayList<>();

    @Before
    public void setup() {
        System.setSecurityManager(new NoExitSecurityManager());
        for (Object[] each : Helper.allPairTestParam) {
            data.add(new TestData(each));
        }
    }

    @After
    public void clean() {
        data = new ArrayList<>();
        System.setSecurityManager(null);
    }

    @Test
    public void testAllPairs0() {
        TestData d = data.get(0);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllPairs1() {
        TestData d = data.get(1);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllPairs2() {
        TestData d = data.get(2);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllPairs3() {
        TestData d = data.get(3);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllPairs4() {
        TestData d = data.get(4);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllPairs5() {
        TestData d = data.get(5);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllPairs6() {
        TestData d = data.get(6);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllPairs7() {
        TestData d = data.get(7);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllPairs8() {
        TestData d = data.get(8);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllPairs9() {
        TestData d = data.get(9);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllPairs10() {
        TestData d = data.get(10);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllPairs11() {
        TestData d = data.get(11);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllPairs12() {
        TestData d = data.get(12);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllPairs13() {
        TestData d = data.get(13);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllPairs14() {
        TestData d = data.get(14);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllPairs15() {
        TestData d = data.get(15);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllPairs16() {
        TestData d = data.get(16);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllPairs17() {
        TestData d = data.get(17);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllPairs18() {
        TestData d = data.get(18);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllPairs19() {
        TestData d = data.get(19);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllPairs20() {
        TestData d = data.get(20);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllPairs21() {
        TestData d = data.get(21);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllPairs22() {
        TestData d = data.get(22);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllPairs23() {
        TestData d = data.get(23);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllPairs24() {
        TestData d = data.get(24);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllPairs25() {
        TestData d = data.get(25);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllPairs26() {
        TestData d = data.get(26);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllPairs27() {
        TestData d = data.get(27);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllPairs28() {
        TestData d = data.get(28);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllPairs29() {
        TestData d = data.get(29);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllPairs30() {
        TestData d = data.get(30);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllPairs31() {
        TestData d = data.get(31);
        Helper.executeTestWithAssert(d);
    }
}

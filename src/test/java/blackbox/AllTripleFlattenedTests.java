package blackbox;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AllTripleFlattenedTests {

    private List<TestData> data = new ArrayList<>();

    @Before
    public void setup() {
        System.setSecurityManager(new NoExitSecurityManager());
        for (Object[] each : Helper.allTripleTestParam) {
            data.add(new TestData(each));
        }
    }

    @After
    public void clean() {
        data = new ArrayList<>();
        System.setSecurityManager(null);
    }

    @Test
    public void testAllTriples0() {
        TestData d = data.get(0);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples1() {
        TestData d = data.get(1);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples2() {
        TestData d = data.get(2);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples3() {
        TestData d = data.get(3);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples4() {
        TestData d = data.get(4);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples5() {
        TestData d = data.get(5);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples6() {
        TestData d = data.get(6);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples7() {
        TestData d = data.get(7);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples8() {
        TestData d = data.get(8);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples9() {
        TestData d = data.get(9);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples10() {
        TestData d = data.get(10);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples11() {
        TestData d = data.get(11);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples12() {
        TestData d = data.get(12);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples13() {
        TestData d = data.get(13);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples14() {
        TestData d = data.get(14);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples15() {
        TestData d = data.get(15);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples16() {
        TestData d = data.get(16);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples17() {
        TestData d = data.get(17);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples18() {
        TestData d = data.get(18);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples19() {
        TestData d = data.get(19);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples20() {
        TestData d = data.get(20);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples21() {
        TestData d = data.get(21);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples22() {
        TestData d = data.get(22);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples23() {
        TestData d = data.get(23);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples24() {
        TestData d = data.get(24);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples25() {
        TestData d = data.get(25);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples26() {
        TestData d = data.get(26);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples27() {
        TestData d = data.get(27);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples28() {
        TestData d = data.get(28);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples29() {
        TestData d = data.get(29);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples30() {
        TestData d = data.get(30);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples31() {
        TestData d = data.get(31);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples32() {
        TestData d = data.get(32);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples33() {
        TestData d = data.get(33);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples34() {
        TestData d = data.get(34);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples35() {
        TestData d = data.get(35);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples36() {
        TestData d = data.get(36);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples37() {
        TestData d = data.get(37);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples38() {
        TestData d = data.get(38);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples39() {
        TestData d = data.get(39);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples40() {
        TestData d = data.get(40);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples41() {
        TestData d = data.get(41);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples42() {
        TestData d = data.get(42);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples43() {
        TestData d = data.get(43);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples44() {
        TestData d = data.get(44);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples45() {
        TestData d = data.get(45);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples46() {
        TestData d = data.get(46);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples47() {
        TestData d = data.get(47);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples48() {
        TestData d = data.get(48);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples49() {
        TestData d = data.get(49);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples50() {
        TestData d = data.get(50);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples51() {
        TestData d = data.get(51);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples52() {
        TestData d = data.get(52);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples53() {
        TestData d = data.get(53);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples54() {
        TestData d = data.get(54);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples55() {
        TestData d = data.get(55);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples56() {
        TestData d = data.get(56);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples57() {
        TestData d = data.get(57);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples58() {
        TestData d = data.get(58);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples59() {
        TestData d = data.get(59);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples60() {
        TestData d = data.get(60);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples61() {
        TestData d = data.get(61);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples62() {
        TestData d = data.get(62);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples63() {
        TestData d = data.get(63);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples64() {
        TestData d = data.get(64);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples65() {
        TestData d = data.get(65);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples66() {
        TestData d = data.get(66);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples67() {
        TestData d = data.get(67);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples68() {
        TestData d = data.get(68);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples69() {
        TestData d = data.get(69);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples70() {
        TestData d = data.get(70);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples71() {
        TestData d = data.get(71);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples72() {
        TestData d = data.get(72);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples73() {
        TestData d = data.get(73);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples74() {
        TestData d = data.get(74);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples75() {
        TestData d = data.get(75);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples76() {
        TestData d = data.get(76);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples77() {
        TestData d = data.get(77);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples78() {
        TestData d = data.get(78);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples79() {
        TestData d = data.get(79);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples80() {
        TestData d = data.get(80);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples81() {
        TestData d = data.get(81);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples82() {
        TestData d = data.get(82);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples83() {
        TestData d = data.get(83);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples84() {
        TestData d = data.get(84);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples85() {
        TestData d = data.get(85);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples86() {
        TestData d = data.get(86);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples87() {
        TestData d = data.get(87);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples88() {
        TestData d = data.get(88);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples89() {
        TestData d = data.get(89);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples90() {
        TestData d = data.get(90);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples91() {
        TestData d = data.get(91);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples92() {
        TestData d = data.get(92);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples93() {
        TestData d = data.get(93);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples94() {
        TestData d = data.get(94);
        Helper.executeTestWithAssert(d);
    }


    @Test
    public void testAllTriples95() {
        TestData d = data.get(95);
        Helper.executeTestWithAssert(d);
    }
}

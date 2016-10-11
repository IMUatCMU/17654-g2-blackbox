package whitebox;

import analysis.ShapeClassifier;
import blackbox.NoExitSecurityManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class WhiteboxTests {

    private ShapeClassifier classifier;

    @Before
    public void setup() {
        System.setSecurityManager(new NoExitSecurityManager());
        classifier = new ShapeClassifier();
    }

    @After
    public void testDown() {
        System.setSecurityManager(null);
    }

    @Test
    public void path1() {
        assertEquals("Yes", classifier.evaluateGuess("Equilateral,Large,Yes,222,222,222"));
    }

    @Test
    public void path2() {
        assertEquals("Yes", classifier.evaluateGuess("Equilateral,Large,Yes,222,222,222"));
    }

    @Test
    public void path3() {
        assertEquals("Yes", classifier.evaluateGuess("Equilateral,Large,Yes,222,222,222"));
    }

    @Test
    public void path4() {
        assertEquals("Yes", classifier.evaluateGuess("Equilateral,Large,Yes,222,222,222"));
    }

    @Test
    public void path5() {
        assertEquals("Yes", classifier.evaluateGuess("Ellipse,Large,Yes,222,224"));
    }

    @Test
    public void path6() {
        assertEquals("Yes", classifier.evaluateGuess("Line,Large,Yes,222"));
    }

    @Test
    public void path7() {
        assertEquals("No", classifier.evaluateGuess("Heart,Large,Yes,222"));
    }

    @Test
    public void path8() {
        assertEquals("No", classifier.evaluateGuess("Line,Large,Yes,"));
    }

    @Test
    public void path9() {
        assertEquals("Yes", classifier.evaluateGuess("Rectangle,Large,Yes,300,200,300,200"));
    }

    @Test
    public void path10() {
        assertEquals("Yes", classifier.evaluateGuess("Square,Large,Yes,222,222,222,222"));
    }

    @Test
    public void path11() {
        assertEquals("Yes", classifier.evaluateGuess("Circle,Large,Yes,222,222"));
    }

    @Test
    public void path12() {
        assertEquals("No", classifier.evaluateGuess("Isosceles,Large,Yes,222,223,224"));
    }

    @Test
    public void path13() {
        assertEquals("Yes", classifier.evaluateGuess("Equilateral,Small,Yes,2,2,2"));
    }

    @Test
    public void path14() {
        assertEquals("No", classifier.evaluateGuess("Equilateral,Small,Yes,222,222,222"));
    }

    @Test
    public void path15() {
        assertEquals("Yes", classifier.evaluateGuess("Equilateral,Small,No,3,3,3"));
    }

    @Test
    public void path16() {
        assertEquals("No", classifier.evaluateGuess("Equilateral,Small,Yes,3,3,3"));
    }

    @Test
    public void path17() {
        assertEquals("Yes", classifier.evaluateGuess("Scalene,Large,Yes,202,203,204"));
    }

    // Path 18
    @Test
    public void systemExitWithSelectedStatusCode1() {
        try {
            classifier.evaluateGuess("Equilateral,Large,No,222,222,222");
            classifier.evaluateGuess("Equilateral,Large,No,222,222,222");
            classifier.evaluateGuess("Equilateral,Large,No,222,222,222");
        } catch (NoExitSecurityManager.ExitException ex) {
            return;
        }
        fail("Should have exited!");
    }
}

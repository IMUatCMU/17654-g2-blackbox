import analysis.ShapeClassifier;

import java.util.ArrayList;
import java.util.List;

public class Helper {

    public static void executeTest(List<TestData> data) {
        List<TestResult> results = new ArrayList<>();

        data.forEach(testData -> {
            ShapeClassifier sc = new ShapeClassifier();
            try {
                for (int i = 0; i < testData.runCount; i++) {
                    String result = sc.evaluateGuess(testData.input);
                    if ("Msg".equals(testData.expectResult)) {
                        continue;
                    }

                    // Compare
                    if (!result.equals(testData.expectResult)) {
                        throw new MismatchResultException(result);
                    }
                }

                // should have exited, but didn't
                if (testData.expectResult.equals("Msg")) {
                    results.add(new TestResult(false, testData.expectResult, "didn't exit", testData.input));
                }
                // success
                else {
                    results.add(new TestResult(true, testData.expectResult, testData.expectResult, testData.input));
                }

                return;
            } catch (NoExitSecurityManager.ExitException ex) {

                // expect exit, and did
                if (testData.expectResult.equals("Msg")) {
                    results.add(new TestResult(true, testData.expectResult, testData.expectResult, testData.input));
                }

                // didn't expect exit, but did
                else {
                    results.add(new TestResult(false, testData.expectResult, "Exit", testData.input));
                }
                return;
            } catch (MismatchResultException ex2) {

                // result does not match expectation
                results.add(new TestResult(false, testData.expectResult, ex2.result, testData.input));
                return;
            }
        });

        System.out.println("Ran: " + data.size());
        System.out.println("Got results: " + results.size());
        System.out.println("Success: " + results.stream().filter(testResult -> testResult.passed).count());
        System.out.println("Failed: " + results.stream().filter(testResult -> !testResult.passed).count());
        results.stream()
                .filter(testResult -> !testResult.passed)
                .map(testResult -> "[Expect: " + testResult.expect + " Got: " + testResult.got + "] " + testResult.input)
                .forEach(System.out::println);
    }

    public static final Object[][] allSingleTestParam = new Object[][]{
            {"Yes", 3, "Equilateral", "Large", "Odd", "4095", "4095", "4095", ""},
            {"Yes", 1, "Isosceles", "Large", "Odd", "4093", "4093", "4095", ""},
            {"Yes", 2, "Rectangle", "Large", "Odd", "4093", "4095", "4093", "4095"},
            {"Msg", 3, "Circle", "Large", "Even", "4094", "", "", ""},
            {"No", 1, "Ellipse", "Large", "Odd", "4092", "4094", "", ""},
            {"Msg", 3, "Scalene", "Large", "Even", "4091", "4093", "4095", ""},
            {"No", 2, "Line", "Small", "Odd", "4095", "", "", ""},
            {"Msg", 3, "Square", "Large", "Odd", "1", "1", "1", "1"},
    };

    public static final Object[][] allPairTestParam = new Object[][]{
            {"Yes", 3, "Circle", "Large", "Even", "4094", "4094", "", ""},
            {"No", 2, "Circle", "Large", "Even", "4094", "", "", ""},
            {"Msg", 3, "Circle", "Small", "Odd", "2", "2", "", ""},
            {"No", 1, "Circle", "Small", "Odd", "4095", "4095", "", ""},
            {"Yes", 1, "Ellipse", "Large", "Even", "4094", "4092", "", ""},
            {"Msg", 3, "Ellipse", "Large", "Odd", "4095", "", "", ""},
            {"No", 1, "Ellipse", "Small", "Even", "1", "3", "", ""},
            {"No", 2, "Ellipse", "Small", "Odd", "4093", "4095", "", ""},
            {"Yes", 2, "Equilateral", "Large", "Odd", "4095", "4095", "4095", ""},
            {"No", 1, "Equilateral", "Large", "Odd", "4095", "", "", ""},
            {"Msg", 3, "Equilateral", "Large", "Even", "4095", "4095", "4095", ""},
            {"Msg", 3, "Equilateral", "Small", "Even", "4094", "4094", "4094", ""},
            {"Yes", 2, "Isosceles", "Large", "Odd", "4093", "4093", "4095", ""},
            {"No", 1, "Isosceles", "Small", "Odd", "1", "", "", ""},
            {"Msg", 3, "Isosceles", "Large", "Even", "4093", "4093", "4095", ""},
            {"Msg", 3, "Isosceles", "Small", "Even", "4094", "4094", "4095", ""},
            {"Yes", 2, "Line", "Small", "Odd", "1", "", "", ""},
            {"No", 1, "Line", "Small", "Even", "2", "2", "", ""},
            {"No", 2, "Line", "Large", "Odd", "4094", "", "", ""},
            {"Msg", 3, "Line", "Large", "Even", "2", "", "", ""},
            {"Yes", 2, "Rectangle", "Large", "Odd", "4093", "4095", "4093", "4095"},
            {"No", 1, "Rectangle", "Large", "Odd", "4095", "", "", ""},
            {"Msg", 3, "Rectangle", "Small", "Odd", "2", "4", "2", "4"},
            {"Msg", 3, "Rectangle", "Small", "Even", "4093", "4095", "4093", "4095"},
            {"Yes", 2, "Scalene", "Large", "Odd", "4091", "4093", "4095", ""},
            {"No", 1, "Scalene", "Large", "Even", "4094", "", "", ""},
            {"Msg", 3, "Scalene", "Small", "Even", "3", "5", "7", ""},
            {"Msg", 3, "Scalene", "Small", "Even", "4092", "4094", "4095", ""},
            {"Yes", 2, "Square", "Large", "Odd", "4095", "4095", "4095", "4095"},
            {"No", 1, "Square", "Large", "Odd", "4095", "", "", ""},
            {"Msg", 3, "Square", "Small", "Even", "1", "1", "1", "1"},
            {"Msg", 3, "Square", "Small", "Even", "4094", "4094", "4094", "4094"},


    };

    public static final Object[][] allTripleTestParam = new Object[][]{
            {"Yes", 1, "Ellipse", "Large", "Odd", "4093", "4095", "", ""},
            {"Yes", 2, "Ellipse", "Small", "Even", "2", "4", "", ""},
            {"Yes", 3, "Ellipse", "Large", "Even", "4094", "4092", "", ""},
            {"No", 1, "Ellipse", "Large", "Even", "4094", "4092", "4092", ""},
            {"No", 2, "Ellipse", "Small", "Odd", "1", "3", "3", ""},
            {"Msg", 3, "Ellipse", "Large", "Even", "4094", "4092", "4092", ""},
            {"No", 1, "Ellipse", "Small", "Even", "1", "3", "", ""},
            {"No", 2, "Ellipse", "Large", "Odd", "4094", "4092", "", ""},
            {"Msg", 3, "Ellipse", "Small", "Even", "1", "3", "", ""},
            {"No", 1, "Ellipse", "Small", "Odd", "4093", "4095", "", ""},
            {"No", 2, "Ellipse", "Large", "Even", "2", "4", "", ""},
            {"Msg", 3, "Ellipse", "Small", "Odd", "4093", "4095", "", ""},
            {"Yes", 1, "Equilateral", "Small", "Odd", "1", "1", "1", ""},
            {"Yes", 2, "Equilateral", "Large", "Even", "4094", "4094", "4094", ""},
            {"Yes", 3, "Equilateral", "Small", "Even", "2", "2", "2", ""},
            {"No", 1, "Equilateral", "Small", "Even", "2", "2", "", ""},
            {"No", 2, "Equilateral", "Large", "Odd", "4095", "4095", "", ""},
            {"Msg", 3, "Equilateral", "Small", "Even", "2", "2", "", ""},
            {"No", 1, "Equilateral", "Large", "Odd", "4094", "4094", "4094", ""},
            {"No", 2, "Equilateral", "Small", "Even", "1", "1", "1", ""},
            {"Msg", 3, "Equilateral", "Large", "Odd", "4094", "4094", "4094", ""},
            {"No", 1, "Equilateral", "Large", "Odd", "1", "1", "1", ""},
            {"No", 2, "Equilateral", "Small", "Even", "4094", "4094", "4094", ""},
            {"Msg", 3, "Equilateral", "Large", "Odd", "1", "1", "1", ""},
            {"Yes", 1, "Isosceles", "Large", "Odd", "4095", "4095", "4093", ""},
            {"Yes", 2, "Isosceles", "Small", "Even", "2", "2", "3", ""},
            {"Yes", 3, "Isosceles", "Large", "Even", "4094", "4094", "4092", ""},
            {"No", 1, "Isosceles", "Large", "Even", "4094", "4094", "", ""},
            {"No", 2, "Isosceles", "Small", "Odd", "3", "3", "", ""},
            {"Msg", 3, "Isosceles", "Large", "Even", "4094", "4094", "", ""},
            {"No", 1, "Isosceles", "Small", "Odd", "2", "2", "3", ""},
            {"No", 2, "Isosceles", "Large", "Even", "4093", "4093", "4095", ""},
            {"Msg", 3, "Isosceles", "Large", "Odd", "4094", "4094", "4093", ""},
            {"No", 1, "Isosceles", "Small", "Odd", "4093", "4093", "4095", ""},
            {"No", 2, "Isosceles", "Large", "Even", "2", "2", "3", ""},
            {"Msg", 3, "Isosceles", "Small", "Odd", "4093", "4093", "4095", ""},
            {"Yes", 1, "Line", "Large", "Even", "4094", "", "", ""},
            {"Yes", 2, "Line", "Small", "Odd", "1", "", "", ""},
            {"Yes", 3, "Line", "Large", "Odd", "4095", "", "", ""},
            {"No", 1, "Line", "Large", "Odd", "4095", "4095", "", ""},
            {"No", 2, "Line", "Small", "Even", "2", "2", "", ""},
            {"Msg", 3, "Line", "Large", "Even", "4094", "4094", "", ""},
            {"No", 1, "Line", "Small", "Odd", "2", "", "", ""},
            {"No", 2, "Line", "Large", "Even", "4095", "", "", ""},
            {"Msg", 3, "Line", "Small", "Odd", "2", "", "", ""},
            {"No", 1, "Line", "Small", "Even", "4094", "", "", ""},
            {"No", 2, "Line", "Large", "Odd", "1", "", "", ""},
            {"Msg", 3, "Line", "Small", "Even", "4094", "", "", ""},
            {"Yes", 1, "Circle", "Small", "Even", "2", "2", "", ""},
            {"Yes", 2, "Circle", "Large", "Odd", "4095", "4095", "", ""},
            {"Yes", 3, "Circle", "Small", "Even", "2", "2", "", ""},
            {"No", 1, "Circle", "Large", "Odd", "1", "1", "", ""},
            {"No", 2, "Circle", "Small", "Even", "4094", "4094", "", ""},
            {"Msg", 3, "Circle", "Large", "Odd", "1", "1", "", ""},
            {"No", 1, "Circle", "Small", "Odd", "1", "", "", ""},
            {"No", 2, "Circle", "Large", "Even", "4094", "", "", ""},
            {"Msg", 3, "Circle", "Small", "Odd", "1", "", "", ""},
            {"No", 1, "Circle", "Large", "Even", "4095", "4095", "", ""},
            {"No", 2, "Circle", "Small", "Odd", "2", "2", "", ""},
            {"Msg", 3, "Circle", "Large", "Even", "4095", "4095", "", ""},
            {"Yes", 1, "Square", "Large", "Odd", "4095", "4095", "4095", "4095"},
            {"Yes", 2, "Square", "Small", "Even", "2", "2", "2", "2"},
            {"Yes", 3, "Square", "Large", "Even", "4094", "4094", "4094", "4094"},
            {"No", 1, "Square", "Small", "Odd", "4095", "4095", "4095", "4095"},
            {"No", 2, "Square", "Large", "Even", "2", "2", "2", "2"},
            {"Msg", 3, "Square", "Small", "Odd", "4095", "4095", "4095", "4095"},
            {"No", 1, "Square", "Large", "Even", "4094", "", "", ""},
            {"No", 2, "Square", "Small", "Odd", "1", "", "", ""},
            {"Msg", 3, "Square", "Large", "Even", "4094", "", "", ""},
            {"No", 1, "Square", "Small", "Odd", "2", "2", "2", "2"},
            {"No", 2, "Square", "Large", "Even", "4095", "4095", "4095", "4095"},
            {"Msg", 3, "Square", "Small", "Odd", "2", "2", "2", "2"},
            {"Yes", 1, "Rectangle", "Small", "Odd", "1", "3", "1", "3"},
            {"Yes", 2, "Rectangle", "Large", "Even", "4094", "4092", "4094", "4092"},
            {"Yes", 3, "Rectangle", "Small", "Even", "2", "4", "2", "4"},
            {"No", 1, "Rectangle", "Large", "Odd", "1", "3", "1", "3"},
            {"No", 2, "Rectangle", "Small", "Even", "4094", "4092", "4094", "4092"},
            {"Msg", 3, "Rectangle", "Large", "Odd", "1", "3", "1", "3"},
            {"No", 1, "Rectangle", "Small", "Even", "2", "", "", ""},
            {"No", 2, "Rectangle", "Large", "Odd", "4095", "", "", ""},
            {"Msg", 3, "Rectangle", "Small", "Even", "2", "", "", ""},
            {"No", 1, "Rectangle", "Large", "Odd", "4094", "4092", "4094", "4092"},
            {"No", 2, "Rectangle", "Small", "Even", "1", "3", "1", "3"},
            {"Msg", 3, "Rectangle", "Small", "Odd", "2", "4", "2", "4"},
            {"Yes", 1, "Scalene", "Small", "Odd", "3", "5", "7", ""},
            {"Yes", 2, "Scalene", "Large", "Even", "4093", "4094", "4095", ""},
            {"Yes", 3, "Scalene", "Small", "Even", "3", "4", "5", ""},
            {"No", 1, "Scalene", "Large", "Odd", "3", "5", "7", ""},
            {"No", 2, "Scalene", "Small", "Even", "4093", "4094", "4095", ""},
            {"Msg", 3, "Scalene", "Large", "Odd", "3", "5", "7", ""},
            {"No", 1, "Scalene", "Small", "Even", "2", "", "", ""},
            {"No", 2, "Scalene", "Large", "Odd", "4095", "", "", ""},
            {"Msg", 3, "Scalene", "Small", "Even", "2", "", "", ""},
            {"No", 1, "Scalene", "Large", "Odd", "4093", "4094", "4095", ""},
            {"No", 2, "Scalene", "Small", "Even", "3", "5", "7", ""},
            {"Msg", 3, "Scalene", "Small", "Even", "3", "5", "7", ""},
    };
}

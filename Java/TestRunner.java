public class TestRunner {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    private static TestRunner instance;
    private static int failedTests;
    private static int allTests;

    private TestRunner() {
        failedTests = 0;
        allTests = 0;
    }

    public static synchronized TestRunner getInstance() {
        if (instance == null) {
            instance = new TestRunner();
        }
        return instance;
    }

    public <T> void assertEquals(T a1, T a2) {
        ++allTests;

        if (a1 == null && a2 == null) {
            return;
        }

        if (a1 != null && a2 == null || a1 == null && a2 != null) {
            ++failedTests;
            System.out.println(ANSI_YELLOW + "FAIL : " + a1 + " != " + a2 + ". Failed in line number: " + Thread.currentThread().getStackTrace()[2].getLineNumber() + ANSI_RESET);
            return;
        }

        if (!a1.equals(a2)) {
            ++failedTests;
            System.out.println(ANSI_YELLOW + "FAIL : " + a1 + " != " + a2 + ". Failed in line number: " + Thread.currentThread().getStackTrace()[2].getLineNumber() + ANSI_RESET);
        }
    }

    public void printStat() {
        System.out.println("Past: [" + (allTests - failedTests) + " / " + allTests + "]");
    }
}

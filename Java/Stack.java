public class Stack {


    public static void main(String[] args) {
        testStringStack();
        testIntegerStack();
        testPopStack();
        System.out.println(" === END === ");
        TestRunner.getInstance().printStat();
    }

    private static void testIntegerStack() {
        MyStack<Integer> myStack = new MyStack();
        myStack.push(124);
        TestRunner.getInstance().assertEquals(14, myStack.first());

        myStack.push(23);
        TestRunner.getInstance().assertEquals(23, myStack.first());
        myStack.pop();
        myStack.pop();
        TestRunner.getInstance().assertEquals(null, myStack.first());
    }

    private static void testPopStack() {
        MyStack<Integer> myStack = new MyStack();
        myStack.push(124);
        TestRunner.getInstance().assertEquals(124, myStack.first());

        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        TestRunner.getInstance().assertEquals(null, myStack.first());
    }

    private static void testStringStack() {
        MyStack<String> myStack = new MyStack();
        myStack.push("0");
        TestRunner.getInstance().assertEquals("0", myStack.first());

        myStack.push("1");
        TestRunner.getInstance().assertEquals("1", myStack.first());

        myStack.push("2");
        TestRunner.getInstance().assertEquals("2sf", myStack.first());

        myStack.push("3");
        myStack.push("4");
        myStack.push("5");

        myStack.pop();
        TestRunner.getInstance().assertEquals("4", myStack.first());

        myStack.pop();
        myStack.pop();
        TestRunner.getInstance().assertEquals("2", myStack.first());

        myStack.pop();
        TestRunner.getInstance().assertEquals("1", myStack.first());

        myStack.pop();
        TestRunner.getInstance().assertEquals("0", myStack.first());

        myStack.pop();
        TestRunner.getInstance().assertEquals(myStack.first(), null);

        myStack.push("488");
        TestRunner.getInstance().assertEquals(myStack.first(), "488");
    }

}

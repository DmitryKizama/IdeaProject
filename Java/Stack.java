public class Stack {


    public static void main(String[] args) {
//        testStringStack();
//        testIntegerStack();
//        testPopStack();
//        testMyArrayList();
        testMyLinkedList();
        System.out.println(" === END === ");
        TestRunner.getInstance().printStat();
    }

    public static void testMyLinkedList() {
        MyLinkedList<String> myLinkedList = new MyLinkedList();
        myLinkedList.add("zero");
        myLinkedList.add("second");
        TestRunner.getInstance().assertEquals("zero", myLinkedList.get(0));
    }

    private static void testMyArrayList() {
        MyArrayList<String> myArrayList = new MyArrayList();
        TestRunner.getInstance().assertEquals(null, myArrayList.get(0));
        myArrayList.add("some");
        myArrayList.add("some1");
        myArrayList.add("some2");
        myArrayList.add("some3");
        myArrayList.add("some4");
        myArrayList.add("some5");
        TestRunner.getInstance().assertEquals("some", myArrayList.get(0));
//        myArrayList.clear();
//        TestRunner.getInstance().assertEquals(null, myArrayList.get(0));
//        if (myArrayList.contains("some")) {
//            System.out.println("CONTAIN");
//        }
//        System.out.println("capacity = " + myArrayList.getCapacity());
//        System.out.println("size = " + myArrayList.size());
//        myArrayList.ensureCapacity(20);
//        System.out.println("capacity = " + myArrayList.getCapacity());
//        System.out.println("size = " + myArrayList.size());
//        System.out.println("index = " + myArrayList.indexOf("some32"));
//        System.out.println("no element = " + myArrayList.isEmpty());
//        myArrayList.clear();
//        System.out.println("no element = " + myArrayList.isEmpty());
        myArrayList.set(7, "sdgdf");
        TestRunner.getInstance().assertEquals("some", myArrayList.get(3));
        TestRunner.getInstance().assertEquals("some", myArrayList.get(4));
        TestRunner.getInstance().assertEquals("some4", myArrayList.get(5));
        System.out.println("capacity = " + myArrayList.getCapacity());
        myArrayList.trimToSize();
        System.out.println("capacity = " + myArrayList.getCapacity());
        myArrayList.add("sdsa");
        TestRunner.getInstance().assertEquals("sdsa", myArrayList.get(3));
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

public class Stack {

    public String list[];

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.add("0");
        myStack.add("1");
        myStack.add("2");
        myStack.add("3");
        myStack.add("4");
        myStack.add("5");
        System.out.println("get = " + myStack.get(0));
        myStack.delete();
        System.out.println("delete");
        myStack.delete();
        System.out.println("delete");
        myStack.delete();
        System.out.println("delete");
        myStack.delete();
        System.out.println("delete");
        System.out.println("get = " + myStack.get(0));
    }

    public void runStack() {

    }

}

public class Stack {

    public String list[];

    public static void main(String[] args) {
//        System.out.println("Hellow world");
        StackList stackList = new StackList();
//        System.out.println(stackList.getLength());
//        System.out.println(stackList.getSize());
        stackList.add("0");
        stackList.add("1");
        stackList.add("2");
        stackList.add("3");
        stackList.add("4");
        stackList.add("5");
        stackList.add("6");
        stackList.add("7");
        stackList.add("8");
        System.out.println("get by id = " + stackList.get(9));
    }

    public void runStack() {

    }

}

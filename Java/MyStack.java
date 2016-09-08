public class MyStack<T> {

    private static final int DEF_CAP = 16;

    private int currentId;
    private T[] list;
    private int capacity;

    public MyStack() {
        capacity = DEF_CAP;
        currentId = -1;
        list = (T[]) new Object[capacity];
    }

    public void push(T word) {
        if (currentId == capacity - 1) {
            T[] largerList = (T[]) new Object[2 * capacity];
            for (int i = 0; i < capacity; i++) {
                largerList[i] = list[i];
            }
            list = largerList;
        }

        list[++currentId] = word;
    }

    public T pop() {

        if(currentId == -1){
            return null;
        }

        T copy = list[currentId];
        list[currentId] = null;
        --currentId;

        return copy;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getLength() {
        return list.length;
    }

    public T first() {
        if(currentId == -1){
            return null;
        }

        return list[currentId];
    }

}

public class MyArrayList<T> {

    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final int CAPACITY = 2;

    private T[] list;
    private int current_capacity;
    private int current_id;

    public MyArrayList() {
        current_capacity = CAPACITY;
        current_id = -1;
        list = (T[]) new Object[current_capacity];
    }

    public void add(T word) {
//        System.out.println("Current id = " + current_id);
//        System.out.println("Current capacity = " + current_capacity);
        if (current_id == current_capacity - 1) {
            growCapacity();
        }
        list[++current_id] = word;
//        System.out.println("add element to position = " + current_id);
    }

    public void add(int index, T word) {
        if (list[index] == null) {
            list[++current_id] = word;
            return;
        }
        if (current_id == current_capacity - 1) {
            growCapacity();
        }
        for (int i = current_id; i >= index; i--) {
            list[i + 1] = list[i];
        }
        list[index] = word;
    }

    public void clear() {
        current_capacity = CAPACITY;
        current_id = -1;
        list = (T[]) new Object[current_capacity];
    }

    public boolean contains(Object o) {
        for (int i = 0; i <= current_id; i++) {
            if (list[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    public void ensureCapacity(int minCapacity) {
        current_capacity = current_capacity + minCapacity;
    }

    public int size() {
        return current_id + 1;
    }

    public int getCapacity() {
        return current_capacity;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < current_id; i++) {
            if (list[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        if (current_id == -1) {
            return true;
        }
        return false;
    }

    public void remove(int index) {
        for (int i = index; i < size(); i++) {
            list[i] = list[i + 1];
        }
    }

    public void remove(Object o) {
        int index = -1;
        for (int i = 0; i < size(); i++) {
            if (list[i].equals(o)) {
                index = i;
            }
        }
        if (index == -1) {
            return;
        } else {
            remove(index);
        }
    }

    public void removeRange(int fromIndex, int toIndex) {
        
    }

    private void growCapacity() {
//        System.out.println(ANSI_RED + "Grow capacity" + ANSI_RESET);
        T[] largerList = (T[]) new Object[current_capacity * 2];
        for (int i = 0; i <= current_id; i++) {
            largerList[i] = list[i];
        }
        current_capacity = current_capacity * 2;
        list = largerList;
    }

    public T get(int id) {
        if (list[id] == null) {
            return null;
        }
        return list[id];
    }
}

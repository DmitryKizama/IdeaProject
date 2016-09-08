public class MyStack {

    private String[] list;
    private int capacity;

    public MyStack() {
        capacity = 1;
        list = new String[capacity];
    }

    public void add(String word) {
        String[] largerList = new String[capacity + 1];
        for (int i = 0; i < capacity; i++) {
            largerList[i + 1] = list[i];
        }
        list = largerList;
        capacity++;
        list[0] = word;
    }

    public void delete(){
        String[] lowList = new String[capacity - 1];
        for (int i = 0; i < list.length - 1; i++) {
            lowList[i] = list[i + 1];
        }
        list = lowList;
        capacity--;
    }

    public int getSize() {
        return capacity;
    }

    public int getLength() {
        return list.length;
    }

    public String get(int id) {
        if (id > capacity) {
            return "OUT OF BOUND EXCEPTION";
        }
        if (list[id] == null) {
            return "Doesn`t exist";
        }
        return list[id];
    }
}

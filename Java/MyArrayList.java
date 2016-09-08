public class MyArrayList {

    private String[] list;
    private int current_capacity;
    private int current_id;

    public MyArrayList() {
        current_capacity = 5;
        current_id = 0;
        list = new String[current_capacity];
    }

    public void add(String word) {
        System.out.println("push method, id = " + current_id);
        if (current_id == current_capacity) {
            System.out.println("grow capacity");
            String[] largerList = new String[current_capacity + 10];
            for (int i = 0; i < current_id; i++) {
                largerList[i] = list[i];
            }
            current_capacity = current_capacity + 10;
            list = largerList;
        }
        list[current_id] = word;
        current_id++;
    }

    public int getCapacity() {
        return current_capacity;
    }

    public int getLength() {
        return list.length;
    }

    public String get(int id) {
        if (id > current_capacity){
            return "OUT OF BOUND EXCEPTION";
        }
        if (list[id] == null) {
            return "Doesn`t exist";
        }
        return list[id];
    }
}

import java.util.ArrayList;

public class MyLinkedList<E> {

    private int counter = -1;
    private Item lastItem;
    private ArrayList<Item> list = new ArrayList();

    private class Item {
        private Item previous;
        private Item next;
        public E element;

        public Item(Item previous) {
            this.previous = previous;
            next = null;
        }

        public void addElement(E element) {
            this.element = element;
        }

        public E getElement() {
            return element;
        }
    }

    public MyLinkedList() {
        Item item = new Item(null);
    }

    public void add(E e) {
        Item item = new Item(lastItem);
        item.addElement(e);
        ++counter;
        list.add(item);
        lastItem = item;
    }

    public E get(int index) {
        if (index >= list.size()) {
            return null;
        }
        return list.get(index).getElement();
    }
}

public class LinkedList {
    private int length;
    private Node first;
    private Node last;

    public LinkedList() {
        this.first = null;
        this.last = null;
        this.length = 0;
    }

    public int size() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void add(Object o) {
        Node element = (Node) o;
        if (first == null)
            first = element;
        else
            last.next = element;
        last = element;
        length++;
    }

    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    public int indexOf(Object o) {
        int index = 0;
        if (!(o instanceof Node))
            return -1;
        Node element = first;
        while (element != null) {
            if (element.equals(o)){
                return index;
            }
            index++;
            element = element.next;
        }
        return -1;
    }

    public Object get(int index) {
        int count = 0;
        if (index < 0 || index >= size())
            throw new IndexOutOfBoundsException("index: " + index + " doesn't exist.");
        Node element = first;
        while (count != index) {
            element = element.next;
            count++;
        }
        return element;
    }
}

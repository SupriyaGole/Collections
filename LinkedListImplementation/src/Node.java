public class Node<Type> {

    public Type value;
    public Node next;
    public Node previous;

    public Node(Type value) {
        this.value = value;
        this.next = null;
        this.previous = null;
    }
}

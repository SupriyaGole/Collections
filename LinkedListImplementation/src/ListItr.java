public class ListItr {
    private Node currentNode;
    public Node nextNode = null;
    private int nextIndex;
    private LinkedList list;

    public ListItr(int index, LinkedList list) {
        this.list = list;
        currentNode = (index == list.size()) ? null : (Node) list.get(index);
        nextIndex = index;
        nextNode = null;
    }


    public boolean hasNext() {
        return nextIndex < list.size();
    }

    public Object next() throws Exception {
        if (hasNext()) {
            nextNode = currentNode;
            currentNode = nextNode.next;
            nextIndex++;
            return nextNode;
        } else {
            throw new Exception("Next element is not available");
        }

    }

    public boolean hasPrevious() {
        return nextIndex > 0;
    }

    public Object previous() throws Exception {
        if (hasPrevious()) {
            nextNode = currentNode;
            currentNode = nextNode.previous;
            nextIndex--;
            return nextNode;
        } else {
            throw new Exception("Previous element is not available");
        }
    }
}
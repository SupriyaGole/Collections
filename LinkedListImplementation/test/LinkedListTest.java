import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {
    @Test
    public void add_adds_the_given_element_into_the_list() throws Exception {
        LinkedList linkedList = new LinkedList();
        Node<String> firstNode = new Node<>("firstNode");
        linkedList.add(firstNode);
        assertEquals(linkedList.size(), 1);
    }

    @Test
    public void addFirst_adds_the_given_element_to_the_starting_of_list() throws Exception {
        LinkedList linkedList = new LinkedList();
        Node<String> firstNode = new Node<>("firstNode");
        linkedList.addFirst(firstNode);
        Node<String> secondNode = new Node<>("secondNode");
        linkedList.addFirst(secondNode);
        assertEquals(linkedList.size(), 2);
    }

    @Test
    public void addLast_adds_the_given_element_to_the_end_of_list() throws Exception {
        LinkedList linkedList = new LinkedList();
        Node<String> firstNode = new Node<>("firstNode");
        linkedList.addLast(firstNode);

        Node<String> secondNode = new Node<>("secondNode");
        linkedList.addLast(secondNode);
        assertEquals(linkedList.size(), 2);
    }

    @Test
    public void contains_checks_if_the_given_element_is_present_in_the_list_or_not_for_doubly_linked_list_add_first() throws Exception {
        LinkedList linkedList = new LinkedList();
        Node<String> firstNode = new Node<>("firstNode");
        Node<String> secondNode = new Node<>("secondNode");
        Node<String> thirdNode = new Node<>("thirdNode");
        linkedList.addFirst(firstNode);
        linkedList.addFirst(secondNode);

        assertEquals(linkedList.contains(firstNode), true);
        assertEquals(linkedList.contains(secondNode), true);
        assertEquals(linkedList.contains(thirdNode), false);
    }


    @Test
    public void contains_checks_if_the_given_element_is_present_in_the_list_or_not_for_doubly_linked_list_add_last() throws Exception {
        LinkedList linkedList = new LinkedList();
        Node<String> firstNode = new Node<>("firstNode");
        Node<String> secondNode = new Node<>("secondNode");
        Node<String> thirdNode = new Node<>("thirdNode");
        linkedList.addLast(firstNode);
        linkedList.addLast(secondNode);

        assertEquals(linkedList.contains(firstNode), true);
        assertEquals(linkedList.contains(secondNode), true);
        assertEquals(linkedList.contains(thirdNode), false);
    }


    @Test
    public void contains_checks_if_the_given_element_is_present_in_the_list() throws Exception {
        LinkedList linkedList = new LinkedList();
        Node<String> firstNode = new Node<>("firstNode");
        Node<String> secondNode = new Node<>("secondNode");
        Node<String> thirdNode = new Node<>("thirdNode");
        linkedList.add(firstNode);
        linkedList.add(secondNode);

        assertEquals(linkedList.contains(firstNode), true);
        assertEquals(linkedList.contains(secondNode), true);
        assertEquals(linkedList.contains(thirdNode), false);
    }

    @Test
    public void indexOf_gives_the_index_of_given_element_in_the_list_for_doubly_linked_list_addFirst() throws Exception {
        LinkedList linkedList = new LinkedList();
        Node<String> firstNode = new Node<>("firstNode");
        Node<String> secondNode = new Node<>("secondNode");
        linkedList.addFirst(firstNode);
        linkedList.addFirst(secondNode);

        assertEquals(linkedList.indexOf(firstNode), 1);
        assertEquals(linkedList.indexOf(secondNode), 0);
    }

    @Test
    public void indexOf_gives_the_index_of_given_element_in_the_list_for_doubly_linked_list_addLast() throws Exception {
        LinkedList linkedList = new LinkedList();
        Node<String> firstNode = new Node<>("firstNode");
        Node<String> secondNode = new Node<>("secondNode");
        linkedList.addLast(firstNode);
        linkedList.addLast(secondNode);

        assertEquals(linkedList.indexOf(firstNode), 0);
        assertEquals(linkedList.indexOf(secondNode), 1);
    }

    @Test
    public void indexOf_gives_the_index_of_given_element_in_the_list() throws Exception {
        LinkedList linkedList = new LinkedList();
        Node<String> firstNode = new Node<>("firstNode");
        Node<String> secondNode = new Node<>("secondNode");
        linkedList.add(firstNode);
        linkedList.add(secondNode);

        assertEquals(linkedList.indexOf(firstNode), 0);
        assertEquals(linkedList.indexOf(secondNode), 1);
    }

    @Test
    public void indexOf_gives_the_minus_one_if_given_element_is_not_present_in_the_list() throws Exception {
        LinkedList linkedList = new LinkedList();
        Node<String> firstNode = new Node<>("firstNode");

        assertEquals(linkedList.indexOf(firstNode), -1);
        assertEquals(linkedList.indexOf("invisible"), -1);
    }

    @Test
    public void get_returns_the_element_on_given_index() throws Exception {
        LinkedList linkedList = new LinkedList();
        Node<String> firstNode = new Node<>("firstNode");
        linkedList.add(firstNode);

        Node<String> secondNode = new Node<>("secondNode");
        linkedList.add(secondNode);
        assertEquals(linkedList.get(0), firstNode);
        assertEquals(linkedList.get(1), secondNode);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void get_throws_IndexOutOfBoundException_when_given_index_is_invalid() throws Exception {
        try {
            LinkedList linkedList = new LinkedList();
            Node<String> firstNode = new Node<>("firstNode");
            linkedList.add(firstNode);

            Node<String> secondNode = new Node<>("secondNode");
            linkedList.add(secondNode);
            linkedList.get(2);
        }catch (IndexOutOfBoundsException e){
            assertEquals(e.getMessage(),"index: 2 doesn't exist.");
            throw e;
        }
    }

    @Test
    public void isEmpty_returns_true_when_list_is_empty() {
        LinkedList linkedList = new LinkedList();
        assertEquals(true, linkedList.isEmpty());
    }

    @Test
    public void isEmpty_returns_false_when_list_is_empty() {
        LinkedList linkedList = new LinkedList();
        Node<String> firstNode = new Node<>("firstNode");
        linkedList.add(firstNode);
        assertEquals(false, linkedList.isEmpty());
    }

    @Test
    public void remove_removes_the_element_from_specified_index0() {
        LinkedList linkedList = new LinkedList();
        Node<String> firstNode = new Node<>("firstNode");
        linkedList.add(firstNode);

        Node<String> secondNode = new Node<>("secondNode");
        linkedList.add(secondNode);
        assertEquals(linkedList.remove(0),firstNode);
    }

    @Test
    public void remove_removes_the_element_from_specified_index1() {
        LinkedList linkedList = new LinkedList();
        Node<String> firstNode = new Node<>("firstNode");
        linkedList.add(firstNode);

        Node<String> secondNode = new Node<>("secondNode");
        linkedList.add(secondNode);
        assertEquals(linkedList.remove(1),secondNode);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void remove_throws_error_when_index_is_invalid() {
        try {
            LinkedList linkedList = new LinkedList();
            Node<String> firstNode = new Node<>("firstNode");
            linkedList.add(firstNode);

            Node<String> secondNode = new Node<>("secondNode");
            linkedList.add(secondNode);
            assertEquals(linkedList.remove(3),secondNode);
        }catch (IndexOutOfBoundsException e){
            assertEquals(e.getMessage(),"index: 2 doesn't exist.");
            throw e;
        }
    }

    @Test
    public void get_returns_the_element_on_given_index_for_doubly_linked_list_add_first() throws Exception {
        LinkedList linkedList = new LinkedList();
        Node<String> firstNode = new Node<>("firstNode");
        linkedList.addFirst(firstNode);

        Node<String> secondNode = new Node<>("secondNode");
        linkedList.addFirst(secondNode);
        assertEquals(linkedList.get(0), secondNode);
        assertEquals(linkedList.get(1), firstNode);
    }

    @Test
    public void get_returns_the_element_on_given_index_for_doubly_linked_list_add_last() throws Exception {
        LinkedList linkedList = new LinkedList();
        Node<String> firstNode = new Node<>("firstNode");
        linkedList.addLast(firstNode);

        Node<String> secondNode = new Node<>("secondNode");
        linkedList.addLast(secondNode);
        assertEquals(linkedList.get(0), firstNode);
        assertEquals(linkedList.get(1), secondNode);
    }

    @Test
    public void remove_removes_element_from_specif_index_for_doubly_linked_list_when_element_added_from_first() throws Exception {
        LinkedList linkedList = new LinkedList();
        Node<String> firstNode = new Node<>("firstNode");
        linkedList.addFirst(firstNode);

        Node<String> secondNode = new Node<>("secondNode");
        linkedList.addFirst(secondNode);
        assertEquals(linkedList.remove(0), secondNode);
    }

    @Test
    public void listIterator_iterates_over_the_list_element_from_specified_index_from_starting() throws Exception {
        LinkedList linkedList = new LinkedList();
        Node<String> firstNode = new Node<>("firstNode");
        linkedList.add(firstNode);

        Node<String> secondNode = new Node<>("secondNode");
        linkedList.add(secondNode);
        ListItr iterator = linkedList.listIterator(0);
        String[] values = {"firstNode","secondNode"};
        int i=0;
        while(iterator.hasNext()){
            Object element = iterator.next();
            Node element1 = (Node) element;
            assertEquals(element1.value,values[i]);
            i++;
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void listIterator_throws_exception_when_index_is_greater_than_array_size(){
        try {
            LinkedList linkedList = new LinkedList();
            Node<String> firstNode = new Node<>("firstNode");
            linkedList.add(firstNode);
            linkedList.listIterator(2);
        }catch (IndexOutOfBoundsException e){
            assertEquals(e.getMessage(),"index: 2 doesn't exist.");
            throw e;
        }
    }

    @Test(expected = Exception.class)
    public void next_returns_null_when_hasNext_is_false() throws Exception{
        try {
            LinkedList linkedList = new LinkedList();
            ListItr iterator = linkedList.listIterator(0);
            iterator.next();
        }catch (Exception e){
            assertEquals(e.getMessage(),"Next element is not available");
            throw e;
        }
    }


    @Test
    public void listIterator_iterates_over_the_list_element_from_specified_index_from_ending() throws Exception {
        LinkedList linkedList = new LinkedList();
        Node<String> firstNode = new Node<>("firstNode");
        linkedList.add(firstNode);

        Node<String> secondNode = new Node<>("secondNode");
        linkedList.add(secondNode);
        ListItr iterator = linkedList.listIterator(1);
        String[] values = {"secondNode","firstNode"};
        int i=0;
        while(iterator.hasPrevious()){
            Object element = iterator.previous();
            Node element1 = (Node) element;
            assertEquals(element1.value,values[i]);
            i++;
        }
    }

    @Test(expected = Exception.class)
    public void iterator_throws_exception_when_asking_for_iterating_from_invalid_index() throws Exception {
        try {
            LinkedList linkedList = new LinkedList();
            ListItr iterator = linkedList.listIterator(1);
        }catch (Exception e){
            assertEquals(e.getMessage(),"index: 1 doesn't exist.");
            throw e;
        }
    }
}

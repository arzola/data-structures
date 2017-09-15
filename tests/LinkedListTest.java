import org.junit.Test;
import mx.icode.LinkedList;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test
    public void linkedListStartsWithHead() throws Exception {
        LinkedList list = new LinkedList(44);
        assertEquals("[HEAD {44}]", list.printList());
    }

    @Test
    public void anElementIsAppendedToTheList() throws Exception {
        LinkedList list = new LinkedList(0);
        list.append(1);
        assertEquals("[HEAD {0}]->{1}", list.printList());
    }

    @Test
    public void threeElementsAreAppendedToTheList() throws Exception {
        LinkedList list = new LinkedList(1);
        list.append(389).append(22).append(44);
        assertEquals("[HEAD {1}]->{389}->{22}->{44}", list.printList());
    }

}
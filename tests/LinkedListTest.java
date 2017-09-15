import org.junit.Test;
import mx.icode.LinkedList;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test
    public void it_starts_with_the_head() throws Exception {
        LinkedList list = new LinkedList(44);
        assertEquals("[HEAD {44}]", list.printList());
    }

    @Test
    public void an_element_is_inserted_to_the_list() throws Exception {
        LinkedList list = new LinkedList(0);
        list.append(1);
        assertEquals("[HEAD {0}]->{1}", list.printList());
    }

    @Test
    public void multiple_elements_can_be_inserted() throws Exception {
        LinkedList list = new LinkedList(1);
        list.append(389).append(22).append(44);
        assertEquals("[HEAD {1}]->{389}->{22}->{44}", list.printList());
    }

    @Test
    public void an_element_can_be_inserted_at_head() throws Exception {
        LinkedList list = new LinkedList(0);
        list.append(1);
        assertEquals("[HEAD {0}]->{1}",list.printList());
        list.appendFirst(666);
        assertEquals("[HEAD {666}]->{0}->{1}",list.printList());
    }

    @Test
    public void head_can_be_replaced() throws Exception {
        LinkedList list = new LinkedList(3);
        list.append(1).append(5).append(6);
        assertEquals("[HEAD {3}]->{1}->{5}->{6}",list.printList());
        list.replaceHead(98);
        assertEquals("[HEAD {98}]->{1}->{5}->{6}",list.printList());
    }

}
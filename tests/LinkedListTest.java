import org.junit.Test;
import mx.icode.LinkedList;

import static org.junit.Assert.*;

public class LinkedListTest{
    @Test
    public void linkedListStartsWithHead() throws Exception {
        LinkedList list = new LinkedList();
        assertEquals("[HEAD {0}]",list.printList());
    }

}
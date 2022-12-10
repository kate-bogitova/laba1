import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayTest {

    @Test
    void add() {
        Array<Integer> intArrList = new Array<> ();

        intArrList.add(0);
        intArrList.add(2);
        intArrList.add(4);

        assertEquals(4,intArrList.get(2));
    }

    @Test
    void capacity() {
        Array<Integer> intArrList = new Array<> ();

        intArrList.add(0);
        intArrList.add(2);
        intArrList.add(4);
        intArrList.add(6);
        intArrList.add(8);

        assertEquals(5,intArrList.capacity());
    }

    @Test
    void getByIndex() {
        Array<Integer> intArrList = new Array<> ();

        intArrList.add(0);
        intArrList.add(2);
        intArrList.add(4);
        intArrList.add(6);

        assertEquals(4,intArrList.get(2));
    }

    @Test
    void remove() {
        Array<Integer> intArrList = new Array<> ();

        intArrList.add(0);
        intArrList.add(2);
        intArrList.add(4);
        intArrList.add(6);
        intArrList.add(8);

        intArrList.remove(3);
        assertEquals(8,intArrList.get(3));
    }
}

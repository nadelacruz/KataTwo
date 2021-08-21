import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryChopTest {
    BinaryChop binaryChop;

    @Before
    public void init() {
        binaryChop = new BinaryChop();
    }

    @Test
    public void testChop() {
        assertEquals(-1, binaryChop.chop(3, new int[]{}));
        assertEquals(-1, binaryChop.chop(3, new int[]{1}));
        assertEquals(0,  binaryChop.chop(1, new int[]{1}));

        assertEquals(0,  binaryChop.chop(1, new int[]{1, 3, 5}));
        assertEquals(1,  binaryChop.chop(3, new int[]{1, 3, 5}));
        assertEquals(2,  binaryChop.chop(5, new int[]{1, 3, 5}));
        assertEquals(-1, binaryChop.chop(0, new int[]{1, 3, 5}));
        assertEquals(-1, binaryChop.chop(2, new int[]{1, 3, 5}));
        assertEquals(-1, binaryChop.chop(4, new int[]{1, 3, 5}));
        assertEquals(-1, binaryChop.chop(6, new int[]{1, 3, 5}));

        assertEquals(0,  binaryChop.chop(1, new int[]{1, 3, 5, 7}));
    }
}

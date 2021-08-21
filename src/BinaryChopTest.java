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
    public void testChopOne() {
        assertEquals(-1, binaryChop.chop(3, new int[]{}));
    }

    @Test
    public void testChopTwo() {
        assertEquals(-1, binaryChop.chop(3, new int[]{1}));
    }

    @Test
    public void testChopThree() {
        assertEquals(0,  binaryChop.chop(1, new int[]{1}));
    }

    @Test
    public void testChopFour() {
        assertEquals(0,  binaryChop.chop(1, new int[]{1, 3, 5}));
    }

    @Test
    public void testChopFive() {
        assertEquals(1,  binaryChop.chop(3, new int[]{1, 3, 5}));
    }

    @Test
    public void testChopSix() {
        assertEquals(2,  binaryChop.chop(5, new int[]{1, 3, 5}));
    }

    @Test
    public void testChopSeven() {
        assertEquals(-1, binaryChop.chop(0, new int[]{1, 3, 5}));
    }

    @Test
    public void testChopEight() {
        assertEquals(-1, binaryChop.chop(2, new int[]{1, 3, 5}));
    }

    @Test
    public void testChopNine() {
        assertEquals(-1, binaryChop.chop(4, new int[]{1, 3, 5}));
    }

    @Test
    public void testChopTen() {
        assertEquals(-1, binaryChop.chop(6, new int[]{1, 3, 5}));
    }

    @Test
    public void testChopEleven() {
        assertEquals(0,  binaryChop.chop(1, new int[]{1, 3, 5, 7}));
    }
}

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class DiceTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void DiceTossAndSumTest() {
        Dice dice = new Dice(2);
        Random r = new Random();
        r.setSeed(24);
        Integer v1 = dice.tossAndSum();
        assertEquals(v1, dice.tossAndSum());
    }
}